package com.example.terry.dmtools;

import java.util.ArrayList;
import java.util.Arrays;

public class NameList {

	ArrayList<String> names;

	public NameList() {
		names = new ArrayList<String>();
	}

	// Constructor with aRace parameter.
	// Current races: elf, dwarf, human, celestial, gnome
	public NameList(String aRace) {
		if (aRace.equalsIgnoreCase("elf")) {
			names = new ArrayList<String>(Arrays.asList("elf1", "elf2", "elf3",
					"elf4", "elf5", "elf6"));
		} else if (aRace.equalsIgnoreCase("dwarf")) {
			names = new ArrayList<String>(Arrays.asList("dwarf1", "dwarf2",
					"dwarf3", "dwarf4"));

		} else if (aRace.equalsIgnoreCase("human")) {
			names = new ArrayList<String>(Arrays.asList("human1", "human2",
					"human3", "human4"));

		} else if (aRace.equalsIgnoreCase("celestial")) {
			names = new ArrayList<String>(Arrays.asList("celes1", "celes2",
					"celes3", "celes4"));

		} else if (aRace.equalsIgnoreCase("gnome")) {
			names = new ArrayList<String>(Arrays.asList("gnome1", "gnome2",
					"gnome3"));

		}
	}
	
	public ArrayList<String> getNames(){
		return names;
	}
	
	public void setNames (ArrayList<String> nameList){
		names = nameList;
	}

}
