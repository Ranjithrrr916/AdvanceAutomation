package VtigerPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyserPractice {

	@Test(retryAnalyzer =vtiger.GenericUtilities.RetryAnalyseImplimentation.class )
	public void sample()
	{
		//Assert.fail();
		System.out.println("hi");
	}
}
