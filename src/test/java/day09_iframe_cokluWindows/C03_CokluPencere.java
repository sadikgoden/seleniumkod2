package day09_iframe_cokluWindows;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C03_CokluPencere extends TestBase {
    @Test
    public void Test01(){
        //// amazon ana sayfaya gidip url'in amazon icerdigini test edin
        driver.get("https://www.amazon.com");
        String expectedUrlicerik="amazon";
        String actualUrlIceril=driver.getCurrentUrl();
      Assert.assertTrue(actualUrlIceril.contains(expectedUrlicerik));
      bekle(2);
        String amazonWhd= driver.getWindowHandle();

        // yeni bir tab'da wisequarter.com'a gidin ve url'in wise icerdigini test edin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
       String expectedUrl2="wise";
       String actualUrl2 =driver.getCurrentUrl();
       Assert.assertTrue(actualUrl2.contains(expectedUrl2));
       bekle(2);
        String wiseWhd= driver.getWindowHandle();

        // yeni bir pencere olarak youtube'a gidin ve url'in youtube icerdigini test edin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String  expectedIcerik3="youtube";
        String actulaUrl3= driver.getCurrentUrl();
        Assert.assertTrue(actulaUrl3.contains(expectedIcerik3));
        bekle(2);

        // wisequarter'in acik oldugu sayfaya donup title'in Wise icerdigini test edin
        driver.switchTo().window(wiseWhd);
        String expectedTitle="Wise";
        String actualTitle=driver.getTitle();
        bekle(2);
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // Amazon'un acik oldugu sayfaya donun ve Title'in Amazon icerdigini test edin
        driver.switchTo().window(amazonWhd);
        bekle(5);
        String expectedTitle2="Amazon";
        String actualTitle2=driver.getTitle();
        Assert.assertTrue(actualTitle2.contains(expectedTitle2));

    }
}
