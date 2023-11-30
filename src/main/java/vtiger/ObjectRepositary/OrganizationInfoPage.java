package vtiger.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganizationInfoPage 
{    
	//step 1:create a separate pom class for every web page
	 
		//step 2:Identify all the web elements using annotations
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private  WebElement OrgHeaderText;
	
	
	//Step 3:initialize these web elements with a constructor

			public OrganizationInfoPage(WebDriver driver)
			{
			   PageFactory.initElements(driver, this);	
			}
			
			//step 4:provide getters to access these elements

			public WebElement getOrgHeaderText() 
			{
				return OrgHeaderText;
			}
			
			//Generic libraries
			/**
			 * this method will get the header text and return it to caller
			 * @return
			 */
			public String getOrgnizationHeader()
			{
				return OrgHeaderText.getText();
			}

		
	

}
