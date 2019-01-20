package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private int speedInMph;
	private int range;
	private int price;
	
	public Jet(String model, int speedInMph, int range, int price) {
		
		this.model = model;
		this.speedInMph = speedInMph;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeedInMph() {
		return speedInMph;
	}

	public void setSpeedInMph(int speedInMph) {
		this.speedInMph = speedInMph;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int price() {
		return price;
	}

	public void price(int price) {
		this.price = price;
	}
	public void fly() {
		System.out.println("Standby for take off... ready all, 3, 2, 1, TAKE OFF!!!");
		System.out.println("");
		System.out.println("");
		System.out.println("      --     \\              --       \\ ");
		System.out.println("      |\\_____\\_______      |\\_______\\_____ ");
		System.out.println("     {|ZZZZZZZZZZZZZZZZ>     |ZZZZZZZZZZZZZZZZ>");
		System.out.println("             O      o               O       o");
		System.out.println("");
		
	}
	public void Listfleet() {
		
	}

}