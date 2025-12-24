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

  //Date  24/02/2020
 public class Output1 {

	public static void main(String args[]){
	
	  int r1  = 10>5?1000:3000;
	  System.out.println(r1);
	  
	  //CTE float r2  = 10>5?1000.5:3000;//need typecasting with f
	  
	 //CTE float r2  = 10>5?1000.5:3000.5;//need typecasting with f
	  float r2  = 10>5?1000.5f:3000.5f;
	  System.out.println(r2);
	  System.out.println("_________________________");
	  
	  
	  float r3  = 10>55?1000.5f:3000;//ok
	  System.out.println(r3);//3000  3000.0
	  
	  System.out.println("___________________");
	  int r4 = true?65:66;
	  System.out.println(r4);
	  
	  System.out.println("___________________");
	  int r5 = true?65:'B';
	  System.out.println(r5);//65
	  int r6 = false?65:'B';
	  System.out.println(r6);//66
	  
	  
	  
	  
	}//end main

}//end class