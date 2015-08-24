package com.seleniumTests;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium {
	WebDriver driver=new FirefoxDriver();
	String URL="http://yahoo.com";
	String path="/Users/capiwega/Documents/MY PAGES/ethiopianmusika/Testing/Development/GmailLogin.xls";
		@BeforeTest
		public void launchBrowser(){
				driver.get(URL);
					
		}
		@Test (dataProvider="testData")
		
		public void launchGmail(String usrName,String pswd){
		System.out.println(usrName);
		System.out.println(pswd);
		
		}
		
		
				
		
		@DataProvider (name="testData")
		public Object [][] getCredential() throws BiffException, IOException{
			File f=new File(path);
			Workbook w=Workbook.getWorkbook(f);
			Sheet s=w.getSheet(0);
			int Row=s.getRows();
			int Column=s.getColumns();
			String input [][]=new String [Row][Column];
			for(int i=1;i<Row;i++){
				for(int j=1;j<Column;j++){
					Cell c=s.getCell(j,i);
					input [i][j]=c.getContents();
					System.out.println(input[i][j]);
					
				}
			}
			return input;
			
		}

}
