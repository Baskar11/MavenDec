package projectActivity;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookTest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElementById("email").sendKeys("9894852703");
		 driver.findElementById("pass").sendKeys("Suganyasugan770");
		 driver.findElementByXPath("//label/input[@value=\"Log In\"]").click();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
//		 ChromeDriver d = new ChromeDriver(options);
		 driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("TesLeaf Solutions",Keys.ENTER);
		 driver.findElementByXPath("//div/a[text()='TestLeaf'][1]").click();
		 driver.findElementByXPath("//button[@data-testid='page_profile_like_button_test_id']").click();
		 driver.close();
		 

	}

}
