package gregdoud;
/*
 * Solve this puzzle
 * ​Can you solve this puzzle? 
 * The 2010 Census puts populations of 26 largest US metro areas
 * 
 * Can you find a subset of these areas where a total of exactly 
 * 100,000,000 people live, assuming the census estimates are exactly right?
 */
public class Mainline {

	static int[] censusData = {
			18897109, 12828837, 9461105, 6371773, 5965343, 5946800, 
			5582170, 5564635, 5268860, 4552402, 4335391, 4296250, 4224851, 
			4192887, 3439809, 3279833, 3095313, 2812896, 2783243, 2710489, 
			2543482, 2356285, 2226009, 2149127, 2142508, 2134411 
	};
	
	public static void main(String[] args) {
		//int i = 0b11111111111111111111111111;
		//System.out.println(i);
		CensusChallengeSolver censusChallenge = new CensusChallengeSolver(censusData);
		censusChallenge.getSolution();
	}

}
