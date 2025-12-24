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

  //Date  04/03/2020
 public class DiceRnD {

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random();
	
	 int diceNumber1;
	 int diceNumber2;
	 long st1 = System.nanoTime(); 
	 int  a  = (int)(Math.random()*10);
	 diceNumber1 = (a %6) +1;
	 long et1 = System.nanoTime(); 
	 
	 long st2 = System.nanoTime(); 
	 diceNumber2 = rand.nextInt(6) +1;
	 long et2 = System.nanoTime(); 
	 
	 System.out.println("way1 "+(et1-st1));
	 System.out.println("way2 "+(et2-st2));
	 System.out.println("++++++++++++++++++++++++++++");
	 System.out.println(diceNumber1);
	 System.out.println(diceNumber2);
	  
	  
	  
	  
	  
	}//end main

}//end class