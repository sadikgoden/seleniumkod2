package day11_fileTestleri_Waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_fileDownload extends TestBase {
@Test
    public void indirmeTesti (){
    //2. https://the-internet.herokuapp.com/download adresine gidelim.
    driver.get("https://the-internet.herokuapp.com/download");
    bekle(2);
    //3. logo.jpg dosyasını indirelim
    bekle(2);
    //C:\Users\ASUS-PC\ASUS\Desktop\sig.jpg
    driver.findElement(By.xpath("//*[text()='sig.jpg']")).click();
    bekle(2);

    //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
    String dosyaYolu ="C:\\Users\\ASUS-PC\\ASUS\\Downloads\\sig.jpg";
    Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    bekle(2);
}

}
