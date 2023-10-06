package day10_actionClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_dragAndDrop extends TestBase {
    @Test
    public void test01(){
        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");

        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement suruklenecekElement= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement suruklenecekAlan = driver.findElement(By.xpath("//*[@id='droppable'][1]"));
        Actions actions =new Actions(driver);
        actions.dragAndDrop(suruklenecekElement,suruklenecekAlan).perform();
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String expectedYazi="Dropped!";
        String actualYazi = driver.findElement(By.xpath("//*[text()='Dropped!']")).getText();
        Assert.assertEquals(actualYazi,expectedYazi);
        bekle(2);

    }
}
