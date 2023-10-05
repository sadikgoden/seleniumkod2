package day11_file_Waits;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02 {
    @Test
            public void test1(){
        String dinamikDosyayolu= System.getProperty("user.home"+"/Desktop/logo.jpg");
        System.out.println(dinamikDosyayolu);
       // Assert.assertTrue(Files.exists(Paths.get(dinamikDosyayolu)));





        //C:\Users\ASUS-PC\Team120_JUnit_Fall2023\src\test\java\day11_file_Waits\text.txt

        String dinamiktextyolu=System.getProperty("user.dir")+"\\src\\test\\java\\day11_file_Waits\\text.txt";
        System.out.println(dinamiktextyolu);
        // Assert.assertTrue(Files.exists(Paths.get(dinamiktextyolu)));


    }

}
