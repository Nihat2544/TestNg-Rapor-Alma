package tests.tekrar;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
    @Test
    public void test01() {

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.hepsiburada.com");
        Driver.closeDriver();
    }
}
