package game;


	
	class SimpleCraps {
		int value;
		int point = 0;
		int count = 1;
		boolean didWin, didLose;
		
	public int getvalue() {
		return value;
	}
	public void rollSimpleCraps() {
		
		
		this.value = ((int) (Math.random() * (12) + 1));
		System.out.printf("you rolled a %d\n", this.value );

	}
		public void startRoll() {
			while (!didWin || !didLose ) {
				rollSimpleCraps();
			
			
			if (this.count++ == 1 ) {
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
		SimpleCraps SimpleCraps = new SimpleCraps();
		SimpleCraps.startRoll();
		System.out.printf("Point: %d\n", SimpleCraps.point);
		if (SimpleCraps.didWin == true) {
			System.out.println("You won!");
		} else {
			System.out.println("Sorry you lost try again");
		}
	}

}

