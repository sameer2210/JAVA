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
 public class Demo1 {

	public static void main(String args[]) throws Exception{
	
	Book item1 = new Book();
	Pen item2 = new Pen();
	Mobile item3 = new Mobile();
	Mouse item4 = new Mouse();
	 
   Human h1  = new Human();
   h1.name="Anjali";
		 System.out.println("_________________________");
	h1.actionWithBook(item1);
		 System.out.println("_________________________");
	Thread.sleep(2000);	
	h1.actionWithPen(item2);
		 System.out.println("_________________________");
		 
	Thread.sleep(2000);	
	h1.actionWithMobile(item3);
		 System.out.println("_________________________");
		 
	Thread.sleep(2000);	
	h1.actionWithMouse(item4);
		 System.out.println("_________________________");
		 
		 
	 
	  
	  
	}//end main

}//end class