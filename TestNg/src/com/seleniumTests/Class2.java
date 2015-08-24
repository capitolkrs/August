package com.seleniumTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*TESTNG ANNOTATIONS
@Test  Makes Method as Test Case

	@BeforeSuite- this is the very first code that will runn in the intire package
	@AfterSuite- this is the very last code the will be executed in the entire package

		@BeforeTest -this is class indipendent and will run first before any @test Annotation-This will run before all testcases (launch Browser)
		@AfterTest -this is class indipendent and will run last after any @test Annotation-This will run after all testcases (close Browser)
		
				@BeforeClass -Pre-condition for all test cases in a class-This will run first before any test case in the class
				@AfterClass -Post-condition for all Test cases in a class
			
					@BeforeMethod -Pre-Condition for every Test case in a single class-This will run before each test(login-search, login-purchase, login-addfriend)
					@AfterMethod -Post condition for every Test case in a single class-This will run after each test(Search-logout, purchase-logout, addfriend-logout)


*
*
*parallel= "methods" TestNG will run all the methods in separate thread
Parallel="classes" testing will run all the methods in the same class in the same thread
parallel="tests" TestNG will run all the methods in the same <test> tag in same thread

8-Grouping Test cases


*
*
*
*
*/
public class Class2 {
	
	@BeforeMethod
	public void verifyLogin(){
		System.out.println("verified login");
	}
	@Test (priority=1)
	
	public void accountSummary(){
		System.out.println("search successful");
	}
	@Test (priority=2)
	public void fundTransfer(){
		System.out.println("AdvanceSearch successful");
	}
	@Test
	public void billPayment(){
		System.out.println("login successful");
	}
	
}

