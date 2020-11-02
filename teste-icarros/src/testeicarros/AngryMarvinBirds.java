package testeicarros;

public class AngryMarvinBirds {
		public static void main(String[] args) {
			String[] resultado = new String[] {"0", "1", "2", "3", "3"};
			totalStars(resultado);
			
		}
	
		public static int totalStars(String[] resultado) {
			int totalStars = 0;
			final String empty = "-";
			final String star = "*";
			
			for (int i = 0; i <= resultado.length -1; i++) {
				int stars = Integer.parseInt(resultado[i]);
				totalStars += stars;
				StringBuilder visualStars = new StringBuilder();
				
				for (int j = 0; j <= 2; j++) {
					visualStars.append(j < stars ? star: empty);
				}
				System.out.println("resultado ["+i+"]:" + visualStars);
			}
			
			System.out.println();
			System.out.println("Total de estrelas: " + totalStars);
			
			return totalStars;
		}
}
