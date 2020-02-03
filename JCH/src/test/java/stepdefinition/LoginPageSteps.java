package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import util.BaseClass;

public class LoginPageSteps extends BaseClass{
	LoginPage loginpage;
	HomePage homepage=new HomePage();
	@Given("^I am in login page$")
	public void i_am_in_login_page() {
	    BaseClass.initialization();
	}

	@And("^verify Login page title$")
	public void verify_Login_page_title() {
		loginpage=new LoginPage();
		String logintitle=loginpage.validatePageTitle();
		//System.out.println(logintitle);
		Assert.assertEquals("Collaborate on -- CP", logintitle);
	   
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void i_enter_and_logs_in(String user, String pass) 
	{
		
		homepage=loginpage.login(user, pass); 
	}

		@Then("^I navigate to home page$")
	public void i_navigate_to_home_page() throws Throwable {
	    String hometitle=homepage.verifyHomePageTitle();
	    Assert.assertEquals("Collaborate on -- CP", hometitle);
	    
	}

		@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
	    boolean flag=homepage.verifyLoggedinUser();
	    Assert.assertTrue(flag);
	    
	}
		
		@When("^user log out from the application$")
		public void user_log_out_from_the_application() {
		   homepage.logout();
		    
		}

		@Then("^User is navigated to login page$")
		public void user_is_navigated_to_login_page()  {
			loginpage=new LoginPage();
			String logintitle_postlgout=loginpage.validatePageTitle();
			System.out.println("Welcome to login page");
			Assert.assertEquals("Collaborate on -- CP", logintitle_postlgout);
		}


}
