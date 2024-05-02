package stepdefinitions.misc;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import  pages.misc.PMessage;
import utils.ElementUtils;

public class Message {
    WebDriver driver = null;
    PMessage message;
    DriverFactory driverFactory;


    @Given("Launch the application")
    public void launchTheApplication() {
        driverFactory= new DriverFactory();
        driver = driverFactory.getDriver();

    }

    @When("Click on the Misc")
    public void clickOnTheMisc() {

        message= new PMessage(driver);
        message.clickOnMisc();



    }

    @And("Click on the Message")
    public void clickOnTheMessage() {

        message.clickOnMessage();

    }

    @Then("Click on the Submit button")
    public void clickOnTheSubmitButton() {

        message.clickOnSubmitButton();
    }

    @And("User enters the details into below fields")
    public void userEntersTheDetailsIntoBelowFields(DataTable dataTable) {

       Map<String, String> datamap = dataTable.asMap(String.class, String.class);
        message.clickOnFirstNameTextBox(datamap.get("First Name"));
        message.clickOnLastNameTextBox(datamap.get("Last Name"));
        message.clickOnEmailTextBox(datamap.get("Email"));


    }
}
