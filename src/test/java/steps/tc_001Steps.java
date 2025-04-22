package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("El usuario ingresa {string} en el campo de monto base")
    public void el_usuario_ingresa_en_el_campo_de_monto_base(String montoBase) {
        page.ingresarMontoBase(montoBase);
    }

    @Given("El usuario ingresa {string} en el campo de IVA")
    public void el_usuario_ingresa_en_el_campo_de_IVA(String iva) {
        page.ingresarIVA(iva);
    }

    @Given("El usuario ingresa {string} en el campo de descuento")
    public void el_usuario_ingresa_en_el_campo_de_descuento(String descuento) {
        page.ingresarDescuento(descuento);
    }

    @When("El usuario ejecuta el cálculo de la fórmula de 'Pago'")
    public void el_usuario_ejecuta_el_cálculo_de_la_fórmula_de_pago() {
        page.ejecutarCalculoPago();
    }

    @Then("El sistema debe mostrar el valor calculado correctamente como {string}")
    public void el_sistema_debe_mostrar_el_valor_calculado_correctamente_como(String valorEsperado) {
        String valorActual = page.obtenerResultadoPago();
        Assert.assertEquals(valorEsperado, valorActual);
    }
}