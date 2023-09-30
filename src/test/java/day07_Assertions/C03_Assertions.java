package day07_Assertions;

import Utilities.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Assertions {
   WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void teardown(){
        driver.close();
    }
   // a. Verilen web sayfasına gidin.
   // https://the-internet.herokuapp.com/checkboxes

    @Test
    public void checkBoxTest (){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        // b. Checkbox1 ve checkbox2 elementlerini locate edin.
       WebElement chekBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement chekBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        ReusableMethods.bekle(2);
        //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!chekBox1.isSelected()){
            chekBox1.click();
        }
        ReusableMethods.bekle(2);
        if (!chekBox2.isSelected()){
            chekBox2.click();
        }
        //  e. Checkbox1 ve Checkbox2’nin seçili olduğunu test edin
        Assert.assertTrue(chekBox1.isSelected() && chekBox2.isSelected());

        }
    }



    /*

 c. Checkbox1 seçili değilse onay kutusunu tıklayın
 d. Checkbox2 seçili değilse onay kutusunu tıklayın
 e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin
     */



/*
    public void checkBoxTest(){
        //a. Verilen web sayfasına gidin.
        //       https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //  b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        ReusableMethods.bekle(2);
        //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        ReusableMethods.bekle(2);
        //  d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
        ReusableMethods.bekle(2);
        //  e. Checkbox1 ve Checkbox2’nin seçili olduğunu test edin
        Assert.assertTrue(checkbox1.isSelected() && checkbox2.isSelected());
    }
 */