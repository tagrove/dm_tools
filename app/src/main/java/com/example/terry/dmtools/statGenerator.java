package com.example.terry.dmtools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class statGenerator {

	public static void main(String[] args) {

		ArrayList<Integer> diceArray = new ArrayList<Integer>();

		//diceArray = rollSixDice();

		//int highestThreeStats = HighestThreeStats(diceArray);
		int tempSum = 0;

		// Variable for the desired strength of the stats

		String desiredStrength = "noneYet";
		boolean finished = false;
		String actualStrength = "noneYet";
		Scanner keyboard = new Scanner(System.in);

		while (!finished) {
			System.out.println("What is the desired Strength of the stats?");
			System.out.println("1. Good\n2. Average\n3. Weak\n4. Specialized");

			desiredStrength = keyboard.nextLine();
			desiredStrength.toLowerCase();
			if (desiredStrength.equals("1")
					|| desiredStrength.equals("2")
					|| desiredStrength.equals("3")
					|| desiredStrength.equals("")) {
				finished = true;
			} else {
				System.out.println("Invalid input.");
			}
		}
		finished = false;
		while (!finished) {
			// Adds all dice up and stores the value as tempSum
			for (int i = 0; i < diceArray.size(); i++) {
				tempSum += diceArray.get(i);
				System.out.println("TempSum: " + tempSum);
			}

			// If the average (tempSum / 6) is > 11, the stats are flagged as
			// "good".
			if ((tempSum / 6) > 11) {
				System.out.println("Good Stats\nAverage: "
						+ (tempSum / 6));
				actualStrength = "good";
			}
			// If the sum of the top 3 is greater than or equal to 41, they're
			// labeled as "pretty good".
			
			else if ((tempSum / 6) > 9){
				System.out.println("Average Stats");
				System.out.println("Average: "+ (tempSum / 6));
				actualStrength = "average";
			}

			else {
				System.out.println("Average : " + (tempSum) / 6);
				actualStrength = "weak";
			}
			if (desiredStrength.equals(actualStrength)) {
				finished = true;
			}
			tempSum = 0;
		}

	}

	

	
}
