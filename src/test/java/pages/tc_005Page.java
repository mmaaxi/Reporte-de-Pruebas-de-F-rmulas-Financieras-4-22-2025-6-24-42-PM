package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_005Page {
    private WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "paymentField")
    private WebElement paymentField;

    @FindBy(id = "validationError")
    private WebElement validationError;

    @FindBy(id = "calculationStatus")
    private WebElement calculationStatus;

    @FindBy(id = "correctionRequest")
    private WebElement correctionRequest;

    public void enterPaymentValue(String value) {
        paymentField.clear();
        paymentField.sendKeys(value);
    }

    public boolean isValidationErrorDisplayed() {
        return validationError.isDisplayed();
    }

    public boolean isCalculationStopped() {
        return "stopped".equals(calculationStatus.getText());
    }

    public boolean isCorrectionPrompted() {
        return correctionRequest.isDisplayed();
    }
}