package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página de cálculo")
    public void el_usuario_esta_en_la_pagina_de_calculo() {
        page.navigateToCalcPage();
    }

    @When("ingresa el valor máximo en los campos de pago, acumulado y reserva")
    public void ingresa_el_valor_maximo_en_los_campos() {
        page.enterMaxValues();
    }

    @When("ejecuta todos los cálculos de fórmulas")
    public void ejecuta_todos_los_calculos_de_formulas() {
        page.executeCalculations();
    }

    @Then("el sistema acepta los valores sin errores de desbordamiento")
    public void el_sistema_acepta_los_valores_sin_errores_de_desbordamiento() {
        assertTrue(page.isAcceptedWithoutOverflow());
    }

    @Then("el reporte muestra los resultados correctos y precisos")
    public void el_reporte_muestra_los_resultados_correctos_y_precisos() {
        assertTrue(page.resultsAreCorrect());
    }
}