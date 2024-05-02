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
        elementUtils=new ElementUtils(driver);
    }

    @FindBy(id = "menuform:j_idt43")
    private WebElement misc;

    @FindBy(id = "menuform:m_message")
    private WebElement message;

    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement submitButton;


    @FindBy(id = "j_idt100:lastname")
    private WebElement lastname;

    @FindBy(id = "j_idt100:email")
    private WebElement email;


    @FindBy(id = "j_idt100:firstname")
    private WebElement firstname;


    public void clickOnMisc() {

        elementUtils.clickOnElement(misc, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void clickOnMessage() {
        elementUtils.clickOnElement(message,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);


    }

    public void clickOnSubmitButton() {
        elementUtils.clickOnElement(submitButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }

    public void clickOnEmailTextBox(String inputemail) {

        elementUtils.sendKeysToElement(email,CommonUtils.EXPLICIT_WAIT_BASIC_TIME,inputemail);

    }

    public void clickOnFirstNameTextBox(String inputfirstname) {
        elementUtils.sendKeysToElement(firstname,CommonUtils.EXPLICIT_WAIT_BASIC_TIME,inputfirstname);



    }

    public void clickOnLastNameTextBox(String inputlastname) {
        elementUtils.sendKeysToElement(lastname,CommonUtils.EXPLICIT_WAIT_BASIC_TIME,inputlastname);

    }


}

