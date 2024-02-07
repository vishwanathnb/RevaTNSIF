package com.tnsif.day2;

public class TypeCasting {
	public static void main(String[] args)
	{
		//Implicit Type Casting //widening(smaller to bigger datatype)
		float f=42.7f;
		double d=f;
		System.out.println(d);
		
		char ch = 'A';
		int a = ch;
		System.out.println(a);
		
		//Explicit Type Casting //narrowing (bigger to smaller datatype)
		double f1 =11.65d;
		float f2 = (float) f1;
		System.out.println(f2);
		
		int a1 = 66;
		char ch1 = (char) a1;
		System.out.println(ch1);
		
		
	}

}
