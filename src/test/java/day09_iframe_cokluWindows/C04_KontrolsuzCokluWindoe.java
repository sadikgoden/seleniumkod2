package day09_iframe_cokluWindows;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class C04_KontrolsuzCokluWindoe extends TestBase {
@Test
    public void cokluPencere(){
    // ● https://the-internet.herokuapp.com/windows adresine gidin.
    driver.get("https://the-internet.herokuapp.com/windows");
    String ilksayfaWhd = driver.getWindowHandle();
    bekle(2);

    //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    WebElement YaziElementi = driver.findElement(By.tagName("h3"));
    String expectedYazi="Opening a new window";
    String actualYazi=YaziElementi.getText();
    Assert.assertEquals(expectedYazi,actualYazi);
    bekle(2);
//● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    String expectedTitle="The Internet";
    String actualTitle=driver.getTitle();
    Assert.assertEquals(expectedTitle , actualTitle);
    bekle(2);

    //● Click Here butonuna basın.
driver.findElement(By.xpath("//*[text()='Click Here']")).click();
bekle(2);
    //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
      /*
            Bir linke tikladigimizda
            biz newWindow() kullanmadigimiz halde yeni sayfa aciliyorsa
            driver eski sayfada kalir
            yeni sayfada islem yapabilmek icin
            bizim driver'i yeni sayfaya gecirmemiz gerekir.
         */
          Set<String> whdseti= driver.getWindowHandles();
    System.out.println("ilk sayfa whd : " + ilksayfaWhd);
    System.out.println("window handles seti : " + whdseti);
    String ikinciSayfaWhd="";
    for (String each: whdseti
    ) {
        if (!each.equals(ilksayfaWhd)){
            ikinciSayfaWhd = each;
        }
    }
 // artik 2.sayfanin whd'ini bildigimiz icin, ikinci sayfaya gecis yapabiliriz
    driver.switchTo().window(ikinciSayfaWhd);
    String expectedTitle2 ="New Window";
    String actualTitle2=driver.getTitle();
    Assert.assertEquals(actualTitle2,expectedTitle2);

    //● Sayfadaki textin “New Window” olduğunu doğrulayın.
    WebElement yaziElementi= driver.findElement(By.tagName("h3"));
    String expectedYazi2="New Window";
    String actualYazi2 =driver.getTitle();
    Assert.assertEquals(expectedYazi2 , actualYazi2);
    //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
    driver.switchTo().window(ilksayfaWhd);
    String expecteTitle3="The Internet";
    String actualTitle3=driver.getTitle();
    Assert.assertEquals(expecteTitle3,actualTitle3);
}
}
