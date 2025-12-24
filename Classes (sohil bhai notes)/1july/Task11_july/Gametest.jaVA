public class Gametest {
	public static void main(String [] args )throws Exception{
	//variable
	int totalSticks=21;
	int userPick;
	int computerPick;
	final int MAGIC_NUMBER=5;
	
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("______\12Rule1 : user can only pick 1/2/3/4 stick");
	System.out.println("Rule2 : who will pick last stick will be Not Winner\12______");
	
	System.out.println("Start game with : Total Sticks = " + totalSticks);
	
	Thread.sleep(7000);

	//Round1
	System.out.println("_____\12Round 1\12________");
	//user
	System.out.println("user pick your stick b/w 1- 4 only ");
	userPick = scan.nextInt();
	totalSticks = totalSticks-userPick;       
	System.out.println("after user pick remaining sticks = " +totalSticks);
	
	//computer
	System.out.println("computer picking______\12______");
	Thread.sleep(7000);
	computerPick = MAGIC_NUMBER-userPick;
	System.out.println("computer picked stick = " + computerPick);
	totalSticks = totalSticks-computerPick;
	System.out.println("after computer pick remaining stick =  "+ totalSticks);

	//round2
	System.out.println("_________\12Round2\12__________");
	//user
	System.out.println("user pick your stick b/w 1-4 only");
	userPick = scan.nextInt();
	totalSticks = totalSticks-userPick;
	System.out.println("after user pick remaining sticks = " +totalSticks);
	 
	//computer
	System.out.println("computer picking.......");
	Thread.sleep(4000);
	computerPick =MAGIC_NUMBER-userPick;
	System.out.println ("computer picked stick = " + computerPick);
	totalSticks = totalSticks-computerPick;
	System.out.println("after computer pick remaining stick = " +totalSticks);
	
	//Round3
	System.out.println("_________\12Round3\12_________");
	//user
	System.out.println("user pick your stick b/w 1-4 only");
	userPick = scan.nextInt();
	System.out.println("after user pick remaining stiks = " +totalSticks);
	
	//computer
	System.out.println("computer picking.......");	
	Thread.sleep(4000);
	computerPick = MAGIC_NUMBER-userPick;
	System.out.println("computer picked stick = " + computerPick);
	totalSticks = totalSticks-computerPick;
	System.out.println("after computer pick remaining stick = "+ totalSticks);
	
	//Round4
	
	System.out.println("_________\12Round 4\12________");
	//user
	System.out.println("user pick your stick b/w 1- 4 only ");
	userPick = scan.nextInt();
	totalSticks = totalSticks-userPick;       
	System.out.println("after user pick remaining sticks = " +totalSticks);
	
	//computer
	System.out.println("computer picking______\12______");
	Thread.sleep(6000);
	computerPick = MAGIC_NUMBER-userPick;
	System.out.println("computer picked stick = " + computerPick);
	totalSticks = totalSticks-computerPick;
	System.out.println("after computer pick remaining stick =  "+ totalSticks);

	Thread.sleep(5000);
	System.out.println("NOTE : remain stick  ==1 means user lose the game " );
	
	System.out.println("__________________________");
	System.out.println("computer win the game");
	System.out.println("try again....all the best!");
	System.out.println("__________________________");
	


}
}