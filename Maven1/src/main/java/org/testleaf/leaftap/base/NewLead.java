package org.testleaf.leaftap.base;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projectActivity.LearnExcelData;

//import org.openqa.selenium.chrome.ChromeDriver;

public class NewLead extends ProjectSpecificMethod{
	@Test(dataProvider="dataPr")

	public void newLead(String Company, String FName, String SName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(Company);
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
		driver.findElementById("createLeadForm_lastName").sendKeys(SName);
		driver.findElementByName("submitButton").click();
		System.out.println("Title of the Page is: " +driver.getTitle());
	}
	
	@DataProvider
	public String[][] dataPr() throws IOException{
//		String data[][] = new String[2][3];
//		data[0][0]="Cognizant";
//		data[0][1]="Baskar";
//		data[0][2]="Duraisamy";
//		data[1][0]="Cognizant";
//		data[1][1]="Suganya";
//		data[1][2]="Thulasimani";
//		return data;
		LearnExcelData x = new LearnExcelData();
		return x.excelDataUsage("Data1");
	}

}
