package vtiger.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
	{
		//step 1:create a separate pom class for every web page
	 
		//step 2:Identify all the web elements using annotations
		
		@FindBy(name = "user_name")
		private WebElement UserNameEdt;
		
		@FindBy(name="user_password")
		private WebElement PasswordEdt;
		
		@FindAll({@FindBy(id = "submitButton"),@FindBy(xpath = "//input[@type='submit']")})
        private WebElement SubmitBtn;
		
		//Step 3:initialize these web elements with a constructor
		
		public LoginPage(WebDriver driver)
		{
		   PageFactory.initElements(driver, this);	
		}
		
		//step 4:provide getters to access these elements

	public WebElement getUserNameEdt() 
		{
			return UserNameEdt;
		}

		public WebElement getPasswordEdt()
		{
			return PasswordEdt;
		}

		public WebElement getSubmitBtn() 
		{
			return SubmitBtn;
		}
		
		//Business Library-Generic methods- Project Specific
		 /**
		  * This method will login to application
		  * @param USERNAME
		  * @param PASSWORD
		  */
		public void loginToApplication(String USERNAME, String PASSWORD)
		{
			UserNameEdt.sendKeys(USERNAME);
			PasswordEdt.sendKeys(PASSWORD);
			SubmitBtn.click();
		}
		
		
	}
