package com.example.terry.dmtools;

public class DNDCharacter {

	private String charName;  // Done
	private String charClass; // Done
	private String charRace;
	
	private int charStrength;     // Done
	private int charDexterity;	  // Done
	private int charConstitution; // Done
	private int charWisdom;		  // Done
	private int charIntelligence; // Done
	private int charCharisma;	  // Done
	private String alignment;	  // Done
	private int level;			  // Done
	private String backstory;	  // Done
	private String gender;		  // Done
	private Deity deity;		  // Done

	public DNDCharacter() {
		charName = "none";
		charClass = "none";
		charStrength = 0;
		charDexterity = 0;
		charConstitution = 0;
		charWisdom = 0;
		charIntelligence = 0;
		charCharisma = 0;
		alignment = "none";
		level = 0;
		backstory = "none";
		gender = "none";
		deity = null;
		charRace = "none";
	}

	public DNDCharacter(String aName, String aClass, String aRace, int aStrength, int aDex, int aCon, int anInt, int aWis,
                     int aCha, int aLevel, String anAlignment, String aGender,
                     Deity aDeity, String aBackstory) {
		charName = aName;
		charClass = aClass;
		charRace = aRace;
		charStrength = aStrength;
		charDexterity = aDex;
		charConstitution = aCon;
		charWisdom = aWis;
		charIntelligence = anInt;
		charCharisma = aCha;
		level = aLevel;
		alignment = anAlignment;
		gender = aGender;
		deity = aDeity;
		backstory = aBackstory;
	}

	
	public String getCharRace(){
		return charRace;
	}
	public void setCharRace(String aRace){
		charRace = aRace;
	}
	
	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	public String getCharClass(){
		return charClass;
	}
	
	public void setCharClass(String aClass){
		charClass = aClass;
	}
	

	public int getCharStrength() {
		return charStrength;
	}

	public void setCharStrength(int charStrength) {
		this.charStrength = charStrength;
	}

	public int getCharDexterity() {
		return charDexterity;
	}

	public void setCharDexterity(int charDexterity) {
		this.charDexterity = charDexterity;
	}

	public int getCharConstitution() {
		return charConstitution;
	}

	public void setCharConstitution(int charConstitution) {
		this.charConstitution = charConstitution;
	}

	public int getCharWisdom() {
		return charWisdom;
	}

	public void setCharWisdom(int charWisdom) {
		this.charWisdom = charWisdom;
	}

	public int getCharIntelligence() {
		return charIntelligence;
	}

	public void setCharIntelligence(int charIntelligence) {
		this.charIntelligence = charIntelligence;
	}

	public int getCharCharisma() {
		return charCharisma;
	}

	public void setCharCharisma(int charCharisma) {
		this.charCharisma = charCharisma;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if ((level > 20) || (level < 1)){
			System.out.println("Invalid level, must be within 1 and 20.");
			
		}
		
		
		this.level = level;
	}

	public String getBackstory() {
		return backstory;
	}

	public void setBackstory(String backstory) {
		this.backstory = backstory;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Deity getDeity() {
		return deity;
	}

	public void setDeity(Deity deity) {
		this.deity = deity;
	}
	

	

}
