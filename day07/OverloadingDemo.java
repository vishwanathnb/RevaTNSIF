package com.tnsif.day07;

public class OverloadingDemo {

	public static void main(String[] args) {

System.out.println(".........constructor overloading.........");
		Point p = new Point(); //Default constructor invoked
		System.out.println(p);
		
		Point p2 = new Point(10.0f);// single argument
		System.out.println(p2);
		Point p3 = new Point(10.0f,6.9f);//two parameters
		
		System.out.println(p3);
		
		System.out.println("...............method overloading.......");
		
		System.out.println("Addition of two integers"+MethodOverloading.addition(100,200));
		System.out.println("Addition of two floating numbers"+MethodOverloading.addition(10.f,12.5f));
		System.out.println("Addition of two float"+MethodOverloading.addition(100,20.f));
		System.out.println("Addition of two float"+MethodOverloading.addition(10.0f,200));
		System.out.println("Addition of two strings"+MethodOverloading.addition("Reva","ECE"));
		
	}

}
