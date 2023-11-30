package VtigerPractice;



import java.io.IOException;

import vtiger.GenericUtilities.ExcelFileUtility;
import vtiger.GenericUtilities.JavaUtility;
import vtiger.GenericUtilities.PropertyFileUtility;
import vtiger.GenericUtilities.WebDriverUtility;

public class GenericUtilityPractice

{

	public static void main(String[] args) throws IOException, InterruptedException {
        PropertyFileUtility pUtil=new PropertyFileUtility();
                   
		String data=pUtil.readDataFromPropertyFile("url");
		System.out.println(data);
		
		
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String value=eUtil.readDataFromExcel("Organisation", 1, 2);
		System.out.println(value);
		
	//	eUtilwriteIntoExcel("organisation",10,7,value);
		//System.out.println("data added");
		
		JavaUtility jUtil=new JavaUtility();
		System.out.println(jUtil.getRandomNumber());
		System.out.println(jUtil.getSystemDate());
		System.out.println(jUtil.getSystemDate());
		
		WebDriverUtility wUtil=new WebDriverUtility();
		wUtil.maximizeWindow(null);
		
		Thread.sleep(2000);
		wUtil.minimizeWindow(null);
		
		
	}

}