package vtiger.ObjectRepositary;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;

import vtiger.GenericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility
{
 
	//step 1:create a separate pom class for every web page
	 
			//step 2:Identify all the web elements using annotations
	@FindBy(linkText = "Contacts")
	private WebElement ContactsLink;
	
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationLink;
	
	@FindBy(linkText = "Opportunities")
	private WebElement OppertunitiesLink;
	
	
	
	@FindBy(xpath = "//img[(@src=\"themes/softed/images/user.PNG\")]")
	private WebElement  AdministratorImg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignoutLink;
	
	//Step 3:initialize these web elements with a constructor
	 public HomePage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	 }

		//step 4:provide getters to access these elements

	public WebElement getContactsLink()
	{
		return ContactsLink;
	}

	public WebElement getOrganizationLink()
	{
		return OrganizationLink;
	}

	public WebElement getOppertunitiesLink()
	{
		return OppertunitiesLink;
	}

	public WebElement getAdministratorImg()
	{
		return AdministratorImg;
	}

	public WebElement getSignoutbtn() 
	{
		return SignoutLink;
	}
	
	//Business Library-Generic methods- Project Specific
	 public void clickOnOrganizationLink()
	 {
		 
		 OrganizationLink.click();
     }
	 public void clickOnContactsLink()
	 {
		 
		 ContactsLink.click();
     }
	 public void logoutOfApp(WebDriver driver)
	 {
		 mouseHoverAction(driver, AdministratorImg);
		
		 SignoutLink.click();
	 }
	
	
	 
}
