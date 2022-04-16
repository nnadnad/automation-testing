package stepMethod.mobile;

import net.serenitybdd.core.pages.PageObject;
import pages.mobile.FlightPage;

public class FlightPageMethod extends PageObject {
    FlightPage flightPage = new FlightPage();

    public void enterFromFlight() {
        flightPage.fromFlightField.click();
        waitABit(2000);
    }

    public void clickAllJKTFlight() {
        flightPage.allJakartaFlightOption.click();
        waitABit(2000);
    }

    public void enterToFlight() {
        flightPage.toFlightField.click();
        waitABit(2000);
    }

    public void searchFlightInput() {
        flightPage.searchFlightBox.sendKeys("Padang");
        waitABit(2000);
    }

    public void clickAllPDGFlight() {
        flightPage.allPadangFlightOption.click();
        waitABit(2000);
    }

    public void clickSearchFlightBtn() {
        flightPage.searchFlightBtn.click();
        waitABit(3000);
    }


}
