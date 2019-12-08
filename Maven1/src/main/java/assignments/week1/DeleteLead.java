package assignments.week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//div[@class='x-form-item requiredField']/following::input[@name='firstName'][3]").sendKeys("Oliver");
		driver.findElementByXPath("//div[@class='x-form-item requiredField']/following::input[@name='lastName'][3]").sendKeys("Queen");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3500);
		driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a").click();
//		driver.findElementByPartialLinkText("10").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		

	}

}
