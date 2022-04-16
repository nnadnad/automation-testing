package stepsDefinition.mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.mobile.FlightPage;
import pages.mobile.HomePage;
import pages.mobile.LandingPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class FlightPageSteps {
    LandingPage landingPage = new LandingPage();
    HomePage homePage = new HomePage();
    FlightPage flightPage = new FlightPage();

    @When("user choose location indonesia")
    public void userChooseLocationIndonesia() {
        landingPage.clickLocationField();
        landingPage.clickIndonesiaCountry();
    }

    @And("user click continue onboard button")
    public void userClickContinueOnboardButton() {
        landingPage.clickOnBoardContinueBtn();
    }

    @And("user click skip information landing button")
    public void userClickSkipInformationLandingButton() {
        landingPage.clickSkipOnBoardBtn();
    }

    @And("user click skip for now in sign in page")
    public void userClickSkipForNowInSignInPage() {
        landingPage.clickSkipForNowBtn();
    }

    @And("user click nextToolTip button")
    public void userClickNextToolTipButton() {
        landingPage.clickNextToolTipBtn();
    }

    @And("user click button later for enable location")
    public void userClickButtonLaterForEnableLocation() {
        landingPage.clickButtonLater();
    }

    @And("user click flight search icon")
    public void userClickFlightSearchIcon() {
        homePage.clickFlightIconBtn();
    }

    @And("user click all jakarta flight option")
    public void userClickAllJakartaFlightOption() {
        flightPage.enterFromFlight();
        flightPage.clickAllJKTFlight();
    }

    @And("user click all padang flight option")
    public void userClickAllPadangFlightOption() {
        flightPage.enterToFlight();
        flightPage.searchFlightInput();
        flightPage.clickAllPDGFlight();
    }

    @Then("user click search flight button")
    public void userClickSearchFlightButton() {
        flightPage.clickSearchFlightBtn();
    }


}
