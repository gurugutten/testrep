package main;

import klasser.Student;

public class MainMetoder {

	public static void main(String[] args){
		// kaller funksjon som skriver ut hei 
		printText();
		
		// skriver ut den returnerte verdien fra funksjonen summer
		System.out.println( summer(41,1) );
	}
	
	// metode som ikke returnerer verdi må definere void som type
	public static void printText(){
		System.out.println("Hei");
	}
	
	// metode som returnerer verdi må definere tilhørende datatype
	// om en metode tarimot parametre så må disses datatyper også defineres
	
	public static int summer(int t1, int t2){
		return t1 + t2;
	}
}
