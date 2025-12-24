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

  //Date  17/08/2020
 public class Demo2 {

	public static void main(String args[]){
	
	  
	 int [] coinArr = {1,2,5,10};
	 System.out.println("total coins " +coinArr.length);
	  
	 for(int coinNo=1;coinNo<=coinArr.length;coinNo++){
	 int coinValue = coinArr[coinNo-1];
	   System.out.println("sno#"+coinNo +"=  "+ coinValue);
	 }
	 
	 java.util.Random rand  = new java.util.Random();
	 
	 //int pickIndex = rand.nextInt(4);   0-3
	 int pickIndex = rand.nextInt(coinArr.length);
	 int pick = coinArr[pickIndex];
	 System.out.println("picked coin is " + pick);
	  
	}//end main

}//end class