import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TipPage extends BaseClass{
    @FindBy(xpath = "//p[contains(text(),'2')]")
    WebElement TwoPercentTip;
    @FindBy(xpath = "//button[@id ='select-bank-cta']")
    WebElement ContinueButton;
    @FindBy(xpath = "//button[contains(text(),'Personal Banks')]/following::div[5]")
    WebElement FirstBankSelection;
    @FindBy(xpath = "//input[@type='checkbox']/parent::label/div")
    WebElement checkbox;

}
