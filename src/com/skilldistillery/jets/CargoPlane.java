package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speedInMph, int range, long price) {
		super(model, speedInMph, range, price);
	}

	@Override
	public void loadCargo() {
		
	}
		

	@Override
	protected String Flyalljets(Object fly) {
		// TODO Auto-generated method stub
		return null;
	}

}
