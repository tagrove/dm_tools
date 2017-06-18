package com.example.terry.dmtools;

import com.example.terry.dmtools.Town;

import java.util.Arrays;


public class TownTester {
	public static void main(String[] args){
		
		
		//String name, int pop, String government, String[] races, String[] military,
//		String[] resources, String[] businesses
		String[] races = {"orcs", "dwarves"};
		
		Town town = new Town("random", 0, "random", races, null, null, null, null);
		
		System.out.println(town.getTownName());
		System.out.println(town.getTownPop());
		System.out.println(town.getGovernment());
		System.out.println(Arrays.asList(town.getRaces()));
		System.out.println(Arrays.asList(town.getMilitaryLeaders()));
		System.out.println(Arrays.asList(town.getResources()));
		System.out.println(Arrays.asList(town.getBusinesses()));
		
	}
}
