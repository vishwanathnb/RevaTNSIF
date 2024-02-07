package com.tnsif.overriding;

public class Main {
	class Vehicle 
	{
		void run()
		{
			System.out.println("Vehicle is running");
		}
		class bike extends Vehicle
		{
			void run()
			{
				System.out.println("Bike is running");
			}
		}
	}

}

