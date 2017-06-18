package com.example.terry.dmtools;

import java.util.Random;


public class randomNumGenerator {

	public static int num(int max, int min) {
		
		
		
		Random ran = new Random();
		
		int num = ran.nextInt((max - min) + 1) + min;
		System.out.println("num in randomNumGenerator.num = " + num);

		return num;
	}
	
}
