package pages.mobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FlightPage extends PageObject {

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"flight_searchform_view_container\"]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText")
    public WebElementFacade fromFlightField;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"flight_searchform_view_container\"]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.EditText")
    public WebElementFacade toFlightField;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"flight_searchform_button_search\"]")
    public WebElementFacade searchFlightBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
    public WebElementFacade searchFlightBox;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public WebElementFacade allJakartaFlightOption;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public WebElementFacade allPadangFlightOption;

    public void enterFromFlight() {
        fromFlightField.click();
        waitABit(2000);
    }

    public void clickAllJKTFlight() {
        allJakartaFlightOption.click();
        waitABit(2000);
    }

    public void enterToFlight() {
        toFlightField.click();
        waitABit(2000);
    }

    public void searchFlightInput() {
        searchFlightBox.sendKeys("Padang");
        waitABit(2000);
    }

    public void clickAllPDGFlight() {
        allPadangFlightOption.click();
        waitABit(2000);
    }

    public void clickSearchFlightBtn() {
        searchFlightBtn.click();
        waitABit(3000);
    }
}
