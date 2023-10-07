package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_DinamikDosyaYoluOlusturma {
    @Test
            public void test1(){
        /*
            Testlerimizin farkli bilgisayarlarda da calismasi gerekiyorsa
            file testleri icin gerekli olan DOSYA YOLU dinamik yapilmalidir
            Java'da dosya yolunu kodun calistigi bilgisayardan
            otomatik olarak almak icin 2 secenek vardir
            System.getProperty("user.home") ===> bilgisayarin ana dosya yolunu verir
            System.getProperty("user.dir")  ===>
         */
        // masaustumuzde bulunan logo.jpg dosyasinin varligini
        // dinamik dosya yolu kullanarak test edelim

        //     /Users/ahmetbulutluoz/Desktop/logo.jpg
        //     "/Users/ahmetbulutluoz" +    "/Desktop/logo.jpg"
        //         Ana dosya yolu        Herkeste ayni olan kisim

        String dinamikDosyaYolu = System.getProperty("user.home") + "\\ASUS\\Desktop\\sig.jpg" ;
        System.out.println(dinamikDosyaYolu);    //C:\Users\ASUS-PC\ASUS\Desktop\sig.jpg
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
        System.out.println("==============================");
        System.out.println(System.getProperty("user.dir"));  //C:\Users\ASUS-PC\Team120_JUnit_Fall2023

       //C:\Users\ASUS-PC\ASUS\Desktop\sig.jpg

        // projemizde var olan text.txt 'nin varligini
        // dinamik dosya yolu ile test edelim
    //"C:\Users\ASUS-PC\Team120_JUnit_Fall2023" +
        //     "\src\test\java\day11_fileTestleri_Waits\text.txt"

        String dinamikTextDosyayolu = System.getProperty("user.dir") +
                "\\src\\test\\java\\day11_fileTestleri_Waits\\text.txt";
        Assert.assertTrue(Files.exists(Paths.get(dinamikTextDosyayolu)));



    }

}
    /*


                String dinamikTextDosyayolu = System.getProperty("user.dir") +
                "/src/test/java/day11_fileTestleri_Waits/text.txt";
                Assert.assertTrue(Files.exists(Paths.get(dinamikTextDosyayolu)));
                }
 */