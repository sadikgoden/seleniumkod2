package day14_writeExcel_screenShot_JsExecutor;

import Utilities.TestBase;

public class C04_WebElementScreenshot extends TestBase {


}
/*
 @Test
    public void test01() throws IOException {
        // Amazon'a gidelim
        driver.get("https://www.amazon.com");
        // Nutella icin arama yapalim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Sonuclarin Nutella icerdigini test edelim
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedIcerik ="Nutella";
        String actualSonucYazisi = sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        // Rapora eklenmek icin sonuc yazisinin screenshot'ini alalim
        File sonucYazisiSS = new File("target/screenShots/sonucYazisi.jpg");
        File geciciResim = sonucYaziElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,sonucYazisiSS);
        ReusableMethods.webElementFotografCek(sonucYaziElementi,"NutellaArama");
    }
}

 */