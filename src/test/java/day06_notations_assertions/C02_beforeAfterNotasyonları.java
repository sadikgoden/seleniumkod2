package day06_notations_assertions;

import Utilities.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_beforeAfterNotasyonları {

    // 3 test method'u olusturup asagidaki gorevleri
    // bagimsiz olarak calisabilecek sekilde olusturun
    // 1- Amazon anasayfaya gidip, url'in amazon icerdigini test edin,sayfayi kapatin
    // 2- Wisequarter anasayfaya gidip, title'in Wise icerdigini test edin,sayfayi kapatin
    // 3- Youtube anasayfaya gidip, title'in best icermedigini test edin,sayfayi kapatin

    /*
            bir class'in icinde her Test Method'undan once calismasini istediginiz
            siradan bir method varsa
            o method'un basina @Before kullanirsak
            @Test method'larinda CAGIRMAYA GEREK OLMADAN
            o method her test method'undan once calisir
            Ayni sekilde her test Method'undan sonra calismasini istedigimiz
            siradan bir method varsa
            @After notasyonu ile isaretleyebiliriz
         */
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown(){
        ReusableMethods.bekle(2);
        driver.close();
    }

    @Test
    public void amazonTest() {
        // 1- Amazon anasayfaya gidip, url'in amazon icerdigini test edin,sayfayi kapatin

        driver.get("https://www.amazon.com");
        String exceptionUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(exceptionUrl)) {
            System.out.println("amazon testi passed");
        } else {
            System.out.println("amazon testi failed");
        }

    }

    @Test
    public void wiseTesti() {
        // 2- Wisequarter anasayfaya gidip, title'in Wise icerdigini test edin,sayfayi kapatin

        driver.get("https://www.Wisequarter.com");
        String expectedIcerik = "Wise";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("wisequarter testi passed");
        } else {
            System.out.println("  wisequarter testi failled");
        }

    }

    // 3- Youtube anasayfaya gidip, title'in best icermedigini test edin,sayfayi kapatin

    @Test
    public void amazonTesti() {

        driver.get("https://www.youtube.com");
        String unexpectedIcerik = "best";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(unexpectedIcerik)) {
            System.out.println("youtube testi Failed");
        } else {
            System.out.println("  youtube testi Passed");

        }

    }

}
