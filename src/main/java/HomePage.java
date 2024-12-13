import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BaseClass{
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[@class='business-name']")
    WebElement PaymentReceiverName;
    @FindBy(xpath = "//button[contains(text(),' Continue on this device ')]")
    WebElement ContinueButton;
    @FindBy(xpath = "//p[contains(text(),'2')]")
    WebElement TwoPercentTip;
    @FindBy(xpath = "//button[@id ='select-bank-cta']")
    WebElement ContinueBankButton;
    @FindBy(xpath = "//button[contains(text(),'Personal Banks')]/following::div[5]")
    WebElement FirstBankSelection;
    @FindBy(xpath = "//input[@type='checkbox']/parent::label/div")
    WebElement checkbox;
    public void PaymentReceiverNameCheck(){
        String name= PaymentReceiverName.getText();
        String ExpectedName="Perfect Day";
        Assert.assertEquals(name,ExpectedName);
    }
    public void ContinueToNextPage(){
        ContinueButton.click();
    }
    public void TipSelection(){
        TwoPercentTip.click();
        ContinueBankButton.click();
    }
    public void BankSelection(){
        FirstBankSelection.click();
        checkbox.click();
    }


}
