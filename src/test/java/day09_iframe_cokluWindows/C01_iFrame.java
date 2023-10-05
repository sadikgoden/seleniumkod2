package day09_iframe_cokluWindows;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_iFrame extends TestBase {
    /*
       1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
    2 ) Bir metod olusturun: iframeTest
    - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
    - Text Box’a “Merhaba Dunya!” yazin.
    - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.
        */
    @Test
    public  void test01(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get(" https://the-internet.herokuapp.com/iframe");
        // 2 ) Bir metod olusturun: iframeTest
        //  - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
        //  konsolda yazdirin.
        WebElement iframeYazisi =driver.findElement(By.tagName("h3"));
        Assert.assertTrue(iframeYazisi.isDisplayed());
        //  - Text Box’a “Merhaba Dunya!” yazin.
         /*
            Locate dogru oldugu halde
            webelement'i kullanamiyorsak
            webelement bir iframe icinde olabilir
            Eger iframe icinde ise
            - once o iframe'i locate etmeli
            - locate ettigimiz iframe'e gecis yapmali
            - sonra istenen islemi gerceklestirmeliyiz
            Iframe'e gecis yapinca
            driver'imiz artik o sayfaya gecmis olur
            anasayfadaki webelementleri goremez
            Eger testimizde iframe disindan element kullanmamiz gerekirse
            once iframe'den disari cikmamiz lazim
         */
        WebElement iframe = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement textBox= driver.findElement(By.tagName("p"));
        textBox.clear();
        textBox.sendKeys("Merhaba Dunya");
        //  - TextBox’in altinda bulunan “Elemental Selenium”
        //    linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin.
        //iframe'e gecen driver'i yeniden anasayfaya dondurmemiz gerekir
    driver.switchTo().defaultContent();
    WebElement elementLink= driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
    Assert.assertTrue(elementLink.isDisplayed());
        System.out.println(elementLink.getText());

    }
}
/*

        driver.switchTo().defaultContent();
        WebElement elementalLinki= driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(elementalLinki.isDisplayed());
        System.out.println(elementalLinki.getText());

    }
 */





