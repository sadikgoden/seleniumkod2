package day07_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_Assertions {
    //2) https://www.bestbuy.com/ Adresine gidin
    //   farkli test method’lari olusturarak asagidaki testleri yapin
    //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");
    }

    @AfterClass
    public static void teardown(){
      // driver.close();
    }
    @Test
    public void urlTest(){
        //  ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String expectedUrl = "https://www.bestbuy.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    //  ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    @Test
    public void titlrTest (){
        String unexpectedIcerikUrl ="Rest";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertFalse(actualUrl.contains(unexpectedIcerikUrl));
    }
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    @Test
    public void logoTest(){
        WebElement logoElementi = driver.findElement(By.xpath("(//img[@alt = 'Best Buy Logo'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());

    }
    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
    @Test
    public void FrancaisLinkTesti (){
        WebElement francaisLinkElement =driver.findElement(By.xpath("//button[normalize-space()='Français']"));
        Assert.assertTrue(francaisLinkElement.isDisplayed());
    }
}

