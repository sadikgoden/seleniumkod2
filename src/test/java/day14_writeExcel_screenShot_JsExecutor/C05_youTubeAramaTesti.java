package day14_writeExcel_screenShot_JsExecutor;

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
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='search-container']"));
        aramaKutusu.click();
        aramaKutusu.sendKeys("ahmet Bulutluöz"+ Keys.ENTER);
        // bulunan videolardan ilkinin isminde bulut gectigini test edin
        WebElement ilVideoIsmi = driver.findElement(By.xpath(""));
        String expectedIcerik= "QA";
        String actualVideoIsmi =ilVideoIsmi.getText();
        System.out.println(actualVideoIsmi);
        //  Assert.assertTrue(actualVideoIsmi);
       // ilk videonun fotografini cekin

    }

}
