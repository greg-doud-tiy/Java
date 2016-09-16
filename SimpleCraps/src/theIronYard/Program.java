package theIronYard;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import gregorydoud.VmApi;

public class Program {
	
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Program pgm = new Program();
		pgm.Run();
	}

	private void Run() {
		boolean playAgain = true;
		while(playAgain) {
				PlaySimpleCraps();
				playAgain = AskPlayAgain();
		}
		VmApi.WriteLine("The End");
	}
	
	private void PlaySimpleCraps() {
		int thePoint = 0;
		Dice dice = Dice.Roll();
		while(!IsWinnerOrLoser(dice, thePoint)) {
			if(thePoint == 0) {
				thePoint = dice.Total;
				System.out.printf("\nThe point is %d", dice.Total);
			}
			dice = Dice.Roll();
		}
		if(IsWinner(dice, thePoint)) 
			System.out.printf("\nYou Win!");
		else if(IsLoser(dice, thePoint))
			System.out.printf("\nYou Lose ...");
	}

	private boolean IsWinnerOrLoser(Dice dice, int thePoint) {
		return IsWinner(dice, thePoint) || IsLoser(dice, thePoint);
	}

	private boolean IsWinner(Dice dice, int thePoint) {
		if(thePoint == 0)
			return dice.Total == 7;
		else
			return dice.Total == thePoint;
	}

	private boolean IsLoser(Dice dice, int thePoint) {
		if(thePoint == 0)
			return dice.Total == 2 || dice.Total == 3 || dice.Total == 12;
		else
			return dice.Total == 7;
	}

	private boolean AskPlayAgain() {
		System.out.printf("\nDo you want to play again? (N to quit)? : ");
		try {
			String answer = reader.readLine();
			if(answer.toUpperCase() == "N")
				return false;
		} catch (java.io.IOException ex ) {
			return true;
		}
		return true;
	}

}
