package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page page = PageFactory.initElements(driver, tc_004Page.class);

    @Given("el usuario ha accedido al sistema de reservas")
    public void el_usuario_ha_accedido_al_sistema_de_reservas() {
        page.accessReservationSystem();
    }

    @When("el usuario ingresa los datos de impuestos, descuentos y montos de reserva")
    public void el_usuario_ingresa_los_datos_de_impuestos_descuentos_y_montos_de_reserva() {
        page.enterTaxDiscountAndReservationData();
    }

    @Then("el sistema muestra todos los datos ingresados de forma coherente")
    public void el_sistema_muestra_todos_los_datos_ingresados_de_forma_coherente() {
        page.verifyCoherentDataDisplay();
    }

    @Given("el usuario ejecuta el reporte contable actualizado")
    public void el_usuario_ejecuta_el_reporte_contable_actualizado() {
        page.executeUpdatedAccountingReport();
    }

    @Then("los cálculos en los campos 'Pago', 'IVA Acumulado' y 'Monto acumulado Folio Reserva 5401' son correctos")
    public void los_calculos_en_los_campos_pago_iva_acumulado_y_monto_acumulado_son_correctos() {
        page.verifyCorrectReportCalculations();
    }
}