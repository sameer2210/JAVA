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
 public class Human{ 
   String name;
   
   void action(Mobile mobile){
			System.out.println(name +" action with  "+ mobile);
			mobile.on();
			mobile.clickCamera();
			mobile.search();
			mobile.off();
   }
   
      void action(Mouse mouse){
			System.out.println(name +" action with  "+ mouse);
			mouse.leftClick();
			mouse.rightClick();
			mouse.scroll();
	  }
      void action(Pen pen){
			System.out.println(name +" action with  "+ pen);
			pen.capOpen();
			pen.capClose();
			pen.changeLead();
		}
      void action(Book book){
			System.out.println(name +" action with  "+ book);
		book.open();
		book.turn();
		book.fold();
		book.close();
		  
	  }
   
 }//End of class 
