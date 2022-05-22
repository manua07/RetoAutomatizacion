package co.sophos.banitsmo.certificate.stepsdefinitions;

import co.sophos.banitsmo.certificate.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.sophos.banitsmo.certificate.userinterface.ReportePetroleoPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReportePetroleoStepsDefinitions {


    @Managed (driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^Se va a descargar un reporte de petroleo$")
    public void descargarReportePetroleo() {
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @When("^Se ingresa a la opcion empresa$")
    public void ingresaOpcionEmpresa() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_EMPRESAS));
    }

    @And("^Se selecciona la opcion capital inteligente$")
    public void seleccionaOpcionCapital() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CAPITAL));
        Thread.sleep(4000);
       }

    @And("^Se selecciona la opcion actualidad economica$")
    public void seleccionaOpcionActualidad() {
        actor.attemptsTo(Click.on(BUTTON_ACTUALIDAD));
      }

    @And("^Se busca el reporte de petroleo$")
    public void buscaReportePetroleo() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_VER_MAS));
        actor.attemptsTo(Click.on(BUTTON_VER_MAS));
        actor.attemptsTo(Click.on(BUTTON_VER_MAS));
        actor.attemptsTo(Click.on(BUTTON_REPORTE));
        Thread.sleep(3000);

    }

    @And("^Se descarga el reporte$")
    public void descargaReporte() {
        actor.attemptsTo(Click.on(BUTTON_DESCARGAR));
    }

    @Then("^El usuario debe ver el reporte descargado con mensaje (.*)$")
    public void userVeReporteDescargado(String message) {
        actor.attemptsTo(
                Ensure.that(NOMBRE_VALIDACION).text().isEqualTo(message));
    }
}
