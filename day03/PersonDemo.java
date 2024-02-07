package com.tnsif.day03;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) 
	{
		Person obj = new Person();
		String name,gender;
		int income,age,tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		name = sc.nextLine();
		
		System.out.println("Enter gender");
		gender = sc.nextLine();
		
		System.out.println("Enter income");
		income = sc.nextInt();
		
		System.out.println("Enter age");
		age = sc.nextInt();
		
		System.out.println("Enter tax");
		tax = sc.nextInt();
		
		obj.setName(name);
		obj.setGender(gender);
		obj.setIncome(income);
		obj.setAge(age);
		obj.setTax(tax);
		
		System.out.println(obj);

	}

}
