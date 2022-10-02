package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBeforeMethodAfterMethod;

import javax.swing.*;

public class Odev extends TestBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
     // 1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");
     // 2. Sign in butonuna basin
        driver.findElement(By.xpath("//*[@class='icon-signin']")).click();
     // 3. Login kutusuna “username” yazin
        WebElement loginKutusu = driver.findElement(By.xpath("//*[@id='user_login']"));
        loginKutusu.sendKeys("username");
     // 4. Password kutusuna “password” yazin
        WebElement posvordKutusu = driver.findElement(By.xpath("//*[@id='user_password']"));
        posvordKutusu.sendKeys("password");
     // 5. Sign in tusuna basin
        driver.findElement(By.xpath("//*[@value='Sign in']")).click();
        driver.navigate().back();
     // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        WebElement onlineBanking = driver.findElement(By.xpath("//*[@id='online-banking']"));
        onlineBanking.click();
        driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();
     // 7. “Purchase Foreign Currency” tusuna basin
        WebElement purchase = driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']"));
        purchase.click();
     // 8. “Currency” drop down menusunden Eurozone’u secin
        WebElement eurozone = driver.findElement(By.xpath("//*[@id='pc_currency']"));
                eurozone.sendKeys("Eurozene");
     // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(eurozone.getText().contains("Eurozene"));
        Thread.sleep(2000);
     // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
     // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)",
        //      "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
       //       "Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
        softAssert.assertTrue(eurozone.getText().contains("Select One"));
        Thread.sleep(2000);
        softAssert.assertTrue(eurozone.getText().contains("Australia (dollar)"));
        Thread.sleep(2000);
        softAssert.assertTrue(eurozone.getText().contains("Canada (dollar)"));
        Thread.sleep(2000);
        softAssert.assertTrue(eurozone.getText().contains("Switzerland (franc"));
    }
}
