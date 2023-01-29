package techproed.tests.homework;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class NegativeTest {

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US100402(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("hw_nt_mail"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("hw_nt_pw"));
        blueRentalLoginPage.loginButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(blueRentalLoginPage.bad_credential_message.getText().contains("Bad credentials"));
    }
}
