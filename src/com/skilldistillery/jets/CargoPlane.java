package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speedInMph, int range, long price) {
		super(model, speedInMph, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading cargo "+ getModel() + " 10%.....25%...60%...100%..Loading complete.");
		System.out.println("       ___  ");
		System.out.println("         \\");
		System.out.println(" --   --  \\______");
		System.out.println("|__| |__| ________}");
		System.out.println("");
		
	}


}
