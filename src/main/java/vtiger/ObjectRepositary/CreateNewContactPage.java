package vtiger.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtilities.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility
{
	//step 1:create a separate pom class for every web page
	 
	//step 2:Identify all the web elements using annotations
		 
	 @FindBy(name="lastname")
	 private WebElement LastNameEdt;
	    
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement SaveBtn;
	 
	 @FindBy(xpath="//input[@name='account_id']/following-sibling::img[@title='Select']")
	 private WebElement OrgLookUpImg;
	 
	 @FindBy(xpath ="//input[@name='search_text']")
	 private WebElement OrgSearchEdt;
	 
	 @FindBy(xpath ="//input[@name=\"search\"]")
	 private WebElement OrgSearchBtn;
	 
	//Step 3:initialize these web elements with a constructor
		public CreateNewContactPage(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
		}
		//step 4:provide getters to access these elements

//	
		public WebElement getLastNameEdt() 
		{
			return LastNameEdt;
		}			
			public WebElement getSaveBtn() {
			return SaveBtn;
		}

		public WebElement getOrgLookUpImg() {
			return OrgLookUpImg;
		}


		public WebElement getOrgSearchEdt() {
			return OrgSearchEdt;
		}
//

		public WebElement getOrgSearchBtn() {
			return OrgSearchBtn;
		}


		//Business Library-Generic methods- Project Specific
		/**
		 * this method will create contact with madnatory data
		 * @param LASTNAME
		 */
			public void createNewContact(String LASTNAME)
			{
				LastNameEdt.sendKeys(LASTNAME);
				SaveBtn.click();
			}
			/**
			 * this method will create contact with organization
			 * @param driver
			 * @param LASTNAME
			 * @param ORGNAME
			 * @throws InterruptedException 
			 */
			public void createNewContact(WebDriver driver, String LASTNAME,String ORGNAME) 
			{
				LastNameEdt.sendKeys(LASTNAME);
				OrgLookUpImg.click();
				switchToWindow(driver,"Accounts");  //account= partial window name
				OrgSearchEdt.sendKeys(ORGNAME);
				OrgSearchBtn.click();
				driver.findElement(By.xpath("//a[.='"+ORGNAME+"']")).click();
				switchToWindow(driver, "Contacts");
				
				SaveBtn.click();
			}		
			
}
