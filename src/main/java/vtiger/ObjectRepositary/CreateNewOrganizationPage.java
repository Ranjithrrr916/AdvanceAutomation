package vtiger.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtilities.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility
{
	//step 1:create a separate pom class for every web page
	 
			//step 2:Identify all the web elements using annotations
			
  
  
  @FindBy(name = "accountname")
  private WebElement OrgNameEdt;
  
  @FindBy(xpath = "//select[@name=\"industry\"]")
  private WebElement IndustryDropDown;
  
 
  
  @FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
  private WebElement SaveBtn;
  
//Step 3:initialize these web elements with a constructor
	
		public CreateNewOrganizationPage(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
		}

		//step 4:provide getters to access these elements
		

		public WebElement getOrgNameEdt() {
			return OrgNameEdt;
		}

		public WebElement getIndustryDropDown() {
			return IndustryDropDown;
		}

		

		public WebElement getSaveBtn() {
			return SaveBtn;
		}
		
		//Business Library-Generic methods- Project Specific
		/**
		 * this method will create organization with necessory information
		 * @param ORGNAME
		 */
		public void createNewOrganization(String ORGNAME)
		{
			OrgNameEdt.sendKeys(ORGNAME);
	
			SaveBtn.click();
		}
		/** 
		 * this method will create organization with industry dropdown
		 * @param ORGNAME
		 * @param INDUSTRY
		 */

		public void createNewOrganization(String ORGNAME, String INDUSTRY)
		{
			OrgNameEdt.sendKeys(ORGNAME);
	        handleDropdown(IndustryDropDown, INDUSTRY);
			SaveBtn.click();
		}

		
  
}
