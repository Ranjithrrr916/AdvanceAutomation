package VtigerPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		//Step1:load the file in java readable format
		FileInputStream fis=new FileInputStream("./src/test/resources/AdvanceTestData.xlsx");
		
		//step2:create a workbook
		Workbook wb=WorkbookFactory.create(fis);
				
				//step3:get inside the sheet
				Sheet sh=wb.getSheet("Organization");
				
				//step4:get the used row
				Row rw=sh.getRow(1);
				
				//step5:create a cell
				 Cell ce=rw.createCell(7);
				 
				//step6:Write data into the cell
				 ce.setCellValue("ranjith");
				
				 //step7: Open the file in java written format
				 FileOutputStream fos=new FileOutputStream("./src/test/resources/AdvanceTestData.xlsx");
				 System.out.println("data added");
				 wb.close();
	}
}
