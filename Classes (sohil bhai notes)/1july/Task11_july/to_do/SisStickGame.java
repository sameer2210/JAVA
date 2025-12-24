/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  01/02/2020
 public class SisStickGame {

	public static void main(String args[]) throws Exception{
	//variable 
	int totalSticks=21;
	int userPick;
	int computerPick;
	final int MAGIC_NUMBER=5;
	
	java.util.Scanner  scan= new java.util.Scanner(System.in);
	System.out.println("_____________________________________");
	 System.out.println("RULE1 : user can only pick 1/2/3/4 stick");
	 System.out.println("RULE2 : who will pick last stick will be NOT Winner");
	System.out.println("_____________________________________");
	
	System.out.println("Start game with :  Total Stick  = " + totalSticks);
	
	 
	
	//round1
	System.out.println("__________Round 1________");
	//user 
	   System.out.println("user pick your stick  b/w 1-4 only ");
	   userPick  = scan.nextInt();
	   totalSticks = totalSticks-userPick;
	   System.out.println("after user pick remaining sticks = "  +totalSticks);
	
	//computer 
	  System.out.println("computer picking....");
	  Thread.sleep(3000);
	  computerPick = MAGIC_NUMBER-userPick;
	  System.out.println("computer picked stick = " + computerPick);
	  totalSticks = totalSticks-computerPick;
	  System.out.println("after computer pick  remaining stick = " +totalSticks);
	
	//round2
	System.out.println("__________Round 2________");
	//user 
	   System.out.println("user pick your stick  b/w 1-4 only ");
	   userPick  = scan.nextInt();
	   totalSticks = totalSticks-userPick;
	   System.out.println("after user pick remaining sticks = "  +totalSticks);
	
	//computer 
	  System.out.println("computer picking....");
	  Thread.sleep(3000);
	  computerPick = MAGIC_NUMBER-userPick;
	  System.out.println("computer picked stick = " + computerPick);
	  totalSticks = totalSticks-computerPick;
	  System.out.println("after computer pick  remaining stick = " +totalSticks);
	
	
	//round3
	System.out.println("__________Round 3________");
	//user 
	   System.out.println("user pick your stick  b/w 1-4 only ");
	   userPick  = scan.nextInt();
	   totalSticks = totalSticks-userPick;
	   System.out.println("after user pick remaining sticks = "  +totalSticks);
	
	//computer 
	  System.out.println("computer picking....");
	  Thread.sleep(3000);
	  computerPick = MAGIC_NUMBER-userPick;
	  System.out.println("computer picked stick = " + computerPick);
	  totalSticks = totalSticks-computerPick;
	  System.out.println("after computer pick  remaining stick = " +totalSticks);
	
	//round4
	System.out.println("__________Round 4________");
	//user 
	   System.out.println("user pick your stick  b/w 1-4 only ");
	   userPick  = scan.nextInt();
	   totalSticks = totalSticks-userPick;
	   System.out.println("after user pick remaining sticks = "  +totalSticks);
	 
	
	//computer 
	  System.out.println("computer picking....");
	  Thread.sleep(3000);
	  computerPick = MAGIC_NUMBER-userPick;
	  System.out.println("computer picked stick = " + computerPick);
	  totalSticks = totalSticks-computerPick;
	  System.out.println("after computer pick  remaining stick = " +totalSticks);
	
	
	System.out.println("NOTE : remain stick  ==1 means user lose the game " );
	
	System.out.println("__________________________");
	System.out.println("computer win the game");
	System.out.println("try again....all the best!");
	System.out.println("__________________________");
	 
	 
	  
	}//end main

}//end class