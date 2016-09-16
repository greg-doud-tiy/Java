package theIronYard;

public class Dice {
	static java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());;
	public int Dice1 = 0;
	public int Dice2 = 0;
	public int Total = 0;
	public static Dice Roll() {
		try {
			System.out.printf("\nPress any key to roll ...");
			Program.reader.readLine();
		} catch (java.io.IOException ex) {}
		//java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());
		Dice dice = new Dice();
		dice.Dice1 = rnd.nextInt(6)+1;
		dice.Dice2 = rnd.nextInt(6)+1;
		dice.Total = dice.Dice1 + dice.Dice2;
		System.out.printf("\nThe roll is %d", dice.Total);
		return dice;
	}
}
