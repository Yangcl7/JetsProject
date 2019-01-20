package com.skilldistillery.jets;

public abstract class CargoCarrier extends CargoPlane {

	public CargoCarrier(String model, int speedInMph, int range, int price) {
		super(model, speedInMph, range, price);
	}
	public void loadCargo() {
		System.out.println("Loading cargo 10%.....25%...60%...100%..Loading complete.");
		System.out.println("       ___  ");
		System.out.println("         \\");
		System.out.println(" --   --  \\______");
		System.out.println("|__| |__| ________}");
		System.out.println("");
		}
	public void Listfleet() {
		System.out.println("Antonov An-225 Mriya, 528mph, 9,569mi, ");
		System.out.println("Boeing 787 Dreamliner");
		System.out.println("Airbus 380 Wide-body");
	}



}
