package VtigerPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrganizationPractice {

	public static void main(String[] args)
	{
//step:1--launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//step:2--login to the application
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
//step:3--navigate to organization link		
				driver.findElement(By.linkText("Organizations")).click();
				
//step:4--click on create organization lookup image
		driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
		
//step:5--create organization with mandatory field
		driver.findElement(By.name("accountname")).sendKeys("cv corp123");
		
//step:6---save
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
//Step:7---validate for organization
		String orgheader = driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();

		if (orgheader.contains("cv corp")) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

// Step :8----Logout
		WebElement element = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("signout successfully");
		driver.quit();
	}

}
