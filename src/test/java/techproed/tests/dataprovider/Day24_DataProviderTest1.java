package techproed.tests.dataprovider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
import java.security.Key;
public class Day24_DataProviderTest1 {
    //    DATA PROVIDER
    @DataProvider
    public Object[][] urunler(){
        Object urunListesi[][] = {
                {"tesla"},
                {"bmw"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };
        return urunListesi;
    }
    //    TEST METOTU
    @Test(dataProvider = "urunler")
    public void aramaTesti(String data){
        System.out.println(data);
    }
    //    GOOELE ARAMASI
    @Test(dataProvider = "urunler")
    public void googleAramasi(String araclar){
//        google a git
        Driver.getDriver().get("https://www.google.com");
//        araclari arama kutusuna gir ve Enter a bas
        Driver.getDriver().findElement(By.name("q")).sendKeys(araclar+ Keys.ENTER);
//        sayfa title inin aradigim kelimeyi icerdigini assert et
        Assert.assertTrue(Driver.getDriver().getTitle().contains(araclar));
//        driver i kapat
        Driver.closeDriver();
    }
}