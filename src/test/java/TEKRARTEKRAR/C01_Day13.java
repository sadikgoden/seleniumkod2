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

    // mesela Sayfa1 deki 4. satırın 3. Cell ini yazdıralım
    Sheet sheet= workbook.getSheet("Sayfa1");
    Row row= sheet.getRow(3);
    Cell cell = row.getCell(2);
    System.out.println(cell);
    //	- 1.satirdaki 2.hucreye gidelim ve yazdiralim
    System.out.println(sheet.getRow(0).getCell(1));
    //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String istenenData = sheet.getRow(0).getCell(1).toString();
    System.out.println(istenenData);
    //- 2.satir 4.cell’in afganistan’in baskenti Kabil oldugunu test edelim
        String expectedData = "Kabil";
        String actualDAta = sheet.getRow(1).getCell(3).toString();
    Assert.assertEquals(expectedData,actualDAta);
    //	- Satir sayisini bulalim
    System.out.println(sheet.getLastRowNum()+1);

    //- Fiziki olarak kullanilan satir sayisini bulun
    System.out.println(sheet.getPhysicalNumberOfRows());
    //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
    String isim;
    String baskent ;
    Map<String,String> ulkelermap = new TreeMap<>();
    for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
        isim=sheet.getRow(i).getCell(0).toString();
        baskent=sheet.getRow(i).getCell(1).toString();

        ulkelermap.put(isim,baskent);
    }

    // Ulkeler excel'inde Canada isimli bir ulke oldugunu test edin
        Assert.assertTrue(ulkelermap.containsKey("Canada"));
    // Ulkeler excel'inde Cuba'nin baskentinin Havana oldugunu test edin

        String expectedBaskent="Havana";
        String actualBaskent=ulkelermap.get("Cuba");
        Assert.assertEquals(expectedBaskent,actualBaskent);
}

}
