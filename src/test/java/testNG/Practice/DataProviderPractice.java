package testNG.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice
{
	@Test(dataProvider = "getData")
	public void addToCart(String name,int price,int qty,String colour,boolean isavail) {

		System.out.println(name+"-"+price+"-"+qty+"-"+colour+"-"+isavail);
	}

	@DataProvider
	public Object[][] getData()
	{                           //row//cell
		Object[][] data =new Object[2][5];//two data sets of 4 details inside

		data[0][0]="samsung";
		data[0][1]=12000;
		data[0][2]=12;
		data[0][3]="black";
		data[0][4]=true;

		data[1][0]="ipho";
		data[1][1]=2000;
		data[1][2]=1;
		data[1][3]="white";
		data[1][4]=false;

		return data;

	}

}
