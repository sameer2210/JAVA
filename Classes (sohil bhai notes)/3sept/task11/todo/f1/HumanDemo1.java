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

  //Date  12/09/2020
 public class HumanDemo1 {

	public static void main(String args[]){
	System.out.println(Human.totalPopulation);//0
	System.out.println("_________________");
	
	
	
	
	Human h1 = new Human();
	Human h2 = new Human();
	Human h3 = new Human();
	
	System.out.println("__________________________");
	h1.show();
	h2.show();
	h3.show();
	
	h1.name="ramesh";
	h2.name="gita";
	h3.name="raju";
	h1.age=22;
	h2.age=20;
	h3.age=23;

	System.out.println("__________________________");
	h1.show();
	h2.show();
	h3.show();

	System.out.println("__________________________");
	System.out.println(h1.totalPopulation);
	System.out.println(h2.totalPopulation);
	System.out.println(h3.totalPopulation);
	   //OR   Best way get class level variable ClassName.variableName
	System.out.println(Human.totalPopulation);
	
	 }

}//end class