package main;

import java.util.*;

public class MainArray {
	public static void main(String[] args){
		
		// array/liste må også få definert datatype
		int[] heltallsliste = new int[3];
		heltallsliste[0] = 0;
		heltallsliste[1] = 1;
		heltallsliste[2] = 2;
		// denne feiler fordi det ikke er plass i arrayen
		heltallsliste[3] = 3;
		
		// ArrayList er en klasse som lar oss lage dynamiske lister
		ArrayList<Integer> heltallsliste2 = new ArrayList<Integer>();
		heltallsliste2.add(42);
	
	}
}
