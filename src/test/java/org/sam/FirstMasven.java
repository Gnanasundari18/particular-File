package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstMasven {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\SIVA\\eclipse-workspace\\SampleMAven\\datadri\\ForDataDriven.xlsx");
		FileInputStream str = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(str);
		Sheet s = book.getSheet("Sheet1");

		Row r = s.getRow(2);

		Cell c = r.getCell(1);

		System.out.println(c);

		int i = s.getPhysicalNumberOfRows();

		System.out.println(i);

		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++)

		{
			Cell c1 = r.getCell(j);
			System.out.println(c1);
		}

//		for (int i1 = 0; i1 < s.getPhysicalNumberOfRows(); i1++) {
//			Row r1 = s.getRow(i);
//
////			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//			Cell c2 = r.getCell(j);
//
//				System.out.println(c2);

			}
		}

	


