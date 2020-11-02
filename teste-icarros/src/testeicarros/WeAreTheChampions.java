package testeicarros;

public class WeAreTheChampions {
	public static void main(String[] args) {
		int[] wins = new int[] {1, 0 ,3};
		int [] ties = new int[] {2, 2, 0};
		
		int points = championPoints (wins, ties); 
		
		System.out.println(points);
	}
	
	private static int championPoints(int[] wins, int[] ties) {
		if (wins.length != ties.length)
			throw new IllegalArgumentException();
		
		int[] points = new int[wins.length];
		int championPoints = 0;
		
		for (int i = 0; i <wins.length; i++) {
			points[i] = (wins[i] * 3) + (ties[i]);
			
			if (points[i] > championPoints)
				championPoints = points[i];
		}
		
		return championPoints;
	}
	
}
