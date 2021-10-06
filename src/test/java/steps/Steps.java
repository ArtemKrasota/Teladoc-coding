package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.SubscribeAndSavePage;
import utilities.Driver;

public class Steps {

    @Given("User opens webpage")
    public void user_opens_webpage() throws InterruptedException {
        Driver.get().get("https://www.amazon.com/");
    }

    @Then("User clicks on Subscribe and Save button")
    public void user_clicks_on_subscribe_and_save_button() {
        new HomePage().clickOnSubscrbsv();
    }

    @When("User verifies if Subscribe and Save page opened")
    public void user_verifies_if_subscribe_and_save_page_opened() {
        String expected = "Amazon Subscribe & Save";
        Assert.assertEquals(new SubscribeAndSavePage().subscribeAndSaveHeader(), expected);
    }
}