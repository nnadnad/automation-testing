package pages.mobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPage extends PageObject {

    @FindBy(id = "com.traveloka.android:id/edit_text_field")
    public WebElementFacade locationField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public WebElementFacade IndonesiaSelector;

    @FindBy(id = "com.traveloka.android:id/on_board_button_continue")
    public WebElementFacade onBoardContinueBtn;

    @FindBy(id = "com.traveloka.android:id/text_skip")
    public WebElementFacade skipOnBoardBtn;

    @FindBy(id = "com.traveloka.android:id/text_skip")
    public WebElementFacade skipForNowBtn;

    @FindBy(id = "com.traveloka.android:id/text_view_tooltip_ok")
    public WebElementFacade nextToolTipBtn;

    @FindBy(id = "com.traveloka.android:id/button_later")
    public WebElementFacade buttonLater;

    @FindBy(id = "com.traveloka.android:id/on_board_title")
    public WebElementFacade onBoardTitle;

    public void clickLocationField() {
        locationField.click();
        waitABit(2000);
    }

    public void clickIndonesiaCountry() {
        IndonesiaSelector.click();
        waitABit(2000);
    }

    public void clickOnBoardContinueBtn() {
        onBoardContinueBtn.click();
        waitABit(2000);
    }

    public void clickSkipOnBoardBtn() {
        skipOnBoardBtn.click();
        waitABit(2000);
    }

    public void clickSkipForNowBtn() {
        skipForNowBtn.click();
        waitABit(2000);
    }

    public void clickNextToolTipBtn() {
        nextToolTipBtn.click();
        waitABit(2000);
    }

    public void clickButtonLater() {
        buttonLater.click();
        waitABit(2000);
    }

    public String getOnBoardTitle() {
        String title = onBoardTitle.getText();
        waitABit(2000);
        return title;
    }
}
