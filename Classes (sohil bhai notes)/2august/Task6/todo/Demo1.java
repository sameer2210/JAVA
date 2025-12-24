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
 public class Demo1 {

	public static void main(String args[]){
	
	 int [] coinArr = new int[5];
	 coinArr[0] = 1;
	 coinArr[1] =2;
	 coinArr[2] =5;
	 coinArr[3] =10;
	 System.out.println("total coins " +coinArr.length);
	 
	 //fetch
	 System.out.println(coinArr[0]);
	 System.out.println(coinArr[1]);
	 System.out.println(coinArr[2]);
	 System.out.println(coinArr[3]);
	 //fetch 
	 for(int coinNo=1;coinNo<=coinArr.length;coinNo++){
	 int coinValue = coinArr[coinNo-1];
	   System.out.println("sno#"+coinNo +"=  "+ coinValue);
	 }
	 
	  
	}//end main

}//end class