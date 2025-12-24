public class Dicedemo {
	public static void main(String args[]){
	
	java.util.Random rand = new java.util.Random();
	int [] userRolls = new int[rand.nextInt(11)+10];	//store 10-20values
	
	//fill
	for (int roll=1;roll<=userRolls.length;roll++){
	int diceNumber=rand.nextInt(6)+1;
		userRolls[roll-1]=diceNumber;
	}
	
	int totalCount=0;
	for(int roll=1;roll<=userRolls.length;roll++){
	totalCount = totalCount + userRolls[roll-1];
	}
	
	for(int roll=1;roll<=userRolls.length;roll++){
	int diceNumber= userRolls[roll-1];
		System.out.println("roll#"+roll +"="+diceNumber);
	}
	System.out.println("total count ="+totalCount);
	
}
}
