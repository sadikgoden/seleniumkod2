package day14_writeExcel_screenShot_JsExecutor;

import Utilities.ReusableMethods;
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C05_youTubeAramaTesti extends TestBase {
    @Test
    public void youtubeTesti (){
        // youtube anasayfaya gidin
    driver.get("https://youtube.com");
        // cookies kabul edin

        // ahmet bulutluoz icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='search']"));
        aramaKutusu.click();
        aramaKutusu.sendKeys("Ahmet Bulutluoz" + Keys.ENTER);

        // bulunan videolardan ilkinin isminde QA gectigini test edin

        WebElement ilkVideoIsmi = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));

        String expectedIcerik = "QA";
        String actualVideoIsmi= ilkVideoIsmi.getText();
        System.out.println(actualVideoIsmi);
        Assert.assertTrue(actualVideoIsmi.contains(expectedIcerik));
        // ilk video isminin fotografini cekin
       ReusableMethods.webElementFotografCek(ilkVideoIsmi,"Ahmet youtube");
        bekle(3);
    }

}
