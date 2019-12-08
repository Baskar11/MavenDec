package classActivity.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("//button[text()='Try it']").click();
		 Alert al = driver.switchTo().alert();
		 al.sendKeys("Baskar");
		 al.accept();

	}

}
