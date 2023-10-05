package day09_iframe_cokluWindows;

import Utilities.TestBase;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class C05_KontrolsuzCokluSayfa extends TestBase {
@Test
    public void Test01(){
    // https://the-internet.herokuapp.com/iframe url'ine gidin
    driver.get("https://the-internet.herokuapp.com/iframe");
    String ilkSayfawhd = driver.getWindowHandle();
    // sayfa basliginin Internet icerdigini test edin
    String expectedTitle ="Internet";
    String actualTitle=driver.getTitle();
    Assert.assertTrue(actualTitle.contains(expectedTitle));
    // Elemental Selenium linkini tiklayin
    driver.findElement(By.linkText("Elemental Selenium")).click();

    // Yeni acilan tab'in Title'inin Selenium icerdigini test edin
    String ikiciSayfaWhd="";
    Set<String> WhdSeti = driver.getWindowHandles();
    for (String each: WhdSeti
    ){
        if (!each.equals(ilkSayfawhd)){
            ikiciSayfaWhd=each;
        }
    }
    driver.switchTo().window(ikiciSayfaWhd);
   String expectedTitleIcerik ="Selenium";
    String actualTitleIcerik=driver.getTitle();
    Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));

    // Ilk sayfaya donup url'in internet icerdigini test edin
    driver.switchTo().window(ilkSayfawhd);
    String expectedUrlIcerik="internet";
    String actualUrlIcerik =driver.getCurrentUrl();
    Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));
}}

