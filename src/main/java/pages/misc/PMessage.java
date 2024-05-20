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

    @FindBy(xpath = "//span[text()='Info']")
    private WebElement Minfo;

    @FindBy(xpath = "//span[text()='Warn']")
    private WebElement Mwarn;

    @FindBy(xpath = "//span[text()='Error']")
    private WebElement Merror;

    @FindBy(xpath = "//a[@class='ui-messages-close']")
    private WebElement close;

    @FindBy(id = "j_idt89:messages")
    private WebElement Minfotext;

    @FindBy(id = "j_idt89:messages")
    private WebElement Mwarntext;

    @FindBy(id = "j_idt89:messages")
    private WebElement Merrortext;



    public void getTextMinfo() {
       String s=elementUtils.getText(Minfotext, CommonUtils.EXPLICIT_WAIT_MAX_TIME);
        System.out.println(s);


    }
    public void getTextMwarn() {
        String s=elementUtils.getText(Mwarntext, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
        System.out.println(s);

    }
    public void getTextMerror() {
        String s=elementUtils.getText(Merrortext, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
        System.out.println(s);

    }



    public void clickOnMinfo() {
        elementUtils.clickOnElement(Minfo, CommonUtils.EXPLICIT_WAIT_MAX_TIME);

    }
    public void clickOnMwarn() {
        elementUtils.clickOnElement(Mwarn, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }
    public void clickOnMerror() {
        elementUtils.clickOnElement(Merror, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }

    public void clickOnClose() {
        elementUtils.clickOnElement(close, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

    }



    /*@FindBy(xpath = "(//span[text()='Info'])[2]")
    private WebElement Ginfo;
    @FindBy(xpath = "(//span[text()='Warn'])[2]")
    private WebElement Gwarn;
    @FindBy(xpath = "(//span[text()='Error'])[2]")
    private WebElement Gerror;
*/











}

