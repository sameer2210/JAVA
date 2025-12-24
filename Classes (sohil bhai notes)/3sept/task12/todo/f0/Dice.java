
public class Dice {
    private static int totalDiceObject;
    private int totalRolls;//object  //0
    private static int allDiceTotalRolls;//class/common to all object
    private StringBuilder oldGeneratedNumbers = new StringBuilder();
    private static  StringBuilder allDiceOldGeneratedNumbers = new StringBuilder();
    
	public Dice() {
		totalDiceObject++;
		System.out.println(this +" created..#"+totalDiceObject);
	}
	
	public static void showTotalDice() {
		System.out.println("Total dice Created..."+totalDiceObject);
	}

	public int  roll() {
		totalRolls++;
		allDiceTotalRolls++;
		int temp = (int)(Math.random()*10);
		temp = (temp%6 )+1;
		oldGeneratedNumbers.append(temp+" ");//object level
		allDiceOldGeneratedNumbers.append(temp+" ");//class level
		System.out.println(this +"rolled with "+ temp);
		return temp;
	}

	public void showTotalRollsCounts() {
		System.out.println(this +" total rolls "+ totalRolls);
	}
	
	static public void showAllDiceTotalRollsCounts() {
		System.out.println("All Dice total rolls "+ allDiceTotalRolls);
	}

	public void showOldGeneratedNumber() {
		System.out.println(this +"number are : "+oldGeneratedNumbers);
	}

	public static void showAllDiceRolledGeneratedNumbers() {
		System.out.println("all Dice rolled Number was : "+ allDiceOldGeneratedNumbers);
		
	}

}
