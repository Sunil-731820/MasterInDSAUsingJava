package com.java.ds.JUnitTesting;
import org.junit.AfterClass;
import org.junit.BeforeClass;
public class DivisionTestCase {

//	called Only once before Starting  all the Test Cases
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In before Class Method");
	}
	
//	called only Once After the Finishing all The Test Cases
	@AfterClass
	public static void afterClass() {
		System.out.println("In AfterClass Method");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello ");
		System.out.println("I am calling Hi Method");
		afterClass();
		beforeClass();
	}

	
	
}
