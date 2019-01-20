package com.skilldistillery.jets;
import java.util.Scanner;

public abstract class JetsApplication {
	Scanner input = new Scanner(System.in);
	
	System.out.println("1: List fleet");
	System.out.println("2: Fly all jets");
	System.out.println("3: View fastest jet");
	System.out.println("4: View jet with longest range");
	System.out.println("5: Load all Cargo Jets");
	System.out.println("6: Dogfight!");
	System.out.println("7: Add a jet to Fleet");
	System.out.println("8: Quit")
	Scanner menu = new input.next();
	
	
	switch(menu) {
	case '1':
		Jet.Listfleet();
	}
}
