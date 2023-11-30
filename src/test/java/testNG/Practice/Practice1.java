package testNG.Practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1
{
 @Test
 public void createUserTest()
 {
	 Assert.fail();
	 System.out.println("user created");
 }
 @Test(dependsOnMethods = "createUserTest")
 public void modifyUserTest()
 {
	 System.out.println("user modified");
 }
 @Test(enabled=false)
 public void deleteUserTest()
 {
	 System.out.println("user deleted");
 }
 
}
