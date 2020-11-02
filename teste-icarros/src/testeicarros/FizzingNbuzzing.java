package testeicarros;

public class FizzingNbuzzing {
	
	public static void main (String[] args) {
		int loop = 100; 
		
		for (int i = 1; i <= loop; i++) {
			if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			} 
			else if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			}
			else 
				System.out.println(i);
		}
	}

}

