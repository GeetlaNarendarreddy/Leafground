package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.CommonUtils;
import utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;


import java.time.Duration;

public class DriverFactory {
    public static WebDriver driver=null;


    public  WebDriver initializeBrowser(String browser) throws IOException {

        switch (browser) {
            case "chrome" -> {
                driver = new ChromeDriver();
            }
            case "edge" -> {
                driver = new EdgeDriver();
            }
            case "safari" -> {
                driver = new SafariDriver();
            }
            case "firefox" -> {
                driver = new FirefoxDriver();
            }
            default -> {
                System.out.println("Browser not supported");
            }


        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));


        return driver;
    }
    public  WebDriver getDriver(){
        return driver;
    }


}

/*



    if (browser.equals("chrome")){
        driver= new ChromeDriver();
    }

    else if (browser.equals("edge")){
        driver= new EdgeDriver();

    }
    else if (browser.equals("safari")){
        driver= new SafariDriver();

    }
    else if (browser.equals("firefox")){
        driver= new FirefoxDriver();

    }
*/




