package vtiger.GenericUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of generic methods related to web drier actions
 * @author DELL
 *
 */
public class WebDriverUtility
{
	/**
	  * This method for maximizeing window
	  * 
	  */
		public void maximizeWindow(WebDriver driver)
		{
			driver.manage().window().maximize();//action
		}
		
		/**
		 * 
		 * This method will minimize the window
		 * 
		 */
		public void minimizeWindow(WebDriver driver)
		{
			driver.manage().window().minimize();
		}
	/**
	 * this method wait for 20sec for the page load
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * this method will wait until a particular webelement is visible
	 * @param driver
	 * @param element
	 */
	
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * this method will wait until a particular web element is clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this method will handle dropdowns by index
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element, int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * this method will handle dropdowns by value
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element, String value)
	{
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * this method will handle dropdowns by visibletext
	 * @param element
	 * @param index
	 */
	public void handleDropdown(String text,WebElement element )
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * this method will perform mousehover action on a webElement 
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();	
	}
	/**
	 * this method perform right click anywhere in the page
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();		
	}
	/**
	 * This method will perform Right Click on particular webElement
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();		
	}
	/**
	 * This method perform double click anywhere on the page
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * This method will perform double Click on particular webElement
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();		
	}
	/**
	 * This method will perform drag and drop from one element to another 
	 * @param driver
	 * @param element
	 */
	public void dragAndDropAction(WebDriver driver, WebElement srcelement, WebElement desteleElement)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, desteleElement).perform();
	}
	 /**
	  * This method will press the enter key
	  * @throws AWTException
	  */
	public void pressEnterKey() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	 /**
	  * This method will release the enter key
	  * @throws AWTException
	  */
	public void releaseEnterKey() throws AWTException
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * this method will handle frames with index
	 * @param driver
	 * @param index
	 */
	public void handleFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(0);
		 
	}
	/**
	 * this method will handle frames with nameOrid
	 * @param driver
	 * @param index
	 */
	public void handleFrame(WebDriver driver, String nameOrid)
	{
		driver.switchTo().frame(nameOrid);
    }
	/**
	 * this method will handle frames with web element
	 * @param driver
	 * @param index
	 */
	public void handleFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
    }
	/**
	 * this method will switch to immediate parent frame
	 * @param driver
	 */
	
	public void handleParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();	
	}
	/**
	 * this method will switch to default frame
	 * @param driver
	 */
	public void handleDefaultFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * this method will accept alert pop up
	 * @param driver
	 */
	public void  acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	/**
	 * this method will dismiss alert pop up
	 * @param driver
	 */
	public void  dismisAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * 
	 * this method will capture and return the alert text
	 * @param driver
	 * @return
	 */
	public void getAlertText(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	/**
	 * this method will take the screenshot and save it in screenshot folder
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./ScreenShots/"+screenshotName+".png");
		FileUtils.copyFile(src, dst);//commons io dependency
		
		return dst.getAbsolutePath();//used in extent reports
	}
	/**
	 * this method will switch to window based on partial window title
	 * @param driver
	 * @param partialWinTitle
	 */
	public void switchToWindow(WebDriver driver,String partialWinTitle  )
	{
		//step 1:capture all the window IDs
		Set<String> windIDs = driver.getWindowHandles();
		
		//step 2:use a for each loop and navigate to each window
		for(String win:windIDs)
		{
			//step 3:capture the title of each window
			String currentTitle = driver.switchTo().window(win).getTitle();
		     
			//step 4:compare the current title with partial window title
			if(currentTitle.contains(partialWinTitle));
			{
				break;
			}
		}
	}
	/**
	 * this method will scroll randomly downward
	 * @param driver
	 */
		public void scrollAction(WebDriver driver)
		{
		 JavascriptExecutor js=(JavascriptExecutor)	driver;
		 js.executeScript("window.scrollBy(0,500)", null);
		}
		
		/**
		 * this method will scroll down until the particular web element
		 * @param driver
		 * @param element
		 */
			public void scrollAction(WebDriver driver,WebElement element)
			{
			 JavascriptExecutor js=(JavascriptExecutor)	driver;
			 int y=element.getLocation().getY();
			 js.executeScript("window.scrollBy(0,"+y+")", element);
			}
		
		
}
