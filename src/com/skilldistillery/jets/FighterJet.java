package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	@Override
	public void combat() {
		System.out.println("All fighters ready for combat..");
		System.out.println(getModel() + " engage...");
		System.out.println("~~ ~~~   ~~~    ~ ~   ~~~<|");
		System.out.println("                         <|       ");
		System.out.println("    o                   <\\     \\/");
		System.out.println("   .|.                     v___\\/");
		System.out.println("   /|\\      o              vvv");
		System.out.println("            .|.");
		System.out.println("            /|\\");
		System.out.println("");
		System.out.println("");
		System.out.println("        o");
		System.out.println("       .|.");
		System.out.println("       /|\\");

	}

	public FighterJet(String model, int speedInMph, int range, long price) {
		super(model, speedInMph, range, price);
		// TODO Auto-generated constructor stub
	}

}