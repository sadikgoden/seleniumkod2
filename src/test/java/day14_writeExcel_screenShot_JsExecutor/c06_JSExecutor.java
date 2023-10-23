package day14_writeExcel_screenShot_JsExecutor;
import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class c06_JSExecutor extends TestBase {
    @Test
    public void test01(){
        // wisequarter anasayfasina gidin
       driver.get("https://www.wisequarter.com");
        // alt kisimda bulunan “Go To Career Page” butonuna kadar asagi inin
        WebElement goToCareerElementi = driver.findElement(By.xpath("(//a[@href='https://wisequarter.com/career/'])[10]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        bekle(2);
        jse.executeScript("arguments[0].scrollIntoView(true);", goToCareerElementi);
        bekle(5);
        // ve bu butona click yapin

        jse.executeScript("arguments[0].click();", goToCareerElementi);
        bekle(3);

        jse.executeScript("alert('yasasinnnn');");

        bekle(3);
    }
}
