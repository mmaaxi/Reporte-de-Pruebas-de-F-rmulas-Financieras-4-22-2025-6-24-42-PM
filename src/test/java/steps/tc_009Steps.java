package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("the user has entered multiple records with various payment, VAT, and reserve values")
    public void user_enters_multiple_records() {
        page.enterMultipleRecords();
    }

    @When("the user executes the batch calculation process")
    public void user_executes_batch_calculation_process() {
        page.executeBatchCalculation();
    }

    @Then("each record should display correct results according to its data")
    public void records_should_display_correct_results() {
        Assert.assertTrue(page.verifyCalculationResults());
    }
}