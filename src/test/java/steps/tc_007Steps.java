import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_007Page;

public class tc_007Steps {

    private WebDriver driver;
    private tc_007Page page;

    @Given("el usuario está en la página de entrada de datos")
    public void el_usuario_está_en_la_página_de_entrada_de_datos() {
        driver = new ChromeDriver();
        driver.get("https://example.com/data-entry");
        page = new tc_007Page(driver);
    }

    @When("el usuario ingresa un formato de dato inválido en el campo de entrada")
    public void el_usuario_ingresa_un_formato_de_dato_inválido_en_el_campo_de_entrada() {
        page.enterInvalidDataFormat();
    }

    @Then("el sistema muestra un mensaje de error indicando el formato incorrecto")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_el_formato_incorrecto() {
        assertTrue(page.isErrorMessageDisplayed());
    }

    @When("el usuario intenta ejecutar el cálculo de la fórmula")
    public void el_usuario_intenta_ejecutar_el_cálculo_de_la_fórmula() {
        page.attemptToExecuteCalculation();
    }

    @Then("el sistema impide el cálculo y solicita la corrección de los datos ingresados")
    public void el_sistema_impide_el_cálculo_y_solicita_la_corrección_de_los_datos_ingresados() {
        assertFalse(page.isCalculationPermitted());
    }
}