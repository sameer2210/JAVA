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

  //Date  20/09/2020
 public class ChildDemoCase1 {

	public static void main(String args[]){
/* Parent p1  = new Parent();
p1.getAllProperties();
p1.speak();
p1.eat();
p1.marry();
p1.greet(); */




	
Child c1  = new Child();
c1.getAllProperties();//P
c1.eat();//P
c1.speak();// Override  C
c1.marry();//marry override C
c1.greet();//override C
		
 System.out.println("____________________");
 c1.playGame();   //C
 c1.writeJavaProgram();//C

 System.out.println("____________________");
 
	}//end main

}//end class