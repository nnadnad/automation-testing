package stepsDefinition.mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepMethod.mobile.FlightPageMethod;
import stepMethod.mobile.HomePageMethod;
import stepMethod.mobile.LandingPageMethod;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FlightPageSteps {
    LandingPageMethod landingPageMethod = new LandingPageMethod();
    HomePageMethod homePageMethod = new HomePageMethod();
    FlightPageMethod flightPageMethod = new FlightPageMethod();

//    @Given("user already on landing page and the title is {string}")
//    public void userAlreadyOnLandingPageAndTheTitleIs(String title) {
//        assertThat("on board title wrong", landingPageMethod.getOnBoardTitle() ,equalTo(title));
//    }

    @And("user choose location indonesia")
    public void userChooseLocationIndonesia() {
        landingPageMethod.clickLocationField();
        landingPageMethod.clickIndonesiaCountry();
    }

    @And("user click continue onboard button")
    public void userClickContinueOnboardButton() {
        landingPageMethod.clickOnBoardContinueBtn();
    }

    @And("user click skip information landing button")
    public void userClickSkipInformationLandingButton() {
        landingPageMethod.clickSkipOnBoardBtn();
    }

    @And("user click skip for now in sign in page")
    public void userClickSkipForNowInSignInPage() {
        landingPageMethod.clickSkipForNowBtn();
    }

    @And("user click nextToolTip button")
    public void userClickNextToolTipButton() {
        landingPageMethod.clickNextToolTipBtn();
    }

    @And("user click button later for enable location")
    public void userClickButtonLaterForEnableLocation() {
        landingPageMethod.clickButtonLater();
    }

    @And("user click flight search icon")
    public void userClickFlightSearchIcon() {
        homePageMethod.clickFlightIconBtn();
    }

    @And("user click all jakarta flight option")
    public void userClickAllJakartaFlightOption() {
        flightPageMethod.enterFromFlight();
        flightPageMethod.clickAllJKTFlight();
    }

    @And("user click all padang flight option")
    public void userClickAllPadangFlightOption() {
        flightPageMethod.enterToFlight();
        flightPageMethod.clickAllPDGFlight();
    }

    @Then("user click search flight button")
    public void userClickSearchFlightButton() {
        flightPageMethod.clickSearchFlightBtn();
    }


}
