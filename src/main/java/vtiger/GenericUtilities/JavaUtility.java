package vtiger.GenericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * This class contains reusable methods of java 
 * @author DELL
 *
 */
public class JavaUtility {
	/**
	 * This method generate random number(will return a random number after every run)
	 * @param limit
	 * @return
	 */
	public int getRandomNumber() 
	{
		Random r = new Random();
		return r.nextInt(1000);
	}

	/**
	 * This method is used to fetch current system date
	 * @return
	 */
	public String getSystemDate()
	{
		Date d = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_sss");
		return d.toString();  //return sdf.format(date);
	}
	
	public String getSystemDateInFormat()
	{
		Date d=new Date();
		String[]darr=d.toString().split(" ");
		String date=darr[2];
		String month=darr[1];
		String year=darr[5];
		String time=darr[3].replace(":","_");
		String dateValue=date+"_"+month+"_"+year+"_"+time;
		return dateValue;
		
	}
}
