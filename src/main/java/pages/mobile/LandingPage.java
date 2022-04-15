package pages.mobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPage extends PageObject {

    @FindBy(className = "android.widget.EditText")
    public WebElementFacade locationField;
}
