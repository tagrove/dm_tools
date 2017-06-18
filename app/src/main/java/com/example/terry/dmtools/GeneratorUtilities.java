package com.example.terry.dmtools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class GeneratorUtilities {

	public static String generateRace(String desiredRace) {
		String race = "noneYet";
		String[] charRaceArrayGood = new String[] { "Wood Elf", "Dwarf",
				"Dragonborn", "Halfling", "Human", "Gnome", "Half Elf",
				"High Elf", "Half Orc", "Half Ogre" };
		String[] charRaceArrayEvil = new String[] { "Duergar", "Dark Elf",
				"Orc", "Ogre", "Half Ogre", "Half Orc", "Tiefling" };

		if (desiredRace.equalsIgnoreCase("good")) {
			race = charRaceArrayGood[randomNum(charRaceArrayGood.length - 1, 0)];
		} else if (desiredRace.equalsIgnoreCase("evil")) {
			race = charRaceArrayEvil[randomNum(charRaceArrayEvil.length - 1, 0)];
		} else {
			String[] charRaceArrayBoth = new String[] { "Dwarf", "Halfling",
					"Human", "Gnome", "Half Elf", "High Elf", "Duergar",
					"Dark Elf", "Orc", "Ogre", "Half Ogre", "Half Orc",
					"Tiefling" };

			int ran = randomNum(charRaceArrayBoth.length - 1, 0);
			race = charRaceArrayBoth[ran];

		}

		return race;
	}

	public static String generateClass() {

		String[] charClasses = new String[] { "Bard", "Berserker", "Druid",
				"Paladin", "Monk", "Rogue", "Ranger", "Sorcerer", "Wizard",
				"Warlock", "Fighter" };
		String desiredClass = charClasses[randomNum(charClasses.length - 1, 0)];
		return desiredClass;
	}

	public static int randomNum(int max, int min) {
		Random ran = new Random();
		max = ran.nextInt((max - min) + 1) + min;
		// System.out.println("num in randomNumGenerator.num = " + num);
		return max;
	}

	public static int HighestThreeStats(ArrayList<Integer> diceArray) {

		int highestThreeStats = 0;
		for (int j = 0; j < 3; j++) {
			highestThreeStats += diceArray.get(j);
		}
		return highestThreeStats;
	}

	public static void OrderStats(ArrayList<Integer> diceArray) {
		Collections.sort(diceArray);
		Collections.reverse(diceArray);
		// System.out.println(diceArray);

	}

	public static ArrayList<Integer> rollSixDice(String charStrength) {

		Random random = new Random();
		ArrayList<Integer> returnArray = null;

		boolean proceed = false;

		while (!proceed) {
			int lowestNum = 18;
			int lowestPosition = 0;
			int totalSum = 0;
			ArrayList<Integer> tempArray = new ArrayList<Integer>();
			// Rolls 3 dice (d6) and adds the sum to the ArrayList
			for (int j = 0; j < 7; j++) {
				int tempNum = ((random.nextInt(6) + 1))
						+ ((random.nextInt(6) + 1)) + ((random.nextInt(6) + 1));
				tempArray.add(tempNum);
				totalSum += tempNum;
				// Determines if the current number is the lowest thus far
				if (tempNum < lowestNum) {
					lowestNum = tempNum;
					lowestPosition = j;
				}
			}
			totalSum -= tempArray.get(lowestPosition);
			tempArray.remove(lowestPosition);

			if (charStrength.equals("1")) {
				OrderStats(tempArray);
				return tempArray;
			} else if (charStrength.equals("2")) {
				// needs a high average
				if ((totalSum / 6) > 11) {
					OrderStats(tempArray);
					return tempArray;
				}
			} else if (charStrength.equals("3")) {
				// needs a medium average
				if ((totalSum / 6) > 8 && (totalSum / 6) < 11) {
					OrderStats(tempArray);
					return tempArray;
				}
			} else {
				// needs a low average
				if ((totalSum / 6) < 9) {
					OrderStats(tempArray);
					return tempArray;
				}
			}
		}
		return null;
	}

	/**
	 * Generates the stats for the character.
	 * 
	 * @param charStrength
	 *            - The desired strength of the stats for the character
	 * @return - the stats of the character
	 */
	public static ArrayList<Integer> generateStats(String charStrength) {
		ArrayList<Integer> statArray = rollSixDice(charStrength);
		System.out.println("Stats in generateStats: ");
		for (int i = 0; i < statArray.size(); i++) {
			System.out.println(statArray.get(i));
		}

		return statArray;
	}

	public static Deity addDeities(String anAlignment, boolean userSelectDeity) {

		String desiredAlignments = null;
		// System.out.println("anAlignment (in addDeities) = " + anAlignment);

		boolean proceed = false;
		while (!proceed) {
			if (anAlignment.equals("lg") && anAlignment.equals("ng")
					&& anAlignment.equals("cg") && anAlignment.equals("le")
					&& anAlignment.equals("ne") && anAlignment.equals("ce")
					&& anAlignment.equals("cn") && anAlignment.equals("ln")) {
				System.out
						.println("Invalid alignment!\nPlease choose a valid alignment: (lg, ng, cg, le, ne, ce, ln, nn, cn)");

			} else {
				proceed = true;
			}
		}

		// Neutral Neutral
		if (anAlignment.equals("nn")) {
			desiredAlignments = "all";

		}
		// Lawful Evil
		else if (anAlignment.equals("le")) {
			desiredAlignments = "leln";

		}
		// Lawful Good
		else if (anAlignment.equals("lg")) {
			desiredAlignments = "lgln";

		}
		// Lawful Neutral
		else if (anAlignment.equals("ln")) {
			desiredAlignments = "lgnnle";

		}
		// Neutral Good
		else if (anAlignment.equals("ng")) {
			desiredAlignments = "lgngcg";

		}
		// Neutral Evil
		else if (anAlignment.equals("ne")) {
			desiredAlignments = "lenece";

		}
		// Chaotic Good
		else if (anAlignment.equals("cg")) {
			desiredAlignments = "cgcn";

		}
		// Chaotic Evil
		else if (anAlignment.equals("ce")) {
			desiredAlignments = "cene";

		}
		// Chaotic Neutral
		else if (anAlignment.equals("cn")) {
			desiredAlignments = "nncn";
		}

		// System.out.println(desiredAlignments);

		Deity auril = new Deity("Auril, goddess of winter", "ne",
				"nature, tempest", "Six-pointed snowflake");
		Deity azuth = new Deity("Azuth, god of wizards", "ln", "knowledge",
				"Left hand pointing upward, outlined in fire");
		Deity bane = new Deity("Bane, god of tyranny", "le", "war",
				"Upright black right hand, thumb and fingers together");
		Deity beshaba = new Deity("Beshaba, goddess of misfortune", "ce",
				"tricker", "Black antlers");
		Deity bhaal = new Deity("Bhaal, god of murder", "ne", "death",
				"skull surrounded by a ring of blood droplets");
		Deity chauntea = new Deity("Chauntea, goddess of agriculture", "ng",
				"life", "sheaf of grain or a blooming rose over grain");
		Deity cyric = new Deity("Cyric, god of lies", "ce", "trickery",
				"White jawless skull on black or purple sunburst");
		Deity deneir = new Deity("Deneir, god of writing", "ng", "knowledge",
				"Lit candle above an open eye");
		Deity eldath = new Deity("Eldath, goddess of peace", "ng",
				"life, nature", "Waterfall plunging into still pool");
		Deity gond = new Deity("Gond, god of craft", "nn", "knowledge",
				"Toothed cog with four spokes");
		Deity helm = new Deity("Helm, god of protection", "ln", "life, light",
				"Staring eye on upright left gauntlet");
		Deity ilmater = new Deity("Ilmater, god of endurance", "lg", "life",
				"Hands bound at the wrist with red cord");
		Deity kelemvor = new Deity("Kelemvor, god of the dead", "ln", "death",
				"Upright skeletal arm holding balanced scales");
		Deity lathander = new Deity("Lathander, god of birth and renewal",
				"ng", "life, light", "Road traveling into a sunrise");
		Deity leira = new Deity("Leira, goddess of illusion", "cn", "trickery",
				"Point-down triangle containing a swirl of mist");
		Deity lliira = new Deity("Lliira, goddess of joy", "cg", "life",
				"Triangle of three six-pointed stars");
		Deity loviatar = new Deity("Loviatar, goddess of pain", "le", "death",
				"Nine-tailed barbed scourge");
		Deity malar = new Deity("Malar, god of the hunt", "ce", "nature",
				"Clawed paw");
		Deity mask = new Deity("Mask, god of thieves", "cn", "trickery",
				"Black mask");
		Deity mielikki = new Deity("Mielikki, goddess of forests", "ng",
				"nature", "Unicorn's head");
		Deity milil = new Deity("Milil, god of poetry and song", "ng", "light",
				"Five-stringed harp made of leaves");
		Deity myrkul = new Deity("Myrkul, god of death", "ne", "death",
				"White human skull");
		Deity mystra = new Deity(
				"Mystra, goddess of magic",
				"ng",
				"knowledge",
				"Circle of seven stars, or nine stars encircling a flowing red mist, or a single star");
		Deity oghma = new Deity("Oghma, god of knowledge", "nn", "knowledge",
				"Blank scroll");
		Deity savras = new Deity("Savras, god of divination and fate", "ln",
				"knowledge", "Crystal ball containing many kinds of eyes");
		Deity selune = new Deity("Sel�ne, goddess of the moon", "cg",
				"knowledge, life", "Pair of eyes surrounded by seven stars");
		Deity shar = new Deity("Shar, goddess of darkness and loss", "ne",
				"death, trickery", "Black disk encircled with a border");
		Deity silvanus = new Deity("Silvanus, god of wild nature", "nn",
				"nature", "Oak leaf");
		Deity sune = new Deity("Sune, goddess of love and beauty", "cg",
				"life, light", "Face of a beautiful red-haired woman");
		Deity talos = new Deity("Talos, god of storms", "ce", "tempest",
				"Three lightning bolts radiating from a central point");
		Deity tempus = new Deity("Tempus, god of war", "nn", "war",
				"Upright flaming sword");
		Deity torm = new Deity("Torm, god of courage and self-sacrifice", "lg",
				"war", "White right gauntlet");
		Deity tymora = new Deity("Tymora, goddess of good fortune", "cg",
				"trickery", "Face-up coin");
		Deity tyr = new Deity("Tyr, god of justice", "lg", "war",
				"Balanced scales resting on a warhammer");
		Deity umberlee = new Deity("Umberlee, goddess of the sea", "ce",
				"tempest", "Wave curling left and right");
		Deity waukeen = new Deity("Waukeen, goddess of trade", "nn",
				"knowledge, trickery",
				"Upright coin with Waukeen's profile facing left");

		Deity[] deityList = { waukeen, umberlee, tyr, tymora, torm, tempus,
				talos, sune, silvanus, shar, selune, savras, oghma, mystra,
				myrkul, milil, mielikki, mask, malar, loviatar, lliira, leira,
				lathander, kelemvor, ilmater, helm, gond, eldath, deneir,
				cyric, chauntea, bhaal, beshaba, bane, azuth, auril };

		ArrayList<Deity> selectedDeities;
		try {
			if (desiredAlignments.equals("all")) {
				selectedDeities = new ArrayList<Deity>(Arrays.asList(deityList));
				if (userSelectDeity) {
					Deity temp = selectDeity(selectedDeities);
					return temp;
				}

				return selectedDeities.get(randomNum(
						selectedDeities.size() - 1, 0));
			} else {

				selectedDeities = new ArrayList<Deity>();

				String alignmentA = null;
				String alignmentB = null;
				String alignmentC = null;

				if (desiredAlignments.length() == 2) {
					alignmentA = desiredAlignments;
				} else if (desiredAlignments.length() == 4) {
					alignmentA = desiredAlignments.substring(0, 2);
					alignmentB = desiredAlignments.substring(2, 4);
				} else if (desiredAlignments.length() == 6) {
					alignmentA = desiredAlignments.substring(0, 2);
					alignmentB = desiredAlignments.substring(2, 4);
					alignmentC = desiredAlignments.substring(4, 6);
				}

				// System.out.println("Alignments A B C: \n" + alignmentA + "\n"
				// + alignmentB + "\n" + alignmentC);
				for (int i = 0; i < deityList.length; i++) {

					if (deityList[i].getDeityAlignment().equals(alignmentA)) {
						// System.out.println("Match! AlignmentA");
						selectedDeities.add(deityList[i]);
					} else if (deityList[i].getDeityAlignment().equals(
							alignmentB)) {
						// System.out.println("Match! AlignmentB");
						selectedDeities.add(deityList[i]);
					} else if (deityList[i].getDeityAlignment().equals(
							alignmentC)) {
						// System.out.println("Match! AlignmentC");
						selectedDeities.add(deityList[i]);
					} else {
						// System.out.println(deityList[i].getDeityName() +
						// " didn't fit the requirements.");
					}

				}
				if (userSelectDeity) {
					Deity temp = selectDeity(selectedDeities);
					return temp;
				}
				return selectedDeities.get(randomNum(
						selectedDeities.size() - 1, 0));
			}

		} catch (NullPointerException npe) {
			System.out.println("Invalid alignment in Deities!");
		}
		return null;

	}

	private static Deity selectDeity(ArrayList<Deity> selectedDeities) {
		boolean proceed = false;
		Scanner keyboard = new Scanner(System.in);
		while (!proceed) {

			int userSelection = 0;
			for (int i = 0; i < selectedDeities.size(); i++) {
				System.out.println(i + ":"
						+ selectedDeities.get(i).getDeityName());
			}
			try {
				userSelection = keyboard.nextInt();
				keyboard.nextLine();

				if (userSelection > -1
						&& userSelection < selectedDeities.size()) {
					return selectedDeities.get(userSelection);
				} else {
					System.out.println("Invalid input!");
				}
			} catch (InputMismatchException ime) {
				System.out.println("Must be a valid integer!");
				userSelection = keyboard.nextInt();
				keyboard.nextLine();
			}
		}

		return null;
	}
}
