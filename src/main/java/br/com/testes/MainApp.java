package br.com.testes;

import br.com.testes.util.Championship;
import br.com.testes.util.FizzBuzz;
import br.com.testes.util.Moment;
import br.com.testes.util.Star;

public class MainApp {
	
	public static void main(String[] args){
		
		int[] resultados = new int[4];
		resultados[0] = 0;
		resultados[1] = 1;
		resultados[2] = 2;
		resultados[3] = 3;
		
		String[] moments = new String[3];
		moments[0] = "11:00";
		moments[1] = "13:13";
		moments[2] = "10:00";
		
		
		int[] wins = new int[3];
		wins[0] = 1;
		wins[1] = 0;
		wins[2] = 3;
		
		int[] ties = new int[3];
		ties[0] = 2;
		ties[1] = 2;
		ties[2] = 0;
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.printFizzBuzz();
		
		Star star = new Star();
		star.countStars(resultados);
				
		Moment moment = new Moment();
		moment.countCreepyMoments(moments);
		
		Championship championship = new Championship();
		championship.getChampionPoints(wins, ties);
		
		System.out.println("Test 5");
		System.out.println("select OrderID, TotalPrice from Requests where CustomerName = 'DeathStar';");
		
	}
	
}
