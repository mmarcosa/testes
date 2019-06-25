package br.com.testes.util;

import java.util.ArrayList;
import java.util.List;

public class Championship {

	public int getChampionPoints(int[] wins, int[] ties) {
		
		System.out.println("Test 4");
		
		int a = 0;
		
		List<Integer> teams = new ArrayList<Integer>();
		
		for(int c = 0; c < wins.length; c ++) {
			teams.add((wins[c] * 3) + (ties[c] * 1));
		}
		
		for(Integer t : teams) {
			System.out.println("Team: " + t);
		}
		return a;
		
		
	}
	

	
}
