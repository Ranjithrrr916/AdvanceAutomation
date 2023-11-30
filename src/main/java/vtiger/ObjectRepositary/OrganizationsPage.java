package vtiger.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage
{
	//step 1:create a separate pom class for every web page
	 
	//step 2:Identify all the web elements using annotations
	
          @FindBy(xpath = "//img[@title=\"Create Organization...\"]")
       private WebElement CreateOrgLookUpImg;



//Step 3:initialize these web elements with a constructor

		public OrganizationsPage(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
		}

		//step 4:provide getters to access these elements
		public WebElement getCreateOrgLookUpImg()
		{
			return CreateOrgLookUpImg;
		}
		
		//Business Library-Generic methods- Project Specific
		
		/**
		 * this method will click on create org look up image
		 */
				public void clickOnCreateOrgLookUpImg()
				{
					CreateOrgLookUpImg.click();
				}
}

