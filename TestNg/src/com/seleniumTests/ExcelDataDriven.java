package com.seleniumTests;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;





public class ExcelDataDriven {
@Test (dataProvider="testData")
 public void Addition(String val1,String val2,String val3){//Excel values are String Data types by default
	//data conversion is required 
	int a=Integer.parseInt(val1);
	int b=Integer.parseInt(val2);
	int c=Integer.parseInt(val3);
	int result=a+b+c;
	System.out.println(result);
}
	
	
	//this is the test data
	@DataProvider(name="testData")
	
	public Object [][] readExcel() throws BiffException, IOException{
		File f=new File("/Users/capiwega/Documents/MY PAGES/ethiopianmusika/Testing/Development/Input.xls");
		Workbook w=Workbook.getWorkbook(f);//creating wb object
		Sheet s=w.getSheet(0);
		int Rows=s.getRows();//get row count
		int Columns=s.getColumns();//get col count 
		String  InputValue [][]=new String [Rows][Columns];//Two Dimentional Array to hold Rows, and col
		for(int i=0;i<Rows;i++){
			for(int j=0;j<Columns;j++){
				Cell c=s.getCell(j,i);//get cell object 
				InputValue[i][j]=c.getContents();//get the content of cell and assign to two dimentional array
				//System.out.println(InputValue[i][j]);
			}
			
		}
		return InputValue;
		
							
		
		
		
		
	}
}
