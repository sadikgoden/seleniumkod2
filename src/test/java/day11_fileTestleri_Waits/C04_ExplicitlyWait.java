package day11_fileTestleri_Waits;

import Utilities.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C04_ExplicitlyWait {
 @Test
    public void test1(){
     //1. WebDriver ayarlarini implicitlyWait kullanmadan yapin
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
     driver.get("https://the-internet.herokuapp.com/dynamic_controls");
     //4. Textbox’in etkin olmadigini(enabled) dogrulayın
     WebElement texBox = driver.findElement(By.xpath("//input[@type='text']"));
     Assert.assertFalse(texBox.isEnabled());
     //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
     driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
       /*
            Explicit Wait ile beklemek icin
            1- beklemek icin wait objesi olusturalim
            2- hangi web element beklenecekse locate edelim
            3- belirledigimiz webelement ne icin bekletilecek ?
         */

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     // textbox locate edilmisti
     wait.until(ExpectedConditions.elementToBeClickable(texBox));
     //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
     WebElement itsEnableElementi = driver.findElement(By.xpath("//*[@id='message']"));
     Assert.assertTrue(itsEnableElementi.isDisplayed());
     //7. Textbox’in etkin oldugunu(enabled) dogrulayın.
     Assert.assertTrue(texBox.isEnabled());
     ReusableMethods.bekle(2);
    driver.close();
 }
}
