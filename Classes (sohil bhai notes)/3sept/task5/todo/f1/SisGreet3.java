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
 public class SisGreet3 {

	public static void main(String args[]){
	LineSeperator  ls =new 	LineSeperator();
	
	
	ls.decorateLine();
	System.out.println("Good Morining");
	ls.decorateLine();
	
	ls.decorateLine('#');
	System.out.println("Happy Teachers Day");
	ls.decorateLine('#');

	
	ls.decorateLine('$',10);
	System.out.println("Success");
	ls.decorateLine('$',10);
	
	ls.decorateLine('-',50);
	System.out.println("We are engineers");
	ls.decorateLine('-',50);

	  
	}//end main

}//end class