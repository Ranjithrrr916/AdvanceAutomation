package VtigerPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContactPagePractice {

	public static void main(String[] args)
	{
	 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
       driver.findElement(By.id("submitButton")).click();
       
       driver.findElement(By.linkText("Contacts")).click();
       driver.findElement(By.xpath("//img[@alt=\"Create Contact...\"]")).click();
       driver.findElement(By.name("lastname")).sendKeys("ram raj");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       
   String cont=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	     
      if (cont.contains("ram"))
      {
        System.out.println("pass");
      }
      else 
    	  System.out.println("fail");
   // Step :8----Logout
   		WebElement element = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
   		Actions action = new Actions(driver);
   		action.moveToElement(element).perform();
   		driver.findElement(By.linkText("Sign Out")).click();
   		System.out.println("signout successfully");
   		driver.quit();
	}

}
