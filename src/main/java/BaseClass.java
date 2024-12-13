import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseClass {
   protected WebDriver driver;
   protected  WebDriverWait wait;

   @BeforeSuite
   public void setup() throws InterruptedException {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get("https://uat.atoa.me/payment-qr?paymentRequest=zGcQ2VN3ce8uOCWHRRcxr9Ti95E32OSNEmtXleCqs4Xx3hiImz6I9AchpMJngR5ip8yKabHtMx2RPVUuuLBMFeLKC5Qcl/x1h+JSYGohg/aaHjyVAqKMAO5yaAnxwpgK8kzhcb1p3mOe+3pFg/InYaOyYW4GBz40dCRcwVIN6ACLQi5DERM4MJsMUtdB0IEhEQwJzzhO8NsD3/8YvSIhplzRZ/eKt6UI56cSVOOf3vrEv0OXzmcyZEsl7dU+Up738FocSlcBkLCJgP7xo/5RK75URGrxJj2wBQG0QPCl4htSbSqKQsQ+fGlThKbNy1NhTsPAh/KQEg599HaYIzuDiA==&source=LINK");

   }
   @AfterSuite
   public void tearDown(){
      driver.quit();
   }

}
