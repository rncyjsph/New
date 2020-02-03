package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jchqa.codemantra.com/login");
		driver.findElement(By.id("email_id")).sendKeys("akash@codemantra.com");
		driver.findElement(By.id("password")).sendKeys("Santhan#123");
		driver.findElement(By.xpath("//button[@id=\"save_sla\"]")).click();
		WebElement journal=driver.findElement(By.linkText("All Journals"));
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", journal);
		
		WebElement dropdown=driver.findElement(By.xpath("//div[@id=\"Action\"]//span[@class='jch-dropdown-iconset']"));
		JavascriptExecutor d=(JavascriptExecutor)driver;
		d.executeScript("arguments[0].click()", dropdown);
		
		WebElement fav=driver.findElement(By.xpath("//label[contains(text(),'Favorites')]"));
		JavascriptExecutor f=(JavascriptExecutor)driver;
		f.executeScript("arguments[0].click()", fav);
		if (fav.isDisplayed())
		{
		Actions action=new Actions(driver);
		action.click().perform();
		}
		//Thread.sleep(1000);
//driver.quit();
	}

}
