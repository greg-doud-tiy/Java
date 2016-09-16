package game;

import java.util.Scanner;

class SimpleCraps {
		int value;
		int point = 0;
		int count = 0;
		boolean didWin, didLose;
		boolean replayYes = false;
		boolean replayNo = false;
				
	public int getvalue() {
		return value;
	}
	//sets the value of roll of dice and prints rolls
	public void rollSimpleCraps() {
		this.value = ((int) (Math.random() * (12) + 1));
		System.out.printf("you rolled a %d\n", this.value );

	}
	
		public void startRoll() {
			while (!didWin || !didLose ) {
				rollSimpleCraps();
				
			
			if (this.count++ == 0 ) {
				if (this.value == 7) {
					didWin = true;
					break;
				}else if (this.value == 2 || this.value == 3 || this.value == 12 ) {
					break;
				}
				else {
					this.point = this.value;
				}
			}
			 else {
				 //roll point player loses
				if (this.point == this.value) {
					didWin = true;
					break;
				} else if (this.value == 7) {
					break;
				}
			}
			
			}
		
		}
		

	public static void main(String[] args) {
		SimpleCraps simpleCraps = new SimpleCraps();
		Scanner in =  new Scanner(System.in);
		do {
			simpleCraps.replayYes= false;
			simpleCraps.point = 0;
			simpleCraps.count = 0;
		simpleCraps.startRoll();
		System.out.printf("Point: %d\n", simpleCraps.point);
		System.out.printf("rolls: %d\n", simpleCraps.count);
		if (simpleCraps.didWin == true) {
			System.out.println("You won!");
		} else {
			System.out.println("Sorry you lost");
		}
		
		
		
		System.out.print("To play again or to quit hit (Y/N):");
		String answer = in.next();		
		 if ( answer.equalsIgnoreCase("Y") ){
			 simpleCraps.replayYes = true;		 
		
		} 
		 
		 } while (simpleCraps.replayYes);
		
		
		
		}
	}

	


