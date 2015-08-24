package com.seleniumTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	public void login(){
	System.out.println("login successful");
}
	@AfterTest
	public void logout(){
		System.out.println("logout successful");
	}
	
	@Test (priority=1)
	
	public void search(){
		System.out.println("search successful");
	}
	@Test (priority=2)
	public void advanceSearch(){
		System.out.println("AdvanceSearch successful");
	}
	@Test (priority=3)
	public void buyProducts(){
		System.out.println("Purchase successful");
	}
	
}
