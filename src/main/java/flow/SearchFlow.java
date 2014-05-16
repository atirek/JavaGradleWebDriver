package flow;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultPage;

import static org.junit.Assert.assertTrue;

public class SearchFlow {


    private HomePage homePage;
    private SearchResultPage searchResultPage;

    public SearchFlow() {
        homePage = new HomePage();
        searchResultPage = new SearchResultPage();
    }

    public void searchOneWayJourney(String origin, String dest, String dateOfTravel){
        homePage.selectOneWayRadio();
        homePage.closeDialogBox();
        homePage.selectOrigin(origin);
        homePage.selectDestination(dest);
        homePage.selectNumberOfPassenger();
        homePage.enterDepartureDate(dateOfTravel);
        homePage.clickOnSubmit();
    }



    public void selectJourneyAndContinue() {
        searchResultPage.selectFirstAvailableTicket();
        searchResultPage.acceptTermsAndConditions();
        searchResultPage.clickOnContinue();
    }

    public void verifySearchResult() {
        assertTrue("Search result table exist", searchResultPage.isSearchResultContainerDisplayed());
    }



}
