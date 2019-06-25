package br.com.testes.util;

public class Moment {
	
	public int countCreepyMoments(String[] moments) {
				
		int momentsOfCreep = 0;
		
		System.out.println("Test 3");
		
		for(int c = 0; c < moments.length; c ++) {
			char[] specificMoment = moments[c].toCharArray();
			if(specificMoment[0] == specificMoment[1] && specificMoment[3] == specificMoment[4]) {
				System.out.println("rule AA:BB: " + moments[c]);
				momentsOfCreep += 1;
			}
			if(specificMoment[0] == specificMoment[3] && specificMoment[1] == specificMoment[4]) {
				System.out.println("rule AB:AB: "+ moments[c]);
				momentsOfCreep += 1;
			}
		}

		System.out.println("moments of creep: " + momentsOfCreep);
		return momentsOfCreep;
		
	}

}
