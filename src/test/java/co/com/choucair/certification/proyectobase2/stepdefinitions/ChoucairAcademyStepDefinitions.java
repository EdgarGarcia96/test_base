package co.com.choucair.certification.proyectobase2.stepdefinitions;

import co.com.choucair.certification.proyectobase2.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase2.questions.Answer;
import co.com.choucair.certification.proyectobase2.tasks.Login;
import co.com.choucair.certification.proyectobase2.tasks.OpenUp;
import co.com.choucair.certification.proyectobase2.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Arturo").wasAbleTo(OpenUp.thePage(), (Login.onThePage(
                academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword()
                )));
    }

    @When("^he search for the course on the Choucair academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResources(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
