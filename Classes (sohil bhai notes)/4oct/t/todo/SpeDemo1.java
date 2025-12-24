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

  //Date  25/10/2020
 public class SpeDemo1 {

	public static void main(String args[]){
	/* 
	 X o = new X();
	 
	 o.m1();
	 o.m1(10);
	 o.m1(11,22);
	 o.m1(111,222,333); */
	/*  
	 X2 o  = new X2();
	 o.m1();
	 //CTE o.m1(10);
	 o.m1(new int[]{10});
	 o.m1(new int[]{11,22});
	 o.m1(new int[]{111,222,333});
	 o.m1(new int[]{111,222,333,444,55,66,77,88});
	 o.m1(new int[]{111,222,333,444,55,66,77,88,1,2,3,4,5,6,7,8,9});
	 o.m1(new int[]{111,222,333,444,55,66,77,88,1,2,3,4,5});
	 //problem with this  we have to create array and pass it to arr ref
	  */
	  
	  X3 o = new X3();
	  o.m1();//CTE OR RTE
	  o.m1(1,2,4,5);
	  o.m1(1);
	  o.m1(1,44,5,6,7,8,8,67,4,34,45,45,56,677);
	  o.m1(new int[]{11,22,33});
	  int arr[]={22,33,44,55,66,77,88};
	  o.m1(arr);
	  
	  
	  
	  
	}//end main
	
	

}//end class