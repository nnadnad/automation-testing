package pages.web;

import io.cucumber.java.de.Wenn;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class homePage extends PageObject {

    @FindBy(xpath = "//div[contains(text(),'Flights')]")
    public WebElementFacade flightsBtn;

    @FindBy(xpath = "//div[@class='css-901oao r-1sixt3s r-1b43r93 r-majxgm r-rjixqe r-ymttw5 r-oyd9sg r-fdjqy7'][normalize-space()='Flights']")
    public WebElementFacade flightsOption;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1k97etb r-1naam9t r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']//div[@class='css-1dbjc4n r-1q9bdsx r-d045u9 r-tbmifm r-16eto9q']")
    public WebElementFacade oneWayRadioBtn;

    @FindBy(xpath = "//input[@placeholder='Origin']")
    public WebElementFacade formInput;

    @FindBy(xpath = "//input[@placeholder='Destination']")
    public WebElementFacade destinationInput;

    @FindBy(xpath = "//input[@value='1 Adult, 0 Child, 0 Infant']")
    public WebElementFacade numberOfPassengersInput;

    @FindBy(xpath = "//div[@class='css-901oao css-bfa6kz r-cwxd7f r-13awgt0 r-1sixt3s r-ubezar r-majxgm r-135wba7 r-fdjqy7'][normalize-space()='Economy']")
    public WebElementFacade seatClassInput;

    @FindBy(xpath = "//div[@class='css-901oao css-bfa6kz r-13awgt0 r-1sixt3s r-ubezar r-majxgm r-135wba7 r-fdjqy7']")
    public WebElementFacade economySeatClassOption;

    @FindBy(xpath = "//div[normalize-space()='Adult']")
    public WebElementFacade adultOption;

    @FindBy(xpath = "//div[@data-testid='passengers-stepper-minus-adult']//img")
    public WebElementFacade adultMinusOption;

    @FindBy(xpath = "//div[@class='css-901oao r-1sixt3s r-1o4mh9l r-b88u0q r-f0eezp r-q4m81j']")
    public WebElementFacade donePassengersOption;






}
