package tests.day188;


import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPag;
import utilities.Driver;

public class C01_PageClassFaceBookTest {

    @Test
    public void test01() {
        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        // POM’a uygun olarak email, sifre kutularini ve giris yap
        // butonunu locate edin
        FacebookPag facebookPag = new FacebookPag();
        facebookPag.cookieButonu.click();
        Faker faker = new Faker();
        // Faker class’ini kullanarak email ve sifre degerlerini
        // yazdirip, giris butonuna basin
        facebookPag.email.sendKeys(faker.internet().emailAddress());
        facebookPag.pass.sendKeys(faker.internet().password());
        facebookPag.login.click();
        // Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPag.girisYapilamadi.isDisplayed());

    }
}
