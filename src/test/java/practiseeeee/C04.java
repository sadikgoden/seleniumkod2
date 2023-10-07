package practiseeeee;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
   static WebDriver driver;
   @BeforeClass
    public static void setup (){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }


    // ilgili kurulumlari tamamlayalim
// Kullanici https://www.google.com adresine gider
// Çıkıyorsa Kullanici cookies i kabul eder
// Arama Kutusuna karşilastirma yapmak istedigi para birimlerini girer
// Para birimlerinin karsilastirmasini alin
// Karsilastirilacak olan para biriminin 25 den kUCUk oldygu test edilir

}
 /*
 public class P04 {
     static WebDriver driver;
​
    // ilgili kurulumlari tamamlayalim
    // Kullanici https://www.google.com adresine gider
    // Çıkıyorsa Kullanici cookies i kabul eder
    // Arama Kutusuna karşilastirma yapmak istedigi para birimlerini girer
    // Para birimlerinin karsilastirmasini alin
    // Karsilastirilacak olan para biriminin 25 den kucuk oldugu test edilir
​
​
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
​
    }
    @After
    public void tearDown(){
       driver.close();
    }
​
    @Test
    public void test01 (){
        driver.get("https://www.google.com");
        WebElement searchbox=driver.findElement(By.xpath("//*[@name='q']"));
        searchbox.sendKeys("USD TO TRY"+ Keys.ENTER);
​
        WebElement resultMoney= driver.findElement(By.xpath("//*[@class='DFlfde SwHCTb']"));
        String result=resultMoney.getText().replace(",",".");
        double resultDouble=Double.parseDouble(result);
        Assert.assertFalse(resultDouble<25);
​
​
​
​
​
    }
​
}
  */