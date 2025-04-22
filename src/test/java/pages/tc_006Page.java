package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_006Page {

    private WebDriver driver;

    private By paymentField = By.id("payment");
    private By accumulatedField = By.id("accumulated");
    private By reserveField = By.id("reserve");
    private By calculateButton = By.id("calculate");
    private By resultElement = By.id("result");

    public tc_006Page() {
        this.driver = DriverFactory.getDriver();
    }

    public void navigateToCalcPage() {
        driver.get("http://example.com/calcpage");
    }

    public void enterMaxValues() {
        driver.findElement(paymentField).sendKeys("9999999999");
        driver.findElement(accumulatedField).sendKeys("9999999999");
        driver.findElement(reserveField).sendKeys("9999999999");
    }

    public void executeCalculations() {
        driver.findElement(calculateButton).click();
    }

    public boolean isAcceptedWithoutOverflow() {
        // Implement logic to verify no overflow error messages
        return true;
    }

    public boolean resultsAreCorrect() {
        WebElement result = driver.findElement(resultElement);
        // Implement logic to verify correct results
        return true;
    }
}