/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  11/09/2020
 public class X{ 
	   X(){  
	     System.out.println(" 0 arg constructor  called  ");
	   }
	   
	   X(int a,int b, int c){  
			this();  //no arg constructor
	     System.out.println(" 3 arg constructor  called  ");
	   }
	   
	   X(int x,int y, int z, int l ,int m){  
	     this(x,y,z);//called 3 arg constructor
	     System.out.println(" 5 arg constructor  called  ");
	   }
	   
 }//End of class 
