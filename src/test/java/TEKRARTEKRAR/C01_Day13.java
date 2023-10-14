package TEKRARTEKRAR;

import org.apache.poi.ss.usermodel.*;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class C01_Day13 {
     @Test
    public void readExcelTesti() throws IOException {
         // excel için gerekli ayarları yapalım
            String dosyaYolu = "C:\\Users\\ASUS-PC\\Team120_JUnit_Fall2023\\src\\test\\java\\day13_excelOtomasyonu\\ulkeler.xlsx";
         FileInputStream fis = new FileInputStream(dosyaYolu);
         Workbook workbook= WorkbookFactory.create(fis);
         Sheet sheet = workbook.getSheet("Sayfa1");
         // mesela Sayfa1 deki 6. satırın 3. Cell ini yazdıralım

         //	- 1.satirdaki 2.hucreye gidelim ve yazdiralim

         //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim

         //- 2.satir 4.cell’in afganistan’in baskenti Kabil oldugunu test edelim

         //	- Satir sayisini bulalim

         // - Fiziki olarak kullanilan satir sayisini bulun

         //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
            String isim ;
            String baskent ;
         Map<String ,String> ulkelerMap = new TreeMap<>();
         for (int i = 1 ; i <= sheet.getLastRowNum() ; i++) {
             isim = sheet.getRow(i).getCell(0).toString();
             baskent = sheet.getRow(i).getCell(1).toString();
             ulkelerMap.put(isim,baskent);
         }
         // Ulkeler excel'inde Canada isimli bir ulke oldugunu test edin,
         Assert.assertTrue(ulkelerMap.containsKey("Canada"));
         // Ulkeler excel'inde Cuba'nin baskentinin Havana oldugunu test edin
         String expectedBAskent = "Havana";
         String actualBaskent = ulkelerMap.get("Cuba");
         Assert.assertEquals(expectedBAskent,actualBaskent);
}

}
