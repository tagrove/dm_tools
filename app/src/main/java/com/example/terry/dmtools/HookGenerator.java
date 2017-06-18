package com.example.terry.dmtools;

import java.util.Scanner;

public class HookGenerator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean selectAgain = true;
		while (selectAgain) {
			System.out
					.println("Select a method of generation:\n1. Random\n2. Casual/Fun\n3. Dark Encounters\n4. Exploration\n5. Political Intrigue");
			int decision = scan.nextInt();
			System.out.print("Input number of adventures to generate: ");
			int loopAmount = scan.nextInt();
			System.out.println();

			switch (decision) {
			case 1:
				System.out.println("*******************************RANDOM******************************\n");
				for (int z = 0; z < loopAmount; z++) {
					script(loopAmount);
				}
				System.out.println("\n*******************************RANDOM******************************");
				break;
			case 2:
				System.out.println("*******************************CASUAL******************************\n");
				for (int z = 0; z < loopAmount; z++) {
					System.out.println(casualFun(loopAmount));
				}
				System.out.println("\n*******************************CASUAL******************************");

				break;
			case 3:
				System.out.println("***************************DARK ENCOUNTERS**************************\n");
				for (int z = 0; z < loopAmount; z++) {
					System.out.println(darkEncounters(loopAmount));
				}
				System.out.println("\n***************************DARK ENCOUNTERS**************************");
				break;
			case 4:
				System.out.println("*****************************EXPLORATION****************************\n");
				for (int z = 0; z < loopAmount; z++) {
					System.out.println(exploration(loopAmount));
				}
				System.out.println("\n*****************************EXPLORATION****************************");
				break;
			case 5:
				System.out.println("*****************************POLITICAL*******************************\n");
				for (int z = 0; z < loopAmount; z++) {
					System.out.println(politicalIntrigue(loopAmount));
				}
				System.out.println("\n*****************************POLITICAL*******************************");
				break;
			}
			System.out.println("\nSelect again?\n1. yes\n2. no");
			decision = scan.nextInt();
			if (decision == 2)
				selectAgain = false;
		}

	}

	public static void script(int loopAmount) {

		System.out.println(firstPlot(loopAmount));
		System.out.println();
		try {
			Thread.sleep(10); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

		return;
	}

	private static String firstPlot(int loopAmount) {
		double i = Math.random();
		int x = (int) (i * 100);

		if (x > -1) {
			double r = Math.random();
			x = (int) (r * 100);
			if (x > 80) {
				return darkEncounters(loopAmount);
			} else if (x > 60) {
				return casualFun(loopAmount);
			} else if (x > 40) {

				return exploration(loopAmount);
			} else if (x > 20) {

				return politicalIntrigue(loopAmount);
			} else if (x >= 0) {

				return exploration(loopAmount);
			} else
				return casualFun(loopAmount);

		}

		return "none (firstPlot default)";
	}

	public static String darkEncounters(int loopAmount) {
		double i = Math.random();
		int x = (int) (i * 100);
		System.out.print("Dark Encounters: ");

		if (x > -1) {
			double r = Math.random();
			x = (int) (r * 100);
			if (x > 80) {
				return "Your party has died and finds itself in the afterlife.  You are about to be judged for"
						+ " your sins";
			} else if (x > 60) {
				return "Your party has died and finds itself in the afterlife.  Your worst nightmares become"
						+ " reality.  ";
			} else if (x > 40) {

				return "A person claiming to be a long lost relative of a Player finds the party."
						+ " They seem to be in trouble.";
			} else if (x > 20) {

				return "One of the Player's home towns has burned to the ground.";
			} else if (x >= 0) {

				return "The party must strike a deal with a demon in order to learn a fact"
						+ " that nobody alive still knows.";
			}
			return "Your party has died";
		}
		return "default";
	}

	public static String exploration(int loopAmount) {
		double i = Math.random();
		System.out.print("Exploration: ");
		int x = (int) (i * 100);

		if (x > -1) {
			double r = Math.random();
			x = (int) (r * 100);
			if (x > 80) {
				return "A previously unseen trail has been found in the woods";
			} else if (x > 60) {
				return "The mayor of a growing town has asked you to help map the outskirts of the surrounding"
						+ " forests.";
			} else if (x > 40) {

				return "A new method of travel has been invented, opening an entirely new frontier.";
			} else if (x > 20) {

				return "Local children have unearthed a mysterious portal.";
			} else if (x >= 0) {

				return "The party stumbles upon an ancient carved statue that seems to have an aura.";
			}
			return "Your party has died";
		}
		return "default (exploration)";
	}

	public static String casualFun(int loopAmount) {

		double i = Math.random();
		System.out.print("Casual Fun: ");
		int x = (int) (i * 100);
		if (x > -1) {
			double r = Math.random();
			x = (int) (r * 100);
			if (x > 90) {
				return "The cows at a local farm keep managing to escape.  The farmers are offering"
						+ " a payment for an innovative fix for their solution";
			}else if (x > 80) {

				return "*****************80+******************";
			}else if (x > 70) {

				return "*****************70+******************";
			}
			
			else if (x > 60) {
				return "There is a local 3-legged race being run and a contestant has asked"
						+ " you to help train";
			}else if (x > 50) {

				return "*****************50+******************";
			}
			
			else if (x > 40) {

				return "You decide to enter a local pie eating contest";
			}else if (x > 30) {

				return "*****************30+******************";
			}
			
			else if (x > 20) {

				return "Money is needed to help save the local library from shutting down";
			}else if (x > 10) {

				return "*****************10+******************";
			} else if (x >= 0) {

				return "A mother has asked you to talk to some local ruffians who continuously"
						+ " bully her son";
			}
			return "default (casualFun)";
		}
		return "default (casual fun)";
	}

	public static String politicalIntrigue(int loopAmount) {
		double i = Math.random();
		int x = (int) (i * 100);
		System.out.print("Political Intrigue: ");

		if (x > -1) {
			double r = Math.random();
			x = (int) (r * 100);
			if (x > 90) {
				return "The local duke believes that someone is conspiring to kill him.";
			} else if (x > 80) {

				return "*****************80+******************";
			}

			else if (x > 70) {

				return "*****************70+******************";
			}

			else if (x > 60) {
				return "Travellers give reports of a new militia patrolling the roads";

			} else if (x > 50) {

				return "*****************50+******************";
			}

			else if (x > 40) {

				return "The matron of the most powerful family in town has fallen ill.";
			} else if (x > 30) {

				return "*****************30+******************";
			}

			else if (x > 20) {

				return "A large trading company is attempting to move into a nearby town.";
			} else if (x > 10) {

				return "******************10+******************";
			} else if (x >= 0) {

				return "Taxes in the town have recently doubled.";
			}
			return "none";
		}
		return "none";
	}

}
