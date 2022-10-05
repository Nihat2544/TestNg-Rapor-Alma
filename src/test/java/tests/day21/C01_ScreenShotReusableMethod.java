package tests.day21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        //Hepsiburada sayfasina gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        //sayfanin resimni aliniz
        ReusableMethods.getScreenshot("hepsiburada");
        //sayfayi kapatin
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasina gidiniz
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        //Nutella aratitinz
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazisi Webelementinin resmini aliniz
        ReusableMethods.getScreenshotWebElement("Nutella",amazonPage.aramaSonucWE);
        //Sayfayi kapatiniz
    }
}
