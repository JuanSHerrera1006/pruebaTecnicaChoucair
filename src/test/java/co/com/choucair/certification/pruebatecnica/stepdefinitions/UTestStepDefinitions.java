package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I wants to have a uTest user")
    public void iWantsToHaveAUTestUser() {
        OnStage.theActorCalled("I")
                .wasAbleTo(
                        OpenUp.thePage(),
                        GoSignUp.onThePage()
                );
    }

    @When("I fill sign up form")
    public void iFillSignUpForm() {
        OnStage
                .theActorInTheSpotlight()
                .attemptsTo(
                        FillPersonalData.formStep1(),
                        FillAddressData.formStep2(),
                        FillDeviceData.formStep3(),
                        FillFinalData.formStep4()
                );
    }

    @Then("^I should give the welcome message: \"(.*)\"$")
    public void iShouldGiveTheWelcomeMessage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
