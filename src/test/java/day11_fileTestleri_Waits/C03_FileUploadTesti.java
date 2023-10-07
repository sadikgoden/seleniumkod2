package day11_fileTestleri_Waits;
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;


public class C03_FileUploadTesti extends TestBase {
 @Test
    public void  fileUploadTesti(){
     // 1.https://the-internet.herokuapp.com/upload adresine gidelim
     driver.get("https://the-internet.herokuapp.com/upload");
     bekle(2);
    // 2.chooseFile butonuna basalim          //input[@id='file-upload']  //input[@id='file-upload']
         /*
            insan olarak dosya secimi icin
            chooseFile butonuna bastiktan sonra
            acilan windows dosya penceresinden
            istedigimiz dosyayi secip yukleriz.
            Selenium'da otomasyon ile bu islemi yapmak icin
            chooseFile butonu locate edilip,
            bu webelement'e sendKeys(yuklenecekDosyaninDosyaYolu); yapilir
         */
     WebElement uploadButtonElementi = driver.findElement(By.id("file-upload"));
     // 3.Yuklemek istediginiz dosyayi secelim.
     //day11_fileTestleri_Waits/text.txt  //C:\Users\ASUS-PC\Team120_JUnit_Fall2023\src\test\java\day11_fileTestleri_Waits\text.txt
     String dinamikDosyaYolu = System.getProperty("user.dir")+"src\\test\\java\\day11_fileTestleri_Waits\\text.txt";
        bekle(10);
    // 4.Upload butonuna basalim.
    driver.findElement(By.id("file-submit")).click();
    bekle(10);

    // 5.“File Uploaded!” textinin goruntulendigini test edelim.
 WebElement fileUploadedElementi = driver.findElement(By.tagName("h3"));
  Assert.assertTrue(fileUploadedElementi.isDisplayed());
   bekle(10);

 }


}

                 /*   //“File Uploaded!” textinin gorunq2tulendigini test edelim.
                    WebElement fileUploadedElementi = "driver.findElement(By.tagName("h3"));
                Assert.assertTrue(fileUploadedElementi.isDisplayed());

                }
                }
 */