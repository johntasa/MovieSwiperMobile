package ar.com.wolox.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class MainStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^the user open movie swiper app$")
    public void theUserOpenMovieSwiperApp() {
    }

    @When("^enter your credentials$")
    public void enterYourCredentials() {
    }

    @Then("^the user validates profile button on home page$")
    public void theUserValidatesProfileButtonOnHomePage() {
    }
}
