package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_001Page {
    WebDriver driver = DriverFactory.getDriver();

    private By montoBaseField = By.id("montoBase");
    private By ivaField = By.id("iva");
    private By descuentoField = By.id("descuento");
    private By calcularButton = By.id("calcularPago");
    private By resultadoPagoField = By.id("resultadoPago");

    public void ingresarMontoBase(String montoBase) {
        WebElement element = driver.findElement(montoBaseField);
        element.clear();
        element.sendKeys(montoBase);
    }

    public void ingresarIVA(String iva) {
        WebElement element = driver.findElement(ivaField);
        element.clear();
        element.sendKeys(iva);
    }

    public void ingresarDescuento(String descuento) {
        WebElement element = driver.findElement(descuentoField);
        element.clear();
        element.sendKeys(descuento);
    }

    public void ejecutarCalculoPago() {
        driver.findElement(calcularButton).click();
    }

    public String obtenerResultadoPago() {
        return driver.findElement(resultadoPagoField).getText();
    }
}