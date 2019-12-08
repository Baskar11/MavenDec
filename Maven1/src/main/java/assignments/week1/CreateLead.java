package assignments.week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElementById("createLeadForm_firstName").sendKeys("Oliver");
		driver.findElementById("createLeadForm_lastName").sendKeys("Queen");
		WebElement x = driver.findElementByName("dataSourceId");
		Select EmpSource = new Select(x);
		EmpSource.selectByIndex(4);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("B");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("A");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Allen");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("560000");
		WebElement y = driver.findElementById("createLeadForm_industryEnumId");
		Select industry = new Select(y);
		industry.selectByIndex(3);
		WebElement z = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownership = new Select(z);
		ownership.selectByIndex(4);
		driver.findElementById("createLeadForm_sicCode").sendKeys("BD");
		driver.findElementById("createLeadForm_description").sendKeys("Lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Test");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("25647");
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		WebElement a = driver.findElementById("createLeadForm_currencyUomId");
		Select currency = new Select(a);
		currency.selectByIndex(10);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("ABCS");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Allen");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://test.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Barry Allen");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Star Labs");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Downtown");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Central City");
		WebElement b = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select province = new Select(b);
		province.selectByIndex(5);
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("SW192RS");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("SW");
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("ADB123");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7405882354");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test@test.com");
		driver.findElementByName("submitButton").click();
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstName);
		if(firstName=="Oliver") {
			System.out.println("An account for the lead 'Oliver' has been successfully created and first name is verified.");
		}
		driver.close();

	}

}
