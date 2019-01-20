package com.skilldistillery.jets;
import java.util.Scanner;

public class JetsApplication {
	 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	System.out.println("1: List fleet");
	System.out.println("2: Fly all jets");
	System.out.println("3: View fastest jet");
	System.out.println("4: View jet with longest range");
	System.out.println("5: Load all Cargo Jets");
	System.out.println("6: Dogfight!");
	System.out.println("7: Add a jet to Fleet");
	System.out.println("8: Quit");
	int menu = input.nextInt();
	
	
	switch(menu) {
	case '1':
		listFleet();
		break;
	case '2':
		fly();
		break;
	case '3':
		fastestJet();
		break;
	case '4':
		longestRangeJet();
		break;
	case '5':
		loadCargo();
		break;
	case '6':
		dogFight();
		break;
	case '7':
		addNewJet();
		break;
	case '8':
		System.out.println("QUIT");
		break;
	}

	 }
	private static void listFleet() {
	}
	private static Object fly() {
		return fly();
	}
	private static void fastestJet() {
		
	}
	private static void longestRangeJet() {
		
	}
	private static void loadCargo() {
		
	}
	private static void dogFight() {
		
	}
	private static void addNewJet() {
		
	}

}

