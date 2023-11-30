package VtigerPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyfilePractice {

	public static void main(String[] args) throws IOException 
	{
		//step1:load the file in java readable format using file input stream
		FileInputStream fis=new FileInputStream(".//src/test/resources/CommonData.properties");
		
		//step2:create an object of properties from java.util
		Properties property=new Properties();
		
		//step3:load file input stream into properties
		property.load(fis);
		
		//step4:using the key and read the  value
      String BROWSE=  property.getProperty("browser");
      System.out.println(BROWSE);
	}

}
