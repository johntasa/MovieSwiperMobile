Feature: Login on movie swiper app

  @LoginSuccessfully
  Scenario: Login successfully
    Given the user open movie swiper app
    When enter your credentials
    Then the user validates profile button on home page