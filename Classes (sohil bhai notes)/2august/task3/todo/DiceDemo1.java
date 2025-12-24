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

  //Date  16/03/2020
 public class DiceDemo1 {

	public static void main(String args[]){
	
	
		java.util.Random rand  = new java.util.Random();
	  int [] userRolls = new int[rand.nextInt(11)+10];//store 10-20 values
	  //fill
	  
	  for(int roll=1;roll<=userRolls.length;roll++){
	        int diceNumber= rand.nextInt(6)+1;
			userRolls[roll-1]=diceNumber;
	  }
	  
	  
	  int totalCount=0;
	  for(int roll=1;roll<=userRolls.length;roll++){
	       totalCount = totalCount + userRolls[roll-1];
	  }
	  
	  for(int roll=1;roll<=userRolls.length;roll++){
	        int diceNumber= userRolls[roll-1];
			 System.out.println("roll#"+roll +" = " + diceNumber);
	  }
	  System.out.println("total count = "+ totalCount);
	    
	  
	}//end main

}//end class