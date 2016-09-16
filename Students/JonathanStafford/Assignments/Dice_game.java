
	 class Die {

		int currentRoll;
		int score = 0;

		public int getRoll() {
			return currentRoll;
		}
		
		
		public void rollDie() {
			//long seed = (new java.util.Date()).getTime();
			//java.util.Random rnd = new java.util.Random(seed);

			//this.currentRoll = rnd.nextInt(6) + 1;
			
			this.currentRoll = ((int) (Math.random() * (6) + 1));

		}
		
		public void startRolling() {
			while(this.currentRoll != 1) {
				rollDie();
				System.out.println(getRoll());
				if(this.currentRoll != 1) {
					score += getRoll();
				}else {
					break;
				}
			}
		}
		
	}


public class Dice_game {



	public static void main(String[] args) {
		Die die = new Die();
		die.startRolling();
		System.out.println("score: " + die.score);
				
	
	}

	
	}


