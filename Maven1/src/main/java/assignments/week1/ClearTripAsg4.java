package assignments.week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAsg4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		driver.findElementById("RoundTrip").click();
		driver.findElementById("FromTag").sendKeys("MAA", Keys.TAB);
		driver.findElementById("ToTag").sendKeys("NYC", Keys.TAB);
		WebElement dep = driver.findElementById("DepartDate");
		driver.findElementByLinkText("25").click();
		dep.sendKeys(Keys.TAB);
		WebElement ret = driver.findElementById("ReturnDate");
		driver.findElementByLinkText("25").click();
		ret.sendKeys(Keys.TAB);		
		WebElement x = driver.findElementByName("adults");
		Select adults = new Select(x);
		WebElement y = driver.findElementByName("childs");
		Select children = new Select(y);
		WebElement z = driver.findElementByName("infants");
		Select infant = new Select(z);
		adults.selectByVisibleText("2");
		children.selectByVisibleText("1");
		infant.selectByVisibleText("1");
		driver.findElementById("MoreOptionsLink").click();
		WebElement a = driver.findElementById("Class");
		Select travelClass = new Select(a);
		travelClass.selectByVisibleText("Premium Economy");
		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates", Keys.TAB);
		driver.findElementById("SearchBtn").click();
		
	}

}
