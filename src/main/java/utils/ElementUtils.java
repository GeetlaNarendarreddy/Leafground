package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtils {
    WebDriver driver;

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement(WebElement element, long durationInSeconds) {
        WebElement webElement = null;
        try {
            WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return webElement;
    }

    public void clickOnElement(WebElement element, long durationOfSeconds) {
        WebElement webelement = waitForElement(element, durationOfSeconds);
        webelement.click();
    }

    public void getText(WebElement element, long durationOfSeconds) {
        WebElement webelement = waitForElement(element, durationOfSeconds);
        String text = webelement.getText();
        System.out.println(text);
    }

    public void sendKeysToElement(WebElement element, long durationOfSeconds, String text) {
        WebElement webElement = waitForElement(element, durationOfSeconds);
        webElement.click();
        webElement.clear();
        webElement.sendKeys(text);
    }

    public WebElement waitForElementToDisplay(WebElement element, long durationInSeconds) {
        WebElement webElement = null;
        try {
            WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            webElement = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.valueOf(element))));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return webElement;
    }

    public void getSuccessText(WebElement element, long durationOfSeconds) {
        String s = String.valueOf(waitForElementToDisplay(element, durationOfSeconds));
        System.out.println(s);
    }
}
