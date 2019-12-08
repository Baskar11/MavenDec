package projectActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTestApp {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/account/login");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com", Keys.TAB);
		 driver.manage().window().maximize();
		 driver.findElementById("password").sendKeys("leaf@12");
		 driver.findElementById("buttonLogin").click();
		 Actions act = new Actions(driver);
		 WebElement x = driver.findElementByXPath("//*[@id=\"dashmenu\"]/div[5]/button");
		 act.moveToElement(x).click(driver.findElementByXPath("//ul/li/a[text()='Search for Vendor']")).build().perform();
		 driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		 driver.findElementById("buttonSearch").click();
		 System.out.println(driver.findElementByXPath("/html/body/div/div[2]/div/table/tbody/tr[2]/td[5]").getText());
		 driver.quit();
	}

}
