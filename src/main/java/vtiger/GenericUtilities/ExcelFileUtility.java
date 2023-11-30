package vtiger.GenericUtilities;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains all the reusable methods to perform operations on excel
 * @author QPS-Basavanagudi
 *
 */
public class ExcelFileUtility 
{
	/**
	 * this method will read data from Excel file
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantsUtility.EXCEL_FILE_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		wb.close();
		return value;
		
	}
	
	/**
	 * this method will  write data into Excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeIntoExcel(String sheetName, int rowNum, int cellNum, String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantsUtility.EXCEL_FILE_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.createRow(rowNum);
		Cell cel=rw.createCell(cellNum);
		cel.setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(IConstantsUtility.EXCEL_FILE_PATH);
		wb.write(fos);
		wb.close();
		
	}
	/**
	 * This method will read data from excel sheet and return into data provider
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public Object[][] readDatafromExcelDataProvider(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IConstantsUtility.EXCEL_FILE_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int lastRow=sh.getLastRowNum();
	  int	lastcell=sh.getRow(0).getLastCellNum();
	  Object[][] data= new Object[lastRow][lastcell];
	  
	  for (int i = 0; i <lastRow; i++)//used to navigate to inside the row
	  {
		for (int j = 0; j < lastcell; j++)//cell
		{
			data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
	  return data;
	}
	
//	private Workbook workbook;
//	private DataFormatter df;
//	private Sheet sheet;
//	
//	/**
//	 * This method initializes excel workbook
//	 * @param path
//	 */
//	public void excelInitialization(String path) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(path);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			workbook = WorkbookFactory.create(fis);
//		} catch (EncryptedDocumentException | IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * This method is used to fetch single data from excel
//	 * @param sheetName
//	 * @param rowNum
//	 * @param cellNum
//	 * @return
//	 */
//	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) {
//		df = new DataFormatter();
//		sheet = workbook.getSheet(sheetName);
//		return df.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
//	}
//
//	/**
//	 * This method is used to write data in to excel
//	 * @param data
//	 * @param cellNum
//	 * @param rownum
//	 * @param path
//	 */
//	public void setDataToExcel(String data, int cellNum, int rownum, String path) {
//		Cell cell = sheet.getRow(rownum).createCell(cellNum);
//		cell.setCellValue(data);
//		
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream(path);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			workbook.write(fos);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//			fos.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * This method is used to close excel workbook 
//	 */
//	public void closeWorkbook() {
//		try {
//			workbook.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
