package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		JetField newJetField = new JetField();
		Scanner input = new Scanner(System.in);

		boolean menu = true;
		while (menu) {
			System.out.println("");
			System.out.println("Welcome, please choose an option below");
			System.out.println("______________________________________");
			System.out.println("1: List fleet");
			System.out.println("2: Fly all jets");
			System.out.println("3: View fastest jet");
			System.out.println("4: View jet with longest range");
			System.out.println("5: Load all Cargo Jets");
			System.out.println("6: Dogfight!");
			System.out.println("7: Add a jet to Fleet");
			System.out.println("8: Quit");

			int menuList = input.nextInt();
			if(menuList == 8) {
				System.out.println("Thank you for choosing SD19 Air Space");
				break;
			}

			switch (menuList) {
			case 1:
				newJetField.listFleet();
				break;
			case 2:
				newJetField.fly();
				break;
			case 3:
				newJetField.viewFastestJet();
				break;
			case 4:
				newJetField.viewLongestRange();
				break;
			case 5:
				newJetField.loadAllCargoJets();
				break;
			case 6:
				newJetField.dogFight();
				break;
			case 7:
				newJetField.addJet();
				break;
			case 8:
				System.out.println("QUIT");
				break;
			default:
				System.out.println("Invalid option");
				
			}
			
		}
		input.close();
	}
public void viewFastestJet() {
		
	}
	public void viewLongestRange() {
	}

	public void loadAllCargoJets() {
	}

	public void dogFight() {
	}

	public void addJet() {

	}

}