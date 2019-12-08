package classActivity.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		driver.findElementById("RoundTrip").click();
		driver.findElementById("FromTag").sendKeys("MAA", Keys.DOWN, Keys.TAB);
		driver.findElementById("ToTag").sendKeys("NYC", Keys.DOWN, Keys.ENTER);
		WebElement x = driver.findElementByName("adults");
		Select adults = new Select(x);
		WebElement y = driver.findElementByName("childs");
		Select children = new Select(y);
		adults.selectByVisibleText("2");
		String j = x.getAttribute("tabIndex");
		int ind = Integer.parseInt(j);
		for(int i=0;i<ind;i++) {
			String txt = x.getText();
			System.out.println(txt);
		}
		children.selectByVisibleText("1");
		driver.findElementById("SearchBtn").click();
		System.out.println("Page is" +driver.getTitle() +driver.findElementById("homeErrorMessage").getText());
		driver.close();
				

	}

}
