package practiseeeee;

import org.junit.*;

public class c02 {
    @BeforeClass
    public static void beforreClass(){
        System.out.println("beforreClass çalıştı testler çalışmaya başlasın");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("test bitti başaılı");
    }
    @Before
    public void setup (){
        System.out.println("yeni bir test kocu çalıştırılıyor");
    }
    @After
    public void teardown(){
        System.out.println("bu test tamamlandı sıradakş test çalıştırılacak");
    }
    @Test
    public void test01(){
        System.out.println("test 01 çalıştı");
    }
    @Test
    public void test02(){
        System.out.println(" test02. test çalıştırıldı");
    }
}
