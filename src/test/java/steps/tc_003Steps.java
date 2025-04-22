package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page tc003Page = new tc_003Page(driver);

    @Given("^que ingreso todos los valores de IVA, incluyendo los sujetos a ser acumulados y el IVA retenido$")
    public void ingresarValoresIVA() {
        tc003Page.ingresarValoresIVA();
    }

    @When("^ejecuto el cálculo de la fórmula 'IVA Acumulado'$")
    public void ejecutarCalculoIVA() {
        tc003Page.ejecutarCalculoIVA();
    }

    @Then("^el sistema debe calcular el IVA acumulado sumando todos los IVA menos el IVA retenido$")
    public void verificarCalculoIVA() {
        boolean isValid = tc003Page.validarCalculoIVA();
        Assert.assertTrue("El cálculo del IVA acumulado es incorrecto", isValid);
    }
}