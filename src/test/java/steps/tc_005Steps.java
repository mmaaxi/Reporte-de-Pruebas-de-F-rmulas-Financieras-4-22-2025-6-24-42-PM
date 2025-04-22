package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;

import static org.junit.Assert.assertTrue;

public class tc_005Steps {
    private WebDriver driver;
    private tc_005Page paymentPage;

    public tc_005Steps() {
        this.driver = Hooks.getDriver();
        paymentPage = PageFactory.initElements(driver, tc_005Page.class);
    }

    @Given("I am on the payment page")
    public void iAmOnThePaymentPage() {
        driver.navigate().to("http://example.com/payment");
    }

    @When("I enter a negative value in the payment field")
    public void iEnterANegativeValueInThePaymentField() {
        paymentPage.enterPaymentValue("-100");
    }

    @Then("I should see a validation error message")
    public void iShouldSeeAValidationErrorMessage() {
        assertTrue(paymentPage.isValidationErrorDisplayed());
    }

    @Then("no erroneous calculation should be performed")
    public void noErroneousCalculationShouldBePerformed() {
        assertTrue(paymentPage.isCalculationStopped());
    }

    @Then("the system should request a correction of the data")
    public void theSystemShouldRequestACorrectionOfTheData() {
        assertTrue(paymentPage.isCorrectionPrompted());
    }
}