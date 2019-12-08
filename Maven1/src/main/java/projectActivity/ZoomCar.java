package projectActivity;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.zoomcar.com/chennai");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		 driver.findElementByXPath("//div/div[2]/div[4]/div/div[3]").click();
		 driver.findElementByXPath("//button[text()='Next']").click();
		 driver.findElementByXPath("//div[contains(text(),'19')]").click();
		 driver.findElementByXPath("//button[text()='Next']").click();
//		 driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div[1]/text()").click();
//		 if(driver.findElementByXPath("//div[contains(text(),'18')]").getText()=="             18         ") {
			 driver.findElementByXPath("//button[text()='Done']").click();
//		 }
		 WebElement x = driver.findElementByXPath("//div/div[@class='car-list-layout']");
		 List<WebElement> listing = x.findElements(By.xpath("//div[@class='car-listing']"));
		 int count = listing.size();
		 System.out.println("Total cars listed is: " +count);

	}

}
