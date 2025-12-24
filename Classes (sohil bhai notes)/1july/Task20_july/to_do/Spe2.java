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

  //Date  01/03/2020
 public class Spe2 {

	public static void main(String args[]){
 
	  
		int row=1;
		int col=1;
	   for(int task=1;task<=100;task++){
	   
	        int result  = (10*(col-1))+row;
			System.out.printf("%4d",result);
			col++;
			if(task%10==0){
				row++;
				col=1;
			  System.out.print("\n");
			}
	  }
	  
	  

	}//end main

}//end class