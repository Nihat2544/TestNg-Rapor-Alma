package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaPage {

    public HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronik;

    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement bilTablet;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-a4G0z3YJJWkQs7qKKuuj']")
    public List<WebElement> tumElementler;


}
