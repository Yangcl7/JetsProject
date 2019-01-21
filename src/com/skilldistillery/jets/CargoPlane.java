package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speedInMph, int range, long price) {
		super(model, speedInMph, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println(this.getModel() + "Loading cargo");
		
	}

	@Override
	protected String Flyalljets(Object fly) {
		return null;
	}
	

}
