package main;

import klasser.Student;

public class MainKlasser {

	public static void main(String[] args) {
		// lager en ny student(objekt) basert p� "blueprinten"(klassen)
		Student s1 = new Student();
		
		// setter verdiene for denne studenten
		s1.fNavn = "Ole";
		s1.eNavn = "Hansen";
		s1.studid = "0992826";
		
		// tester � hente informasjon fra studentobjektet ved � skrive ut
		// for- og etternavn.
		System.out.println(s1.fNavn + " " + s1.eNavn);
		
	}

}
