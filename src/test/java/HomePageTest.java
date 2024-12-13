import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{
    @Test
    public void payment(){
        HomePage homePage= new HomePage(driver);
        homePage.PaymentReceiverNameCheck();
        homePage.ContinueToNextPage();
        homePage.TipSelection();
        homePage.BankSelection();
    }
}
