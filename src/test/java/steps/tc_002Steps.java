package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;
import utils.DriverFactory;

public class tc_002Steps {
    private tc_002Page page;

    public tc_002Steps() {
        this.page = new tc_002Page(DriverFactory.getDriver());
    }

    @Given("Estoy en la página de cálculo de montos")
    public void estoy_en_la_pagina_de_calculo_de_montos() {
        page.navigateToPage();
    }

    @When("Ingreso {string} en el campo de monto acumulado")
    public void ingreso_en_el_campo_de_monto_acumulado(String montoAcumulado) {
        page.setMontoAcumulado(montoAcumulado);
    }

    @When("Ingreso {string} en el campo de monto de reserva actual")
    public void ingreso_en_el_campo_de_monto_de_reserva_actual(String montoReserva) {
        page.setMontoReserva(montoReserva);
    }

    @Then("El sistema debe mostrar {string} en el campo de monto acumulado")
    public void el_sistema_debe_mostrar_en_el_campo_de_monto_acumulado(String montoEsperado) {
        Assert.assertEquals(montoEsperado, page.getMontoAcumulado());
    }

    @Then("El sistema debe mostrar {string} en el campo de monto de reserva actual")
    public void el_sistema_debe_mostrar_en_el_campo_de_monto_de_reserva_actual(String montoEsperado) {
        Assert.assertEquals(montoEsperado, page.getMontoReserva());
    }

    @When("Verifico el cálculo de la nueva columna")
    public void verifico_el_calculo_de_la_nueva_columna() {
        page.calculateMontoAcumuladoFolio();
    }

    @Then("El resultado mostrado debe ser {string}")
    public void el_resultado_mostrado_debe_ser(String resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado, page.getMontoAcumuladoFolio());
    }
}