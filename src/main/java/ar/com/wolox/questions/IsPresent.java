package ar.com.wolox.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class IsPresent implements Question<Boolean> {
    Target target;
    public IsPresent(Target target){
        this.target=target;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(target, WebElementStateMatchers.isEnabled()).forNoMoreThan(20).seconds());
        return target.resolveFor(actor).isPresent();
    }

    public static IsPresent isPresent(Target target) {
        return new IsPresent(target);
    }
}