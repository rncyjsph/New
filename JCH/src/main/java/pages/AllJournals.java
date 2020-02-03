package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BaseClass;

public class AllJournals extends BaseClass{
    @FindBy(xpath="//p[@class='ng-binding']")
    WebElement journalpgtext;
    
	@FindBy(xpath="//div[@id=\"Action\"]//span[@class='jch-dropdown-iconset']")
	WebElement dropdown;
	
	@FindBy(xpath="//label[contains(text(),'Favorites')]")
	WebElement favorites;
	
	@FindBy(xpath="//tr[@id='jqry845']//i[@class='icon-jch-star jch-favourite-icon active ng-scope']")
	WebElement favorite_star;
	
	public AllJournals()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean display_journal_text()
	{
		return journalpgtext.isDisplayed();
	}
	
	public void select_favorite_queries()
	{
		JavascriptExecutor d=(JavascriptExecutor)driver;
		d.executeScript("arguments[0].click()", dropdown);
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until((ExpectedConditions.elementToBeClickable(favorites)));
		
		JavascriptExecutor f=(JavascriptExecutor)driver;
		f.executeScript("arguments[0].click()", favorites);
		if (favorites.isDisplayed())
		{
		Actions action=new Actions(driver);
		action.click().perform();
		}

	}
	

	public boolean display_favorite_star()
	{
		return favorite_star.isDisplayed();
	}
	
	
	
}
