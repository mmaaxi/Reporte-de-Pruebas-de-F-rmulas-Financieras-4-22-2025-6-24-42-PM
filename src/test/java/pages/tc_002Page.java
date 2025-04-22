package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    private WebDriver driver;
    private By montoAcumuladoField = By.id("montoAcumulado");
    private By montoReservaField = By.id("montoReserva");
    private By montoAcumuladoFolioField = By.id("montoAcumuladoFolio");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("http://example.com/calculo-montos");
    }

    public void setMontoAcumulado(String montoAcumulado) {
        driver.findElement(montoAcumuladoField).clear();
        driver.findElement(montoAcumuladoField).sendKeys(montoAcumulado);
    }

    public void setMontoReserva(String montoReserva) {
        driver.findElement(montoReservaField).clear();
        driver.findElement(montoReservaField).sendKeys(montoReserva);
    }

    public String getMontoAcumulado() {
        return driver.findElement(montoAcumuladoField).getAttribute("value");
    }

    public String getMontoReserva() {
        return driver.findElement(montoReservaField).getAttribute("value");
    }

    public void calculateMontoAcumuladoFolio() {
        // Suponiendo que el cálculo se realiza automáticamente al ingresar los valores
    }

    public String getMontoAcumuladoFolio() {
        return driver.findElement(montoAcumuladoFolioField).getText();
    }
}