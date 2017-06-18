package com.example.terry.dmtools;

import java.util.Arrays;
import java.util.Random;

public class Town {
	private String townSize;
	private String townName;
	private int townPop;
	private String government;
	private String[] races = new String[10];
	private String[] politicalLeaders = new String[10];
	private String[] militaryLeaders = new String[10];
	private String[] resources = new String[10];
	private String[] businesses = new String[10];

	public Town() {
		townName = "none";
		townPop = 0;
		government = "none";
		races = null;
		politicalLeaders = null;
		militaryLeaders = null;
		resources = null;
		businesses = null;
	}

	public Town(String name, int pop, String government, String[] races, String[] politicalLeaders,
			String[] military, String[] resources, String[] businesses) {

		if (name.equals("random")) {
			townName = generateName();
		} else {
			townName = name;
		}
		if (townPop == 0) {
			townPop = generatePop();
		} else {
			townPop = pop;
		}
		if (government.equals("random")) {
			this.government = generateGovernment();
		} else {
			this.government = government;
		}

		if (races == null) {
			this.races = generateRaces();
		} else {
			this.races = Arrays.copyOf(races, races.length);
		}

		if (military == null) {
			militaryLeaders = generateMilitary();
		} else {
			this.militaryLeaders = Arrays.copyOf(military, military.length);
		}
		if (resources == null) {
			this.resources = generateResources();
		} else {
			this.resources = Arrays.copyOf(resources, resources.length);
		}
		if (businesses == null) {
			this.businesses = generateBusinesses();
		} else {
			this.businesses = Arrays.copyOf(businesses, businesses.length);
		}

	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public int getTownPop() {
		return townPop;
	}

	public void setTownPop(int townPop) {
		this.townPop = townPop;
	}

	public String getGovernment() {
		return government;
	}

	public void setGovernment(String government) {
		this.government = government;
	}

	public String[] getRaces() {
		return Arrays.copyOf(races, races.length);
	}

	public void setRaces(String[] races) {
		this.races = races;
	}

	public String[] getMilitaryLeaders() {
		return Arrays.copyOf(militaryLeaders, militaryLeaders.length);
	}

	public void setMilitaryLeaders(String[] militaryLeaders) {
		this.militaryLeaders = militaryLeaders;
	}

	public String[] getResources() {
		return Arrays.copyOf(resources, resources.length);
	}

	public void setResources(String[] resources) {
		this.resources = resources;
	}

	public String[] getBusinesses() {

		return Arrays.copyOf(businesses, businesses.length);
	}

	public void setBusinesses(String[] businesses) {
		this.businesses = businesses;
	}

	private String[] generateBusinesses() {
		String[] businesses = new String[10];
		businesses[0] = "random business 0";
		businesses[1] = "random business 1";

		return Arrays.copyOf(businesses, businesses.length);
	}

	private String[] generateResources() {
		String[] resources = new String[10];
		resources[0] = "random resource 0";
		resources[1] = "random resources 1";
		return Arrays.copyOf(resources, resources.length);
	}

	private String[] generateMilitary() {
		
		
		String[] military = new String[10];
		military[0] = "random military 0";
		military[1] = "random military 1";
		return Arrays.copyOf(military, military.length);
	}

	private String[] generateRaces() {
		
		
		if (townPop < 200){
			// Generate Method 1
		} else if (townPop < 5000) {
			// Generate Method 2
		} else {
			
		}
		
		
		String[] racesTemp = new String[10];
		races[1] = "random race 1";
		races[0] = "random race 0";

		return Arrays.copyOf(races, races.length);
	}

	private String generateGovernment() {
		Random ran = new Random();
		String govt = null;
		if (townPop > 5000) {
			String[] governments = { "Democracy", "Confederacy", "Bureaucracy",
					"Dictatorship", "Feudalism", "Magocracy", "Monarchy", "Theocracy"
			};
			govt = governments[ran.nextInt(governments.length)];
		}else {
			
			String[] governments = {"Democracy", "Confederacy", "Feudalism", "Magocracy", "Theocracy"};

			govt = governments[ran.nextInt(governments.length)];
		}
		
		
		
		
		return govt;
	}

	private int generatePop() {
		Random ran = new Random();
		double pop = ran.nextDouble();
		int population;
		if (pop > 0.93) {
			// 125,001 +
			population = ran.nextInt(300000) + 125000;
		} else if (pop > 0.80) {
			population = ran.nextInt(99999) + 25001;
			// 25,001 - 125,000
		} else if (pop > 0.60) {
			population = ran.nextInt(19999) + 5001;
			// 5,001 - 25,000
		} else if (pop > 0.45) {
			population = ran.nextInt(3999) + 1001;
			// 1,001 - 5,000
		} else if (pop > 0.30) {
			population = ran.nextInt(800) + 200;
			// 200 - 1,000
		}

		else if (pop > 0.16) {
			population = ran.nextInt(149) + 51;
			// 51 - 200
		} else {
			population = ran.nextInt(25) + 25;
			// 25 - 50
		}
		return population;
	}

	private String generateName() {
		String prefix = "noneYet";
		String suffix = "noneYet";
		Random ran = new Random();
		if (ran.nextInt(3) > 0) {
			prefix = Resources.townPrefix[ran
					.nextInt(Resources.townPrefix.length)];
			suffix = Resources.townSuffix[ran
					.nextInt(Resources.townSuffix.length)];

		} else {
			prefix = Resources.townPrefix2[ran
					.nextInt(Resources.townPrefix2.length)];
			suffix = Resources.townSuffix2[ran
					.nextInt(Resources.townSuffix2.length)];

		}

		String townName = prefix + suffix;
		return townName;
	}

}
