package gregdoud;

public class CensusChallengeSolver {

	int[] censusData;
	public void getSolution() {
		for(int idx = 0; idx < 67108863; idx++) {
			String bitArray = createBitArray(idx);
			int aCMillion = 0;
			for(int idx1 = 0; idx1 < 26; idx1++) {
				if(bitArray.charAt(idx1) == '1') {
					aCMillion += censusData[idx1];
				}
				if(aCMillion == 100000000) {
					System.out.println("Done: ");
					printSolution(bitArray);
					return;
				}
			}
		}
	}
	void printSolution(String bitArray) {
		int newLine = 0;
		for(int idx1 = 0; idx1 < 26; idx1++) {
			if(bitArray.charAt(idx1) == '1') {
				if(newLine == 4) {
					System.out.println();
					newLine = 0;
				}
				System.out.printf(censusData[idx1]+", ");
				newLine++;
			}
		}
	}
	String createBitArray(int counter) {
		//int i = 0b10101010101010101010101010;
		final String zeros = "00000000000000000000000000";
		String bitRep = Integer.toString(counter,2);
		int lenBitRep = bitRep.length();
		return zeros.substring(lenBitRep) + bitRep;
	}
	public CensusChallengeSolver(int[] censusData) {
		this.censusData = censusData;
	}
	public CensusChallengeSolver() {
	}
}
