package br.com.testes.util;

public class Star {

	/*
	 * Essa foi uma pegadinha? Na verdade o método deve receber uma lista de
	 * inteiros com os resultados das fases do jogo, exemplo: Fase 1 = 2; Fase 2 =
	 * 1; Fase 3 = 3; . . .
	 * 
	 * E retornar uma lista de String com os caracteres correspondentes, exemplo:
	 * Fase 1 = **-: Fase 2 = *--; Fase 3 = ***;
	 * 
	 * Ou me confundi?
	 * 
	 * Pensando dessa forma fiz o seguinte:
	 */
	
	public String[] countStars(int[] result) {

		System.out.println("Test 2");
		
		String[] starts = new String[result.length];

		System.out.println("Solution using switch");
		
		for(int c = 0; c < result.length; c ++) {
			
			switch (result[c]) {
				case 0:
					starts[c] = "---";
					break;
				case 1:
					starts[c] = "*--";
					break;
				case 2:
					starts[c] = "**-";
					break;
				case 3:
					starts[c] = "***";
					break;
			}
		}
		
		for(int c = 0; c < starts.length; c ++) {
			System.out.println(starts[c]);
		}
		
		System.out.println("Solution using if");
		
		for(int c = 0; c < result.length; c ++) {
		
			if(result[c] == 0) {
				starts[c] = "---";
			}
			else if (result[c] == 1) {
				starts[c] = "*--";
			}
			else if (result[c] == 2) {
				starts[c] = "**-";
			}
			else if (result[c] == 3) {
				starts[c] = "***";
			}
			else {
				//Aqui poderia lancar ou tratar uma excecao
				System.out.println("Invalid value");
				
			}
			 
		}

		for(int c = 0; c < starts.length; c ++) {
			System.out.println(starts[c]);
		}
		
		return starts;
	}
	
}
