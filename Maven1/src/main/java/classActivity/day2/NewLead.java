package classActivity.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Baskar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Duraisamy");
		driver.findElementByName("submitButton").click();
		System.out.println("Title of the Page is: " +driver.getTitle());
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstName);
		if(firstName=="Oliver") {
			System.out.println("An account for the lead 'Oliver' has been successfully created and first name is verified.");
		}
		driver.close();
		
	}

}
