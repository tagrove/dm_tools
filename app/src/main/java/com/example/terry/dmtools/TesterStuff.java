package com.example.terry.dmtools;

import java.util.Arrays;


public class TesterStuff {
	public static void main(String[] args){
		
		
		//String name, int pop, String government, String[] races, String[] military,
//		String[] resources, String[] businesses
		Town town = new Town("random", 0, "random", null, null, null, null, null);
		
		System.out.println(town.getTownName());
		System.out.println(town.getTownPop());
		System.out.println(town.getGovernment());
		System.out.println(Arrays.asList(town.getRaces()));
		System.out.println(Arrays.asList(town.getMilitaryLeaders()));
		System.out.println(Arrays.asList(town.getResources()));
		System.out.println(Arrays.asList(town.getBusinesses()));
		
	}
}
