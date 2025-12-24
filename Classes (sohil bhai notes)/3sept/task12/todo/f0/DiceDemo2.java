
public class DiceDemo2 {

	public static void main(String[] args) {

		Dice.showTotalDice();
		System.out.println("________________________");
		Dice ludo1 = new Dice();
		
		Dice ludo2 = new Dice();
		Dice ludo3 = new Dice();
		Dice ludo4 = new Dice();
System.out.println("________________________");
		Dice.showTotalDice();
		System.out.println("________________________");
		
		ludo1.roll();
		ludo1.roll();
		ludo1.roll();
		ludo1.roll();
		ludo1.roll();
		
		ludo2.roll();
		ludo2.roll();
		ludo2.roll();
		
		ludo3.roll();
		ludo3.roll();
		
		ludo4.roll();
		ludo4.roll();
		ludo4.roll();
		
		ludo1.showTotalRollsCounts();
		ludo2.showTotalRollsCounts();
		ludo3.showTotalRollsCounts();
		ludo4.showTotalRollsCounts();
		
		Dice.showAllDiceTotalRollsCounts();
		
		System.out.println("_____________________");
		ludo1.showOldGeneratedNumber();
		ludo2.showOldGeneratedNumber();
		ludo3.showOldGeneratedNumber();
		ludo4.showOldGeneratedNumber();
		
		Dice.showAllDiceRolledGeneratedNumbers();
		
		
	}

}
