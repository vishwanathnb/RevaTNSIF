package com.tnsif.day5.multilevel;

public class MultiLevelInheritance {
	
		public static void main(String[] args) {
			City city = new City();
			city.setCityName("Bangalore");
			city.setArea(264.2f);
			city.setStateName("Karnataka");
			city.setLanguage("Kannada");
			city.setCountryName("India");
			city.setCapital("Delhi");
			System.out.println(city);

		}

	}
