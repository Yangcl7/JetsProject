package com.skilldistillery.jets;

public class FighterJet extends Jet {


public void combat(Jet engage) {
	System.out.println("All fighters ready for combat..");
	System.out.println( getModel() + " engage...");
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

@Override
protected String Flyalljets(Object fly) {
	// TODO Auto-generated method stub
	return null;
}

}