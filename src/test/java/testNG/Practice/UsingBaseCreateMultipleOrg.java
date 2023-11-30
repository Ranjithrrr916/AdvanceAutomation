//package testNG.Practice;
//                                 //28-03
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import vtiger.GenericUtilities.BaseClass;
//import vtiger.GenericUtilities.PropertyFileUtility;
//import vtiger.GenericUtilities.WebDriverUtility;
//import vtiger.ObjectRepositary.CreateNewOrganizationPage;
//import vtiger.ObjectRepositary.HomePage;
//import vtiger.ObjectRepositary.LoginPage;
//import vtiger.ObjectRepositary.OrganizationInfoPage;
//import vtiger.ObjectRepositary.OrganizationsPage;
//@Test
//
//public class UsingBaseCreateMultipleOrg extends BaseClass
//{
//String ORGNAME =eUtil.readDataFromExcel("Organization", 1, 2)+jUtil.getRandomNumber();
//		
//
//		// Step 5: Navigate to Organizations link
//		HomePage hp = new HomePage(driver);
//		hp.clickOnOrganizationLink(); 
//
//		// Step 6: Click on Create Organization Look up Image
//		OrganizationsPage op = new OrganizationsPage(driver);
//		op.clickOnCreateOrgLookUpImg();
//
//		// Step 7: Create organization with mandatory Fields
//		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
//		cnop.createNewOrganization(ORGNAME, INDUSTRY);
//
//		// Step 8: Validate for Organization
//		vtiger.ObjectRepositary.OrganizationInfoPage oip = new OrganizationInfoPage(driver);
//		String OrgHeader = oip.getOrgnizationHeader();
//		
//		if (OrgHeader.contains(ORGNAME)) {
//			System.out.println(OrgHeader + " --- Organization Created ---");
//		} else {
//			System.out.println(" ----Organization creation Failed ----");
//		}
//}
//}
