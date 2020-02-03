package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BaseClass;

public class LoginPage extends BaseClass{

	//Page Factory//OR
	@FindBy(id="email_id")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@id=\"save_sla\"]")
	WebElement lgnbtn;
	
	/*@FindBy(xpath="//div[@class='signin-hdg']")
	WebElement lgmessage;*/
	
	//Initialization page objects
	public LoginPage()
	{

PageFactory.initElements(driver, this);

	}
	
	//Actions
	
	public String validatePageTitle()
	{   /*String welcometext= lgmessage.getText();
	System.out.println(welcometext);*/
		return driver.getTitle();
		
	}
	
	public HomePage login(String username,String password)
	{
		email.sendKeys(username);
		pass.sendKeys(password);
		lgnbtn.click();
		return new HomePage();
	}
	
	
	
}
