package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;

import static factory.DriverFactory.driver;

public class MyHooks {

    WebDriver driver;
    private ConfigReader configReader;
    private DriverFactory driverFactory;



    @Before
    public void setUp () throws IOException {
        configReader= new ConfigReader();
        Properties prop= configReader.intializeProperties();
        driverFactory = new DriverFactory();
        driver=driverFactory.initializeBrowser((String) prop.get("browser"));
        driver.get(prop.getProperty("URL"));


    }

    @After
    public void tearDown(Scenario scenario){
        String scenarioName=scenario.getName().replaceAll(" ","_");


            if(scenario.isFailed()) {

                byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(srcScreenshot,"image/png", scenarioName);
            }

            driver.quit();




        driver.quit();




}}
