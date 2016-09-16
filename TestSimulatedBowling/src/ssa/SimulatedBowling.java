package ssa;

public class SimulatedBowling {
	
	//random number generator 
	java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());
	
	//scores variable set to an array with 3 rows and 10 columns for each row
	int scores[][] = new int [3][10];
	
	private int bowlFirstFrame() {
		int firstBall = FirstRoll();
		int secondBall = 0;
		if (firstBall < 10) {
			secondBall = FirstRoll();
		}
		int total = firstBall + secondBall;
		if(total > 10) {
			return 10;
		} else {
				return total;
		}
	}
	private int FirstRoll() {
		return rnd.nextInt(11);
	}
	
	// variables 
	int totalScore = 0; int k=1; int series=0;
	
	public void bowl() {
		for(int game = 0; game < 3; game++) {
			
			for(int frame = 0; frame < 10; frame++)
			scores[game][frame] = bowlFirstFrame();
		}
	
	System.out.print("Frame \t");
	
	for (int i = 1; i <= 10; i++)
		System.out.print(" "+i+ " \t ");
	
	
	System.out.println("\tTotal");
	
	System.out.println("- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
	for(int[] game : scores) { 
		System.out.print("Game " + k); k++;
		totalScore = 0;
		for(int  frame : game) {
			System.out.printf(String.format("%4d",frame) + "\t ");
			totalScore = totalScore + frame;
			
		}System.out.print("\t" +totalScore);
			System.out.println();
			 series += totalScore;
		}
	System.out.println("Total Series \t \t \t \t \t \t \t \t \t \t \t" + series );
	}
	
}
		
		
		
		
		
		
		
	
