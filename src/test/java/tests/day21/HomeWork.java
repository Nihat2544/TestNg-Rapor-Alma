package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBeforeMethodAfterMethod;

import java.util.ArrayList;

public class HomeWork  {
    @Test
    public void HomeWork(){
        // Hepsiburada Sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hpsbUrl"));
        // Elektronik altinda bilgisayar/ tablet altindaki tum linkleri tiklayalim
        HepsiBuradaPage hepsiBuradaPage = new HepsiBuradaPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hepsiBuradaPage.elektronik).perform();
        actions.moveToElement(hepsiBuradaPage.bilTablet).perform();
        int tumEelementler=0;
        for (int i = 0; i < hepsiBuradaPage.tumElementler.size(); i++) {
                try {
                    tumEelementler++;
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

        }


        // Her linkten sonra o sayfaya gittigimizi test edelim
        // Sayfayi kapatin
    }

