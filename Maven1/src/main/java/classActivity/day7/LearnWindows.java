package classActivity.day7;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> x = driver.getWindowHandles();
		List<String> y = new ArrayList<String>();
		y.addAll(x);
		driver.switchTo().window(y.get(1));
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:/Img01.jpg");
		FileUtils.copyFile(scr, dest);
		driver.quit();
		

	}

}
