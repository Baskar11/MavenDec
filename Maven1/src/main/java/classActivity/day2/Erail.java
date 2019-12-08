package classActivity.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB, Keys.TAB);		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NMKL", Keys.TAB);
		if(driver.findElementById("chkSelectDateOnly").isSelected()) {
			driver.findElementById("chkSelectDateOnly").click();
		}
		WebElement xyz = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> listing = xyz.findElements(By.tagName("tr"));
		int total = listing.size();
		System.out.println("Number of trains to Namakkal are: " +total);
		driver.close();
		
			
	}

}
