package stepMethod.mobile;

import net.serenitybdd.core.pages.PageObject;
import pages.mobile.LandingPage;

public class LandingPageMethod extends PageObject {
    LandingPage landingPage = new LandingPage();

    public void clickLocationField() {
        landingPage.locationField.waitUntilVisible().click();
        waitABit(2000);
    }

    public void clickIndonesiaCountry() {
        landingPage.IndonesiaSelector.waitUntilVisible().click();
        waitABit(2000);
    }

    public void clickOnBoardContinueBtn() {
        landingPage.onBoardContinueBtn.click();
        waitABit(2000);
    }

    public void clickSkipOnBoardBtn() {
        landingPage.skipOnBoardBtn.click();
        waitABit(2000);
    }

    public void clickSkipForNowBtn() {
        landingPage.skipForNowBtn.click();
        waitABit(2000);
    }

    public void clickNextToolTipBtn() {
        landingPage.nextToolTipBtn.click();
        waitABit(2000);
    }

    public void clickButtonLater() {
        landingPage.buttonLater.click();
        waitABit(2000);
    }

    public String getOnBoardTitle() {
        String title = landingPage.onBoardTitle.getText();
        waitABit(2000);
        return title;
    }
}
