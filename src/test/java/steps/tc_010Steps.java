package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page;

    @Given("que el usuario está en la página de actualización de datos")
    public void usuarioEnPaginaActualizacionDatos() {
        page = new tc_010Page(driver);
        page.irAPaginaDeActualizacionDeDatos();
    }

    @When("el usuario actualiza los datos que activan el recalculo de fórmulas")
    public void usuarioActualizaDatos() {
        page.actualizarDatosParaRecalculo();
    }

    @Then("el sistema debe registrar en el log la ejecución del cálculo y la actualización de las fórmulas")
    public void verificarRegistroEnLog() {
        page.verificarRegistroEnLog();
    }

    @Then("verificar en la sección de auditoría que se generó un registro detallado de la acción")
    public void verificarRegistroAuditoria() {
        page.verificarRegistroAuditoria();
    }
}