package com.seleniumTests;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	
	
@DataProvider (name="testData")
	public  Object [][] readExcel() throws BiffException, IOException{
		File f=new File("/Users/capiwega/Documents/MY PAGES/ethiopianmusika/Testing/Input.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		int rows= s.getRows();
		int columns=s.getColumns();
		
		//System.out.println(rows);
		//System.out.println(columns);
		
		String Inputdata [][] =new String [rows][columns];
		
		for(int i=0;i<rows;i++){
			for (int j=0;j<columns;j++){
				Cell c=s.getCell(j,i);
				Inputdata [i][j]=c.getContents();
				System.out.println(Inputdata[i][j]);
			}
		}
		return Inputdata;
		
		
		
	}
}
