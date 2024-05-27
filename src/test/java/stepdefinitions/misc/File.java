package stepdefinitions.misc;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.misc.PFile;

public class File {
    WebDriver driver = null;
    PFile file;
    DriverFactory driverFactory;

    @And("Click on the File")
    public void clickOnTheFile() {
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        file = new PFile(driver);
        file.clickOnFile();
    }

    @And("click on the choose  {string}")
    public void ClickOnTheChoose(String filepath) {
        filepath = System.getProperty("user.dir") + "\\TestLeaf Logo.png";
        file.clickOnChoose(filepath);
    }

    @Then("File should be upload successfully")
    public void fileShouldBeUploadSuccessfully() {
        file.fileUploadSuccess();
    }
}
