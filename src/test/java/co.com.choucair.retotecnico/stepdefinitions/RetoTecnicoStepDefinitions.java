package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.retotecnico.model.AcademyChoucairData;
import co.com.choucair.retotecnico.tasks.Login;
import co.com.choucair.retotecnico.tasks.OpenUp;
import co.com.choucair.retotecnico.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.when;
import net.Serenitybdd.screenplay.GivenWhenthen;
import net.Serenitybdd.screenplay.actors.OnStage;
import net.Serenitybdd.screenplay.actors.OnLineCast;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^than  carlos wants to user registration automation at the Utest.com$")
    public void thanCarlosWantToUserRegistrationAutomationAtTheUtest.com(List<UtestData> utestData)
            throws Exception{ co.com.choucair.certification.retotecnico.tasks.Login login;
        OnStage.theActorcalled("Carlos").wasAbleTo(OpenUp.thePage(), co.com.choucair.certification.retotecnico.tasks.Login.
                onThePage(utestdata.get(0).getStrUser(),utestData.get(0).getStrPassword()));

    }

    @When("^ he search registration for   (.*) on the  Utest.com platform$")
    public void  heSearchRegistrationForOnTheUtest.comPlatform(List<utestData> utestData)
            throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(UtestData.get(0).getStrRegistration()));
    }

    @Then("^she finds the registration called$")
    public void sheFindsTheRegistrationCalledResourcesRecursosAutomatizaciònUtest(List<UtestData> utestData)
            throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(co.com.choucair.choucair.certification.retotecnico.questions.Answer.toThe(utestData.get(0).getStrRegistration())));
    }

