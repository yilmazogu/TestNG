package techproed.tests.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Negative_Login_Test3 {

    /*Name:
US101201_Negative_Login
Description:
Geçerli giriş yapmadan rezervasyon yapamamalı
Acceptance Criteria:
Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
Ve giris yapilmadiginda
Hata mesaji almali : Please first login
Giris yapildiginda hata mesaji alınmamalı*/

    @Test
    public void US101201(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();

        BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();

        Select dropdown= new Select(blueRentalHomePage.Select_a_car_dropdown);

        dropdown.selectByVisibleText(ConfigReader.getProperty("arac_markasi"));

        ReusableMethods.waitFor(2);



        blueRentalHomePage.pickup.sendKeys();

    }


}
