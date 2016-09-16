package ssa;


public class SimulatedBowling {

	int[][] bowlingScores = new int[3][10];
	int [] gameTotals = new int [3];

	private int bowlFrame() {
		int rollOne = getPinsKnockedDown();
		int rollTwo = 0;
		if (rollOne < 10) {
			rollTwo = getPinsKnockedDown();
		}
		int total = rollOne + rollTwo;
		if (total > 10) {
			return 10;
		} else {
			return total;
		}
	}

	public void bowl() {
			System.out.println(printFrames());
		for (int game = 0; game < bowlingScores.length; game++) {
				
			for (int frame = 0; frame < 10; frame++) {
				bowlingScores[game][frame] = bowlFrame();
				gameTotals[game] += bowlingScores[game][frame];
			}

		}
		
		
		for (int game = 0; game < bowlingScores.length; game++) {
			System.out.print("Game " + (game +  1) + "     ");
			for (int frame = 0; frame < 10; frame++) {
				
				System.out.printf("  %2d",bowlingScores[game][frame]);
				
				
			}
			
			System.out.println("             " + gameTotals[game]);
			
			
		}
		System.out.println("Total Series                                                   "
				+ (gameTotals[0] + gameTotals[1] + gameTotals[2]));
	
	}

	int getPinsKnockedDown() {
		int pinsKnockedDown = ((int) (Math.random() * (11)));
		return pinsKnockedDown;
	}
	
	public String printFrames() {
		return "Frames        1   2   3   4   5   6   7   8   9  10           Total";
		
	}
	
	public SimulatedBowling() {
		
	}

}