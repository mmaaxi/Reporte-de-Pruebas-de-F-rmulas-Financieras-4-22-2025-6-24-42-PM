package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;
    
    // Locators
    By valueIvaField = By.id("ivaValue");
    By ivaAcumuladoButton = By.id("calculateIva");
    By calculatedIvaField = By.id("calculatedIva");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarValoresIVA() {
        // Logic to enter IVA values including withheld IVA
        driver.findElement(valueIvaField).sendKeys("100");
        // Additional input actions for multiple IVA entries
    }

    public void ejecutarCalculoIVA() {
        driver.findElement(ivaAcumuladoButton).click();
    }

    public boolean validarCalculoIVA() {
        String calculatedIva = driver.findElement(calculatedIvaField).getText();
        // Logic to validate that the calculation excludes withheld IVA
        return calculatedIva.equals("Sum without Retained IVA");
    }
}