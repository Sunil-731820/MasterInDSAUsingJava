package com.java.ds.TaskAssignByMe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OperationOfEmploy { 
	
	public static List<Employ> addEmployInArrayList() {
//		Adding all Employ to The List
		List<Employ> listOfEmploy = new ArrayList<Employ>();
//1:		Yea it is Already Mentioned That add 10 Object only In The Array List So size = 10
		for(int i=0;i<3;i++) {
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The employ Id ");
	        int empId = sc.nextInt();
	        System.out.println("Enter The Employ First Name ");
	        String empFirstName = sc.next();
	        System.out.println("Enter The Employ Last name ");
	        String empLastName = sc.next();
	        System.out.println("Enter the City Name");
	        String empCity = sc.next();
	        System.out.println("Enter The Salary ");
	        double empSalary = sc.nextDouble();
	        System.out.println("Enter The Employ Email Id");
	        String empEmailId = sc.next();
	        System.out.println("Enter The Pincode ");
	        int empPincode = sc.nextInt();	
	        listOfEmploy.add(new Employ(empId, empFirstName, empLastName, empCity, empSalary, empEmailId, empPincode));
	        
		}
//		Displaying The List of The Employ Objects 		
		for(Employ employ : listOfEmploy) {
			System.out.println(employ.getEmpId()+ " "+ employ.getEmpFirstName()+ " "+ employ.getEmpLastName()+ " "+ employ.getEmpcity()+ " "+ employ.getEmpSalary()+ " "+ employ.getEmpEmailId()+ " "+ employ.getEmpPincode());
		}
		return listOfEmploy;
	}
	
//2 : Sort The Array List In The Descending Order 
	
	public static void sortEmployDataInDescendingOrder() {
		List<Employ> listOfEmploy = new ArrayList<Employ>();
		listOfEmploy = addEmployInArrayList();
		System.out.println("I am Inside The Sort Employ Data In Descending Order");
		for(Employ employ: listOfEmploy) {
			System.out.println(employ.getEmpId()+ " "+ employ.getEmpFirstName()+" "+ employ.getEmpLastName()+" "+ employ.getEmpcity()+ " "+ employ.getEmpSalary()+ " "+ employ.getEmpEmailId()+ " "+ employ.getEmpPincode());
		}
	}
//3 : Add Employ At The End Of The Array 
	
	public static void addEmployAtTheEndOfTheArrayList() {
		System.out.println("I am calling The AddEmploy List in The Array List");
		addEmployAtTheEndOfTheArrayList();
		
	}
	
//4 : Deleting The First object From The Array List 	

}
