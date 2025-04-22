package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("el usuario está en la página de cálculo")
    public void el_usuario_está_en_la_página_de_cálculo() {
        page.navigateToCalculationPage();
    }

    @When("el usuario modifica los valores de pago a {string}, IVA a {string} y reservas a {string}")
    public void el_usuario_modifica_los_valores_a(String pago, String iva, String reservas) {
        page.updatePaymentValue(pago);
        page.updateIVAValue(iva);
        page.updateReserveValue(reservas);
        page.triggerRecalculation();
    }

    @Then("el sistema debe recalcular automáticamente con los nuevos valores")
    public void el_sistema_debe_recalcular_automáticamente_con_los_nuevos_valores() {
        String recalculatedValue = page.getRecalculatedValue();
        Assert.assertNotNull("El valor recalculado no debe ser nulo", recalculatedValue);
    }

    @Then("los cálculos actualizados deben coincidir con los valores esperados")
    public void los_cálculos_actualizados_deben_coincidir_con_los_valores_esperados() {
        String expectedValue = "EXPECTED_CALCULATION_RESULT"; // Define el valor esperado
        String actualValue = page.getRecalculatedValue();
        Assert.assertEquals(expectedValue, actualValue);
    }
}