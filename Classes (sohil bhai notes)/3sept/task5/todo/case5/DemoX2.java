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

  //Date  05/09/2020
 public class DemoX2 {

	public static void main(String args[]){
	
	X2 o1  = new X2();
	
	o1.m1(100,200F);//int float
	o1.m1(1000F,2000);//float  int
	
	//promotion  int > long >float 
	o1.m1(100,200);//  (int ,int )    //  int float   or float int
/*	DemoX2.java:25: error: reference to m1 is ambiguous
        o1.m1(100,200);//
          ^
  both method m1(int,float) in X2 and method m1(float,int) in X2 match
1 error
*/
	
	
	  
	}//end main

}//end class