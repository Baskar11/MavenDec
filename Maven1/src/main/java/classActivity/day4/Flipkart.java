package classActivity.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder = new Actions(driver);
		WebElement elec = driver.findElementByXPath("//span[text()='Electronics']");
		builder.moveToElement(elec).perform();
		driver.findElementByXPath("//li[@class='_1KCOnI _3ZgIXy']//a[text()='Mi']").click();
		
		
		
	
	}

}
