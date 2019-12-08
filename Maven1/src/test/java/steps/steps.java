package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	ChromeDriver driver;
	
	@Given("Logs into the Leaftaps application")
	public void logsIntoTheLeaftapsApplication() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Enters the Company name (.*)")
	public void entersTheCompanyName(String comp) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(comp);
	}

	@Given("Enters the Firstname and Surname (.*) (.*)")
	public void entersTheFirstnameAndSurname(String Fn, String Sn) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fn);
		driver.findElementById("createLeadForm_lastName").sendKeys(Sn);
	}

	@When("The user clicks on Create lead")
	public void theUserClicksOnCreateLead() {
		driver.findElementByName("submitButton").click();
	}

	@Then("The new lead should be created")
	public void theNewLeadShouldBeCreated() {
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(" ");
		System.out.println(firstName);
		if(firstName=="Oliver") {
			System.out.println("New lead is created");
		}
		driver.close();

	}



}
