package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    private WebDriver driver;

    private By dataInputField = By.id("data-input");
    private By errorMessage = By.id("error-message");
    private By calculateButton = By.id("calculate-button");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInvalidDataFormat() {
        driver.findElement(dataInputField).sendKeys("InvalidFormat");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void attemptToExecuteCalculation() {
        driver.findElement(calculateButton).click();
    }

    public boolean isCalculationPermitted() {
        // Assuming button is disabled if format is wrong
        return driver.findElement(calculateButton).isEnabled();
    }
}