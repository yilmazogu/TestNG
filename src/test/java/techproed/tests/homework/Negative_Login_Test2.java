package techproed.tests.homework;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Negative_Login_Test2 {
    /*Name:
US101122_Negative_Login
Description:
Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
Acceptance Criteria:
Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
Error Message: email must be a valid email
Dogru email uzantisi girildiğinde hata mesajı alınmamalı
https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
     */
    @Test
    public void US101122_Negative_Login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        BlueRentalLoginPage blueRentalLoginPage=new BlueRentalLoginPage();
        BlueRentalHomePage blueRentalHomePage=new BlueRentalHomePage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("hw2_nt_fakemail"));
        ReusableMethods.waitFor(2);
        Assert.assertTrue(blueRentalLoginPage.invalid_mail_message.getText().contains("email must be a valid email"));
        ReusableMethods.waitFor(2);
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("hw_nt_mail"));
        ReusableMethods.waitFor(2);
        Assert.assertTrue(!blueRentalLoginPage.invalid_mail_message.getText().contains("email must be a valid email"));




    }

}
