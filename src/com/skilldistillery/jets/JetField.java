package com.skilldistillery.jets;

public class JetField {
	
	public static void main(String[] args) {
		CombatReady F16 = new CombatReady("GDFalcon");
		CombatReady F22 = new CombatReady("LMRaptor");
		CargoCarrier AN225 = new CargoCarrier("Antonov");
		CargoCarrier BO787 = new CargoCarrier("Dreamliner");
		CargoCarrier A380 = new CargoCarrier("Airbus380");
		
		
		
		// The array must have extra space for adding Jets.
		Jet[] jets = new Jet[5];
		jets[0] = F16;
		jets[1] = F22;
		jets[2] = An225;
		jets[3] = BO787;
		jets[4] = A380;
		
		
		
	}
	

}
