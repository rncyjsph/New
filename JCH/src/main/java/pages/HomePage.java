package pages;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//b[@class='ng-binding ng-scope']")
    WebElement userlabel;
	
	@FindBy(linkText="All Journals")
	WebElement dashboard_alljournals;
	
	
	
	@FindBy(xpath="//a[contains(text(),'LOG OUT')]")
	WebElement logout;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLoggedinUser()
	{
		return userlabel.isDisplayed();
	}
	
	public AllJournals clickJournals()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", dashboard_alljournals);
		return new AllJournals();
	}
	
	public void logout()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until((ExpectedConditions.elementToBeClickable(logout)));
		JavascriptExecutor lg=(JavascriptExecutor)driver;
		lg.executeScript("arguments[0].click()", logout);
	}
	
} 
