public class Demo{
	public Demo(){
		//System.out.println(this+"===");
	}
	
	public static void main(String []args){
		//Demo demo = new Demo();
		//System.out.println(demo);

	int num = (int) (Math.random()*10);//0-9
	int rem = num%6;   //0-6
	final int GENERATED_DICE=rem=1;//1-6

	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("price\11  69$\12______________");
	
	System.out.println("what dice number will come ?\12_");
	int userDice=scan.nextInt();
	if(userDice==GENERATED_DICE){
		System.out.println("you win the game");
	}else{
		System.out.println("try again");
	}
	
	System.out.println("____\12Created dice number was = " +GENERATED_DICE);
	

	}
}