package pages.mobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPage extends PageObject {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText")
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
}
