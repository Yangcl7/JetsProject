package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speedInMph;
	private int range;
	private long price;
	
	
	public Jet(String model, double speedInMph, int range, long price) {
		super();
		this.model = model;
		this.speedInMph = speedInMph;
		this.range = range;
		this.price = price;
		
	}
	public String output () {
		String output = "Model: " + model + ", Speed: " + speedInMph + ", Range: " + range + ", Price: " + price;
		return output;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedInMph() {
		return speedInMph;
	}

	public void setSpeedInMph(double speedInMph) {
		this.speedInMph = speedInMph;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long price() {
		return price;
	}

	public void price(long price) {
		this.price = price;
	}
	public void fly() {
		
		
	}
	public String Listfleet() {
		return "Jets [Model" + model + ", SpeedInMph " + speedInMph + ", Range " + range + ", Price " + price + "]";
	}
	public double getSpeedInMach() {
		return 0;
		
	}
	

	protected abstract String Flyalljets(Object fly);

}
