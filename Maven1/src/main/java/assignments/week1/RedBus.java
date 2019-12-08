package assignments.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://redbus.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("src").sendKeys("Chennai");
		driver.findElementByXPath("//li[@select-id='results[0]']").click();
		driver.findElementById("dest").sendKeys("Namakkal");
		driver.findElementByXPath("//li[@select-id='results[0]']").click();
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		driver.findElementById("search_btn").click();
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[4]").click();
		driver.findElementByXPath("(//label[@for='bt_AC'])[1]").click();
		WebElement x = driver.findElementByXPath("(//div[@class='result-sec']//ul)[1]");
		List<WebElement> test = x.findElements(By.xpath("(//li[@class='row-sec clearfix'])"));
//		List<WebElement> test = x.findElements(By.className("travels lh-24 f-bold d-color"));
		int bus = test.size();
		System.out.println("Total of " +bus +" buses have been found from Chennai to Namakkal today");
		driver.close();
			

	}

}
