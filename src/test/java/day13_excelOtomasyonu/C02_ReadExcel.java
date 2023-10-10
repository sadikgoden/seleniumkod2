package day13_excelOtomasyonu;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExcel {
    @Test
public void test01() throws IOException {
        // ilgili ayarlari yapip workbook'u olusturun
        String dosyaYolu ="src/test/java/day13_excelOtomasyonu/ulkeler.xlsx";
        FileInputStream fis =new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        // 2.sayfaya gidin
        Sheet sayfa2 =workbook.getSheet("Sayfa2");
        // kullanilan en son satirin 24.satir oldugunu test edin
        int expectedSonsatir= 24;
        int actualSonsatir =sayfa2.getLastRowNum()+1;
        Assert.assertEquals(expectedSonsatir,actualSonsatir);

        // fiziki kullanilan satir sayisinin 8 oldugunu test edin
        int expectedFizikisatirsayisi =8;
        int actualFizikisatirsayisi=sayfa2.getPhysicalNumberOfRows();
        Assert.assertEquals(expectedFizikisatirsayisi,actualFizikisatirsayisi);
        // olmayan satir veya sutun numarasi yazdirmaya calissak
       // System.out.println(sayfa2.getRow(30).getCell(1));  NullPointerException
        System.out.println(sayfa2.getRow(5).getCell(10));   // null
    }

}
