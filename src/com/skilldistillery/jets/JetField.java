package com.skilldistillery.jets;

import java.util.Scanner;

public class JetField {
	Jet[] jets = new Jet[10];

	public void fly() {
		
		for (int i = 0; i < jets.length; i++) {
			if(jets[i] != null) {
				jets[i].fly();
			}
		}

	}

	public void listFleet() {
		System.out.println("Display list of fleet");
		System.out.println();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].getModel() + " " + jets[i].getSpeedInMph() + " " + jets[i].getRange() + " " + jets[i].price());
			} else {
				break;
			}
		}
	}

	public void viewFastestJet() {
		double fastestSpeed = 0;
		Jet fastestJet = null;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			} else if (jets[i].getSpeedInMph() > fastestSpeed) {
				fastestSpeed = jets[i].getSpeedInMph();
				fastestJet = jets[i];
			}
		}
		System.out.println(
				"The fastest jet is " + fastestJet.getModel() + " And the speed is " + fastestJet.getSpeedInMph());

	}

	public void viewLongestRange() {
		double longestRange = 0;
		Jet longestRangeJet = null;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			} else if (jets[i].getRange() > longestRange) {
				longestRange = jets[i].getRange();
				longestRangeJet = jets[i];
			}
		}
		System.out.println("The Jet with the longest range is " + longestRangeJet.getModel() + " And the range is "
				+ longestRangeJet.getRange());
	}

	public void loadAllCargoJets() {
		for (int i = 0; i < jets.length; i++) {
			if(jets[i] != null && jets[i] instanceof CargoPlane) {
				CargoPlane newCargoPlane = (CargoPlane) jets[i];
				newCargoPlane.loadCargo();
			}
		}
		
	}


	public void dogFight() {
		for (int i = 0; i < jets.length; i++) {
			if(jets[i] != null && jets[i] instanceof FighterJet) {
				FighterJet newFighterJet = (FighterJet) jets[i];
				newFighterJet.combat(newFighterJet);
			}
		}
	}

	public void addJet() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What's the model? ");
		String model = kb.nextLine();
		System.out.println("What's the speed?");
		int speed = kb.nextInt();
		System.out.println("What's the range?");
		int range = kb.nextInt();
		System.out.println("What's the price?");
		long price = kb.nextLong();
		Jet jet = new JetLmpl(model, speed, range, price);
		for (int i = 0; i < jets.length; i++) {
			if(jets[i] == null) {
				jets[i] = jet;
				System.out.println("Add a jet " + jet);
				break;
			}
			
		}

	}

	public JetField() {
		FighterJet F16 = new FighterJet("F16 Fighting Falcon", 1_500, 2_622, 1_800_000);
		FighterJet F22 = new FighterJet("Lockheed Martin F22 Raptor", 1_498, 1_839, 900_000_000);
		CargoPlane AN225 = new CargoPlane("Antonov An-225 Mriya", 528, 9_561, 2_500_000);
		CargoPlane BO787 = new CargoPlane("Boeing 787 DreamerLiner", 586, 8_823, 2_646_000);
		CargoPlane A380 = new CargoPlane("Airbus A380", 634, 9_448, 4_456_000);

		jets[0] = F16;
		jets[1] = F22;
		jets[2] = AN225;
		jets[3] = BO787;
		jets[4] = A380;
	}
//
//	public void listFleet() {
//		for(int i = 0; i < jets.length; i++);
//			if(jets !=null) {
//				System.out.println("Jet model is: " + jets.getModel() + "Max speed(MPH): " + jets.getSpeedInMph()
//                + "Max range(Miles): " + jets.getRange() + " Price/Unit cost is: " + jets.getPrice());
//				}
//			else{
//				break;
//			}
//	}

//	public JetField() {
//		super();
//		this.jets = jets;
//	}

}
