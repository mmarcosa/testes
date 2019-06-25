package br.com.testes.util;

public class FizzBuzz {

	public void printFizzBuzz() {
		int x;
		int y;
		
		System.out.println("Test 1");
		
		for(int c = 1; c < 101; c++) {
			x = c % 3;
			y = c % 5;
			if(x == 0 && y == 0) {
				System.out.println(c + "FizzBuzz");
			}
			else if(x == 0) {
				System.out.println(c + "Fizz");
			}
			else if(y == 0) {
				System.out.println(c + "Buzz");
			}
			else {
				System.out.println(c);
			}
			y = 0;
			x = 0;
		}
		
	}

	
}
