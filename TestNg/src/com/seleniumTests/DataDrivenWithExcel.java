	package com.seleniumTests;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenWithExcel {
	@Test(dataProvider="testdata")
	public void Addition(String val1,String val2, String val3){
		int a=Integer.parseInt(val1);
		int b=Integer.parseInt(val2);
		int c=Integer.parseInt(val3);
		int result=a+b+c;
		System.out.println(result);
		
	}
	
	@DataProvider(name="testdata")
	public  Object[][] readexcel() throws BiffException, IOException{
		File f=new File("/Users/capiwega/Documents/MY PAGES/ethiopianmusika/Testing/Input.xls");
		Workbook w=Workbook.getWorkbook(f);
		
		Sheet s= w.getSheet(0);
		int rows=s.getRows();
		int columns=s.getColumns();
		
		String Inputdata [][]=new String [rows][columns];
		for(int i=0;i<=rows;i++){
			for(int j=0;j<=rows;j++){
				Cell c=s.getCell(j,i);
				Inputdata [i][j]=c.getContents();
			}
			
		}
		return Inputdata;
		
		
		
	}

}
