package pages.misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.ElementUtils;

public class PFile {
    WebDriver driver;
    private ElementUtils elementUtils;

    public PFile(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    @FindBy(xpath = "//span[text()='File']")
    private WebElement file;

    public void clickOnFile() {
        elementUtils.clickOnElement(file, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
    }

    @FindBy(xpath = "//span[@class='ui-fileupload-simple ui-widget']")
    private WebElement choose;

    public void clickOnChoose(String filepath) {
        elementUtils.clickOnElement(choose, CommonUtils.EXPLICIT_WAIT_MIN_TIME);
    }

    @FindBy(xpath = "//span[@class='ui-fileupload-filename']")
    private WebElement fileUploadSuccess;

    public void fileUploadSuccess() {
        elementUtils.getSuccessText(fileUploadSuccess, CommonUtils.EXPLICIT_WAIT_MAX_TIME);

    }

}
