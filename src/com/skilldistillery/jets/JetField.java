package com.skilldistillery.jets;

import java.util.Scanner;

public class JetField {
	 Jet[] jets = new Jet[10];
	

	public void fly() {
		System.out.println("Ready for take off");
		for (int i = 0; i < jets.length; i++) {
		}
	}

	public void viewFastestJet() {

	}

	public void listFleet() {
		System.out.println("Display list of fleet");
		for (int i = 0; i < jets.length; i++) {
			System.out.println(jets[i]);
		}

	}

	public void viewLongestRange() {
	}

	public void loadAllCargoJets() {
	}

	public void dogFight() {
	}

	public void addJet() {

	}

//	public JetField(Jet[] jets) {
//		
////		this.jets = jets;
////		FighterJet F16 = new FighterJet("F16 Fighting Falcon", 1_500, 2_622, 1_800_000);
////		FighterJet F22 = new FighterJet("Lockheed Martin F22 Raptor", 1_498, 1_839, 900_000_000);
////		CargoPlane AN225 = new CargoPlane("Antonov An-225 Mriya", 528, 9_561, 2_500_000);
////		CargoPlane BO787 = new CargoPlane("Boeing 787 DreamerLiner", 593, 8_823, 2_646_000);
////		CargoPlane A380 = new CargoPlane("Airbus A380", 634, 9_448, 4_456_000);
////
////		jets[0] = F16;
////		jets[1] = F22;
////		jets[2] = AN225;
////		jets[3] = BO787;
////		jets[4] = A380;
//	}
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
	

}
