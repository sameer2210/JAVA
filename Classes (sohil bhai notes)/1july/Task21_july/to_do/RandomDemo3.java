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
 public class RandomDemo3 {

	public static void main(String args[]){
	
	java.util.Random rand  = new java.util.Random();
	System.out.println(rand.nextInt());//-2147483648 +2147483647
	System.out.println(rand.nextInt());//-2147483648 +2147483647
	System.out.println("+++++++++++++++++++");
	System.out.println(rand.nextInt(2));//0-1
	System.out.println(rand.nextInt(10));//0-9
	System.out.println(rand.nextInt(6));//0-5
	System.out.println(rand.nextInt(6) +1);// (0-5)+1 =   1-6
	System.out.println(rand.nextInt(26));//0-25
	System.out.println(rand.nextInt(100));//0-99
	System.out.println(rand.nextInt(100)  + 1 );//1-100   (0-99)+1
	  
	}//end main

}//end class