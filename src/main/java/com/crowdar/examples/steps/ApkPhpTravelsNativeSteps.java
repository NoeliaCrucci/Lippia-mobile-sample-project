package com.crowdar.examples.steps;



import org.testng.Assert;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ApiDemoHome;
import com.crowdar.examples.pages.PHPTHomePage;
import com.crowdar.examples.pages.PHPTHotelDetailsPage;
import com.crowdar.examples.pages.PHPTHotelsResultsPage;
import com.crowdar.examples.pages.PHPTHotelsSearchPage;
import com.crowdar.examples.pages.PHPTPayPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApkPhpTravelsNativeSteps extends PageSteps{

	@Given("The user is in '([^']*)' search page")
	public void openApplication(String title) {
		
		Injector._page(PHPTHomePage.class).clickHotelsButton();
		Assert.assertEquals(Injector._page(PHPTHotelsSearchPage.class).getTitle(), title);
	}
	
	@When("The user clicks over Destination field and selects (.*) ARG")
	public void selectDestination(String destination) {
		Injector._page(PHPTHotelsSearchPage.class).selectDestination(destination);
			
	}
	
	@When("Clicks on Search")
	public void clickOnSearch() {
		Injector._page(PHPTHotelsSearchPage.class).clickSearchButton();
	}
	
	@When("Selects (.*) in the results list")
	public void findHotel(String hotel) throws InterruptedException {
		Injector._page(PHPTHotelsResultsPage.class).selectHotel(hotel);
		
	}
	
	@When("Books a room")
	public void selectRoom() {
		Injector._page(PHPTHotelDetailsPage.class).selectRoom();
	}
	
	@When("Completes Card info with (.*), (.*), (.*) and (.*)")
	public void completePaymentInfo(String ccNum, String name, String expMMYY, String cvv) {
		Injector._page(PHPTPayPage.class).completePaymentInfo(ccNum, name, expMMYY, cvv);
	}
	
	@When("Completes Personal info with (.*), (.*), (.*) and (.*) and clicks Continue button")
	public void completePersonalInfoAndCont(String name, String lastName, String email, String phone) {
		Injector._page(PHPTPayPage.class).completePersonalInfo (name, lastName, email, phone);
		Injector._page(PHPTPayPage.class).clickContinueBtn();
	}
	
	@Then("The user gets the payment confirmation message: '([^']*)'")
	public void confirmation(String OkMessage) {
		Injector._page(PHPTPayPage.class).ValidateValidationMessage(OkMessage);
		}
	
}
