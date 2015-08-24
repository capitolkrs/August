package com.seleniumTests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTests {
	
		//@BeforeGroups (groups={"sanity","regration"})
		public void login(){
		System.out.println("login successful");
	}
		@Test (groups={"sanity","regration"})
		public void logout(){
			System.out.println("logout successful");
		}
		
		@Test (groups={"sanity"})
		
		public void search(){
			System.out.println("search successful");
		}
		@Test (groups={"regration"})
		public void xyza(){
			System.out.println("xyza successful");
		}
		@Test (groups={"regration"})
		public void abcd(){
			System.out.println("abcd successful");
			
		}
		@Test (groups={"sanity","regration"})
		public void buyProducts(){
			System.out.println("buying products");
		}
		@Test (groups={"sanity","regration"})
		public void SearchProduct(){
			System.out.println("Searching products");
			}
}
