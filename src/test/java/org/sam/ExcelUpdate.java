package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.server.handler.GetElementRect;

public class ExcelUpdate {
	//Ecxel Update
	public static void main(String[] args) throws IOException {
		
	
	
	File f=new File("C:\\Users\\SIVA\\eclipse-workspace\\SampleMAven\\datadri\\ForDataDriven.xlsx");
	
	FileInputStream fn=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fn);
	
	Sheet s=w.getSheet("Sheet1");
	
	Row r = s.getRow(0);
	
	Cell c = r.getCell(0);
	
	
	if(c.equals("Name")) {
		
		c.setCellValue("Student Name");
		
	}
	
	FileOutputStream find=new FileOutputStream(f);
	
	w.write(find);
	
	System.out.println("Done");
	
	}
	
	
	

}
