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

  //Date  02/02/2020
 public class SisDiceGame {

	public static void main(String args[]){
	
	  int num  = (int) (Math.random()*10);//0-9
	  int rem = num%6;  // 0-5
	 final int GENERATED_DICE=rem+1;//1-6
	 
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 System.out.println("price 10000$");
	 System.out.println("what dice number will come?");
	 int userDice= scan.nextInt();
	 if(userDice==GENERATED_DICE){
	   System.out.println("you win the game");
	 }else{
	   System.out.println("try again");
	 }
	 System.out.println("___________________________");
	 System.out.println("Created dice number was = " + GENERATED_DICE);
	  
	  
	}//end main

}//end class