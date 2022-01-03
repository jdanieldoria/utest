package co.com.choucair.certification.reto.stepdefinitions;
import co.com.choucair.certification.reto.model.Data;
import co.com.choucair.certification.reto.questions.Answer;
import co.com.choucair.certification.reto.tasks.JoinUs;
import co.com.choucair.certification.reto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than jesus wants to register in utest\\.com$")
    public void thanJesusWantsToRegisterInUtestCom() throws Exception {
        OnStage.theActorCalled( "Jesus").wasAbleTo(OpenUp.thePage());
    }


    @When("^he fill out the fields of the registration form$")
    public void heFillOutTheFieldsOfTheRegistrationForm(List<Data> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinUs.OnThePage(
                utestData.get(0).getStrName(), utestData.get(0).getStrLastName(),utestData.get(0).getStrEmail(),
                utestData.get(0).getStrMonthBirthday(),utestData.get(0).getStrDayBirthday(),utestData.get(0).getStrYearBirthday(),
                utestData.get(0).getStrCity(), utestData.get(0).getStrCodPostal(), utestData.get(0).getStrPassword()));
    }

    @Then("^he looks at the utest splash screen$")
    public void heLooksAtTheUtestSplashScreen(String questions) throws  Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(questions)));
    }
}
