package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AllJournals;
import pages.HomePage;
import pages.LoginPage;
import util.BaseClass;

public class HomePageSteps extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;
	AllJournals alljournals=new AllJournals();
	@Given("^User is in login page$")
	public void user_is_in_login_page() 
	{
		BaseClass.initialization();
	   
	}

	@When("^user logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logs_in_with_and(String username, String password)  {
		loginpage=new LoginPage();
		homepage=loginpage.login(username, password); 
	    
	}

	@Then("^user is navigated to Home page$")
	public void user_is_navigated_to_Home_page()  {
		String hometitle=homepage.verifyHomePageTitle();
		 Assert.assertEquals("Collaborate on -- CP", hometitle);
	    
	}

	@When("^user clicks on All Journals on Dashboard$")
	public void user_clicks_on_All_Journals_on_Dashboard()  {
		alljournals=homepage.clickJournals();
	   
	}

	@Then("^user is navigated to All Journals page$")
	public void user_is_navigated_to_All_Journals_page()  {
		boolean flag2=alljournals.display_journal_text();
		Assert.assertTrue(flag2);
	    
	}

	@Then("^user clicks on drop down arrow of Actions column to select Favorites$")
	public void user_clicks_on_drop_down_arrow_of_Actions_column_to_select_Favorites() 
	{
		alljournals.select_favorite_queries();
	    
	}

	@Then("^validate favorite queries are displayed$")
	public void validate_favorite_queries_are_displayed() 
	{
		boolean flag3=alljournals.display_favorite_star();
	    Assert.assertTrue(flag3);
	    
	}

	@When("^user is logging out from the application$")
	public void user_is_logging_out_from_the_application() 
	{
		homepage=new HomePage();
		homepage.logout();
	    
	}

	@Then("^User navigates to login page$")
	public void user_navigates_to_login_page() {
		loginpage=new LoginPage();
		String logintitle_postlgout=loginpage.validatePageTitle();
		System.out.println("Welcome to login page");
		Assert.assertEquals("Collaborate on -- CP", logintitle_postlgout);
	    
	}



}