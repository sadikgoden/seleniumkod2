package day07_Assertions;

import Utilities.TestBase;
import org.junit.Test;

public class C05_DropdownMenu extends TestBase {

    @Test
    public void test01() {

        // 1.adim : dropdown webelementini locate et
        driver.get("https://www.amazon.com");
        bekle(3);
    }
}