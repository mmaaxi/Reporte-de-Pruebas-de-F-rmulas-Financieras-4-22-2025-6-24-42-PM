package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    WebDriver driver;

    By paymentField = By.id("payment");
    By ivaField = By.id("iva");
    By reserveField = By.id("reserve");
    By recalculateButton = By.id("recalculate");
    By resultField = By.id("result");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCalculationPage() {
        driver.get("URL_DE_LA_PAGINA_DE_CALCULO");
    }

    public void updatePaymentValue(String payment) {
        driver.findElement(paymentField).clear();
        driver.findElement(paymentField).sendKeys(payment);
    }

    public void updateIVAValue(String iva) {
        driver.findElement(ivaField).clear();
        driver.findElement(ivaField).sendKeys(iva);
    }

    public void updateReserveValue(String reserve) {
        driver.findElement(reserveField).clear();
        driver.findElement(reserveField).sendKeys(reserve);
    }

    public void triggerRecalculation() {
        driver.findElement(recalculateButton).click();
    }

    public String getRecalculatedValue() {
        return driver.findElement(resultField).getText();
    }
}