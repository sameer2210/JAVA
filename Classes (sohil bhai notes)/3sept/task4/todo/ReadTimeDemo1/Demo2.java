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

  //Date  03/09/2020
 public class Demo2 {

	public static void main(String args[]) throws Exception{
	
	Pen item1 = new Pen();
	Mobile item2 = new Mobile();
	Book item3 = new Book();
	Mouse item4 = new Mouse();
	 
	 
	 
	 
	 
	 
   Human h1  = new Human();
   
   //item1    item2  item3 item4
   h1.actionWithMobile(item1);
   h1.actionWithMobile(item2);
   h1.actionWithMobile(item3);
   h1.actionWithMobile(item4);

   h1.actionWithBook(item1);  
	h1.actionWithBook(item2);  
	h1.actionWithBook(item3);  
	h1.actionWithBook(item4);  
	
	h1.actionWithPen(item1);  
	h1.actionWithPen(item2);  
	h1.actionWithPen(item3);  
	h1.actionWithPen(item4);  
	
	h1.actionWithMouse(item1);  
	h1.actionWithMouse(item2);  
	h1.actionWithMouse(item3);  
	h1.actionWithMouse(item4);  
	}//end main

}//end class