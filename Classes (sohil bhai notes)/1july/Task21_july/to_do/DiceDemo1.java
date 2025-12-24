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

  //Date  02/03/2020
 public class DiceDemo1 {

	public static void main(String args[]){
	
		java.util.Random rand  = new java.util.Random();	  
		int diceNum1 = rand.nextInt(6)+1;//0-5 +1=1-6
		int diceNum2 = rand.nextInt(6)+1;//0-5 +1=1-6
		System.out.println("dice1 = " + diceNum1);
		System.out.println("dice2 = " + diceNum2);
		
		int ascii1 = rand.nextInt(26)+65;//(0-25)+65 =65-90
		int ascii2 = rand.nextInt(26)+97;//(0-25)+97 =97-122
		char ch1  = (char)ascii1;
		char ch2  = (char)ascii2;
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		
		
		
		
		
		
	}//end main

}//end class