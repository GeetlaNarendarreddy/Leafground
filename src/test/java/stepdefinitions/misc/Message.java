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

import pages.misc.PMessage;
import utils.ElementUtils;

public class Message {
    WebDriver driver = null;
    PMessage message;
    DriverFactory driverFactory;


    @Given("Launch the application")
    public void launchTheApplication() {
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();

    }

    @When("Click on the Misc")
    public void clickOnTheMisc() {

        message = new PMessage(driver);
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

    @And("User click on the Info")
    public void userClickOnTheInfo() {
        message.clickOnMinfo();
    }

    @Then("Info Message popup should be show")
    public void infoMessagePopupShouldBeShow() {

        message.getTextMessages();
    }

    @Then("Click on the cross button")
    public void clickOnTheCrossButton() {
        message.clickOnClose();
    }


    @And("User click on the Warn")
    public void userClickOnTheWarn() {
        message.clickOnMwarn();
    }

    @Then("Warn Message popup should be show")
    public void warnMessagePopupShouldBeShow() {
        message.getTextMessages();
    }

    @And("User click on the Error")
    public void userClickOnTheError() {
        message.clickOnMerror();
    }

    @Then("Error Message popup should be show")
    public void errorMessagePopupShouldBeShow() {
        message.getTextMessages();

    }

    @And("User click on the GInfo")
    public void userClickOnTheGInfo() {
        message.clickOnGinfo();
    }

    @Then("GInfo Message popup should be show")
    public void ginfoMessagePopupShouldBeShow() {
        message.getTextGrowl();


    }

    @And("User click on the Gwarn")
    public void userClickOnTheGwarn() {
        message.clickOnGwarn();

    }

    @Then("Gwarn Message popup should be show")
    public void gwarnMessagePopupShouldBeShow() {
        message.getTextGrowl();


    }

    @And("User click on the GError")
    public void userClickOnTheGError() {
        message.clickOnGerror();
    }

    @Then("GError Message popup should be show")
    public void gerrorMessagePopupShouldBeShow() {
        message.getTextGrowl();


    }
}
