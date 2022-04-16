package stepMethod.mobile;

import net.serenitybdd.core.pages.PageObject;
import pages.mobile.HomePage;

public class HomePageMethod extends PageObject {
    HomePage homePage = new HomePage();

    public void clickFlightIconBtn() {
        homePage.flightIconBtn.click();
        waitABit(2000);
    }
}
