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

  //Date  22/10/2020
 public class TypeCheck {

	public static void main(String args[]){
	
   Bike b1  = new SisBike();
   
   System.out.println(b1 );
   System.out.println(b1 instanceof Object);
   System.out.println(b1 instanceof Bike);
   System.out.println(b1 instanceof SisBike);
   System.out.println(b1 instanceof Flyable);
   System.out.println(b1 instanceof Swimmable);
   
   System.out.println("_______________________");
    b1  = new BikeType3();
   
   System.out.println(b1 );
   System.out.println(b1 instanceof Object);
   System.out.println(b1 instanceof Bike);
   System.out.println(b1 instanceof SisBike);
   System.out.println(b1 instanceof Flyable);
   System.out.println(b1 instanceof Swimmable);
   
   
   System.out.println("_______________________");
    b1  = new BikeType4();
   
   System.out.println(b1 );
   System.out.println(b1 instanceof Object);
   System.out.println(b1 instanceof Bike);
   System.out.println(b1 instanceof SisBike);
   System.out.println(b1 instanceof Flyable);
   System.out.println(b1 instanceof Swimmable);
   

   
	}//end main

}//end class