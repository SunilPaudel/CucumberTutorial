package stepDefinitation;

import cucumber.api.java.en.*;

public class BookTickets {
	
	@Given("^the Chrome browser is launched$")
	public void launchChrome(){
		System.out.println("Chrome Browser launched");
	}
	
	@And("^the url is loaded$")
	public void urlLoaded(){
		
	}
	
	@When("^from \"([^\"]*)\" to \"([^\"]*)\" cities are selected$")
	public void citiesSelected(String from, String to){
		
	}
	
	@And("^the \"([^\"]*)\" is selected$")
	public void journeyTypeselected(String journeyType) {

	}

	@And("^the dates \"([^\"]*)\" to \"([^\"]*)\" are selected$")
	public void datesSelected(String arg1, String arg2) {

	}

	@Then("^the search flights button is clicked$")
	public void searchBtnClicked() {


	}

	@Then("^the flights are displayed$")
	public void flightsDisplayed() {

	}

}
