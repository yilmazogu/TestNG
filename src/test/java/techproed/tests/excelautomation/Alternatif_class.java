package techproed.tests.excelautomation;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class Alternatif_class {
    BlueRentalLoginPage blueRentalLoginPage;
    BlueRentalHomePage blueRentalHomePage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatalari;

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage=new BlueRentalHomePage();

        try {
            blueRentalHomePage.loginLink.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
//        LOGIN SAYFASINDAYIZ
        }catch (Exception e){
        }
//      -------------SONRAKI GIRISLER------
        try{
//            kullanici ID ye tikla      --->>> try catch
            blueRentalHomePage.userID.click();
            ReusableMethods.waitFor(1);
//            Logout linkine tikla       --->>> try catch
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);
//            OK e tikla                --->>> try catch
            blueRentalHomePage.OK.click();
            ReusableMethods.waitFor(1);
//            home page logine tikla    --->>> try catch
            blueRentalHomePage.loginLink.click();
            ReusableMethods.waitFor(1);
//        LOGIN SAYFASINDAYIZ
        }catch (Exception e){
        }
    }

    @Test
    public void test(){
        String path=".\\src\\test\\java\\resources\\mysmoketestdata (1).xlsx";
        String sayfa="customer_info";
        excelUtils=new ExcelUtils(path,sayfa);
        excelDatalari=excelUtils.getDataList();
        for (Map<String,String> data: excelDatalari ) {
            login();
            blueRentalLoginPage.emailBox.sendKeys(data.get("username"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.passwordBox.sendKeys(data.get("password"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.loginButton.click();
            ReusableMethods.waitFor(1);



            
        }





    }
}
