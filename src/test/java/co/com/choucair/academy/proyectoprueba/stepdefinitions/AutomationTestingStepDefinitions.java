package co.com.choucair.academy.proyectoprueba.stepdefinitions;

import co.com.choucair.academy.proyectoprueba.model.AutomationTestingData;
import co.com.choucair.academy.proyectoprueba.questions.Respuesta;
import co.com.choucair.academy.proyectoprueba.tasks.Abrir;
import co.com.choucair.academy.proyectoprueba.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationTestingStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^ingresar a la pagina de Automation Demo Site$")
    public void ingresarALaPaginaDeAutomationDemoSite() throws Exception {
        OnStage.theActorCalled("user1").wasAbleTo(Abrir.sitioWeb());
    }

    @When("^el usuario digita su informacion en la plataforma$")
    public void elUsuarioDigitaSuInformacionEnLaPlataforma(List<AutomationTestingData> automationTestingData) throws Exception {
        OnStage.theActorCalled("user1").attemptsTo(Registro.enSitioWeb(automationTestingData.get(0).getStrFirstName(),
                automationTestingData.get(0).getStrLastName(),
                automationTestingData.get(0).getStrAddress(),
                automationTestingData.get(0).getStrEmail(),
                automationTestingData.get(0).getStrPhone(),
                automationTestingData.get(0).getStrPassword(),
                automationTestingData.get(0).getStrConfirmPassword()));
    }

    @Then("^el usuario accede a la pestana WEBTABLE$")
    public void elUsuarioAccedeALaPestanaWEBTABLE(List<AutomationTestingData> automationTestingData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.tituloPagina(automationTestingData.get(0).getStrNamePage())));
    }

}
