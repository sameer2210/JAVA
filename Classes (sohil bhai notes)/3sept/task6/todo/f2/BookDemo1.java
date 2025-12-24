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

  //Date  06/09/2020
 public class BookDemo1 {

	public static void main(String args[]){
	
	 Book b1  = new Book();	  
	 Book b2  = new Book();	  
	 Book b3  = new Book();	  
	 
	 
	 b1.info();
	 b2.info();
	 b3.info();
	 
	 b1.updateInfo("html",150,30.50f);
	 b2.updateInfo("c",170,150.50f);
	 b3.updateInfo("java",500,600.50f);
	 
	 
	 
	 b1.info();
	 b2.info();
	 b3.info();
	}//end main

}//end class