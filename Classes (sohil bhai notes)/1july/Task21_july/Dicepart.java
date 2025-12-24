public class Dicepart{
	public static void main(String args[]){
	java.util.Random rand =new java.util.Random();
	
	int diceNum1 = rand.nextInt(6)+1;
	int diceNum2 = rand.nextInt(6)+1;
	System.out.println("dice1 = " +diceNum1);
	System.out.println("dice2 = " +diceNum2);

	int ascii1 = rand.nextInt(26)+65;	//(0-25)+65=65-90
	int ascii2 = rand.nextInt(26)+97;	//(0-25)+67=97-122
	char ch1 =(char)ascii1;
	char ch2 = (char)ascii2;
	System.out.println("ch1= " + ch1);
	System.out.println("ch2= " + ch2);
	
System.out.println("______________________________________________");
	
	java.util.Scanner scan =new java.util.Scanner (System.in);
	System.out.println("how many row required?");
		//int totalRow=5;
		int totalRow=scan.nextInt();
		
	for(int r=1;r<=totalRow;r++){
	//part-a
		for(int plus=1;plus<=(totalRow-r);plus++){
		System.out.print("^");
		}
	//part-b
		for(int star=1;star<=(2*r)-1;star++){
		System.out.print("$");
		}
	//part-c
		for(int plus=1;plus<=(totalRow-r);plus++){
		System.out.print("^");
		}
	//part-d
		System.out.print("\n");
	}


}
}

