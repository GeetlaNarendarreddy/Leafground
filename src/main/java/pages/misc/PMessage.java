package pages.misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.ElementUtils;

public class PMessage {


    WebDriver driver;
    private ElementUtils elementUtils;


    public PMessage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(id = "menuform:j_idt43")
    private WebElement misc;

    public void clickOnMisc() {
        elementUtils.clickOnElement(misc, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }

    @FindBy(id = "menuform:m_message")
    private WebElement message;

    public void clickOnMessage() {
        elementUtils.clickOnElement(message, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }

    @FindBy(id = "j_idt100:firstname")
    private WebElement firstname;

    public void clickOnFirstNameTextBox(String inputfirstname) {
        elementUtils.sendKeysToElement(firstname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, inputfirstname);


    }

    @FindBy(id = "j_idt100:lastname")
    private WebElement lastname;

    public void clickOnLastNameTextBox(String inputlastname) {
        elementUtils.sendKeysToElement(lastname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, inputlastname);

    }

    @FindBy(id = "j_idt100:email")
    private WebElement email;

    public void clickOnEmailTextBox(String inputemail) {

        elementUtils.sendKeysToElement(email, CommonUtils.EXPLICIT_WAIT_BASIC_TIME, inputemail);

    }

    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement submitButton;

    public void clickOnSubmitButton() {
        elementUtils.clickOnElement(submitButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }


    @FindBy(xpath = "//span[text()='Info']")
    private WebElement Minfo;

    public void clickOnMinfo() {
        elementUtils.clickOnElement(Minfo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }


    @FindBy(xpath = "//span[text()='Warn']")
    private WebElement Mwarn;

    public void clickOnMwarn() {
        elementUtils.clickOnElement(Mwarn, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }


    @FindBy(xpath = "//span[text()='Error']")
    private WebElement Merror;

    public void clickOnMerror() {
        elementUtils.clickOnElement(Merror, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }


    @FindBy(xpath = "//a[@class='ui-messages-close']")
    private WebElement close;

    public void clickOnClose() {
        elementUtils.clickOnElement(close, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    @FindBy(xpath = "//li[@role='alert']")
    private WebElement getTextMessages;


    public void getTextMessages() {
        elementUtils.getText(getTextMessages, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);


    }




    @FindBy(xpath = "(//span[text()='Info'])[2]")
    private WebElement Ginfo;

    public void clickOnGinfo() {

        elementUtils.clickOnElement(Ginfo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    @FindBy(xpath = "(//span[text()='Warn'])[2]")
    private WebElement Gwarn;

    public void clickOnGwarn() {

        elementUtils.clickOnElement(Gwarn, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    @FindBy(xpath = "(//span[text()='Error'])[2]")
    private WebElement Gerror;

    public void clickOnGerror() {

        elementUtils.clickOnElement(Gerror, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }




    @FindBy(xpath = "//div[@class='ui-growl-item']")
    private WebElement getTextGrowl;

    public void getTextGrowl() {

        elementUtils.getText(getTextGrowl, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);


    }


}

