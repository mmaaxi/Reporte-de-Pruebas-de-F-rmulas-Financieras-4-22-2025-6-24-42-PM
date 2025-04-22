package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_009Page {

    WebDriver driver;

    @FindBy(id = "record_input_payment")
    WebElement paymentInput;

    @FindBy(id = "record_input_vat")
    WebElement vatInput;

    @FindBy(id = "record_input_reserve")
    WebElement reserveInput;

    @FindBy(id = "calculate_button")
    WebElement calculateButton;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterMultipleRecords() {
        // Code to enter multiple records
        enterRecord("100", "10", "5");
        enterRecord("200", "20", "10");
        enterRecord("300", "30", "15");
    }

    private void enterRecord(String payment, String vat, String reserve) {
        paymentInput.clear();
        paymentInput.sendKeys(payment);
        vatInput.clear();
        vatInput.sendKeys(vat);
        reserveInput.clear();
        reserveInput.sendKeys(reserve);
        calculateButton.click();
    }

    public void executeBatchCalculation() {
        // Code to execute batch calculation
        calculateButton.click();
    }

    public boolean verifyCalculationResults() {
        // Code to verify calculation results
        return true; // Implement actual result verification logic
    }
}