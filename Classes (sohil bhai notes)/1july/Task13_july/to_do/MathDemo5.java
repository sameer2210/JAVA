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

  //Date  20/02/2020
 public class MathDemo5 {

	public static void main(String args[]){
	//15-20
		int n1 =    (int) (Math.random()*10) ;//(0-9)
	    int reqNum1 = 15 + (n1%6); //(15+(0-5))  
		System.out.println(reqNum1);
	 
	 System.out.println("_____________________");
	//15-25
		int n2 =    (int) (Math.random()*100) ;//(0-99)
	    int reqNum2 = 15 + (n2%11); //(15+(0-10))  
		System.out.println(reqNum2);


		System.out.println("_____________________");
	//15-65
		int n3 =    (int) (Math.random()*100) ;//(0-99)
	    int reqNum3 = 15 + (n3%51); //(15+(0-50))  
		System.out.println(reqNum3);
	
		System.out.println("_____________________");
	//0-25
		int n4 =    (int) (Math.random()*100) ;//(0-99)
	    int reqNum4 = n4%26;
		System.out.println(reqNum4);
		
		
		
				System.out.println("_____________________");
	//65-90
		int n5 =    (int) (Math.random()*100) ;//(0-99)
	    int reqNum5 = 65 +n5%26;
		System.out.println(reqNum5);	 
	}//end main

}//end class