package day10_actionClass;

import Utilities.TestBase;

public class C06_keyboardActions extends TestBase {


}
/*
 @Test
    public void test01(){
        //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        //3- video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(3);
        //4- videoyu izlemek icin Play tusuna basin
        // once iframe'e gecis yapalim
        WebElement iframe= driver.findElement(By.xpath("//*[@*='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe);
        bekle(1);
        WebElement playTusu= driver.findElement(By.xpath("//button[@aria-label='Play']"));
        playTusu.click();
        bekle(1);
        //5- videoyu calistirdiginizi test edin
        WebElement youtubeLogosu= driver.findElement(By.xpath("//*[@title='Watch on YouTube']"));
        Assert.assertTrue(youtubeLogosu.isDisplayed());
        bekle(3);
    }
 */