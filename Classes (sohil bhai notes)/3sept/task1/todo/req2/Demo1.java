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

  //Date  31/08/2020
 public class Demo1 {

	public static void main(String args[]){
	
	SisStudent  s1  = new 	SisStudent ();
	s1.saySomething();
	s1.name="Shalini";
	System.out.println("________________");
	s1.saySomething();
	System.out.println("________________");
	s1.updateFovoriteWord("java");
	
	s1.saySomething();
	
	s1.updateWords("green");
	s1.updateWords("apple");
	s1.updateWords("book");
	s1.updateWords("start");
	s1.updateWords("happy");
	System.out.println("________________");
	s1.saySomething();
	


	SisStudent  s2  = new 	SisStudent ();
	s2.saySomething();
	s2.name="ravi";
	s2.updateFovoriteWord("career");
	
	
	
	s2.updateWords("apple");
	s2.updateWords("trainer");
	s2.updateWords("fit");
	System.out.println("________________");
	s2.saySomething();

	
	}//end main

}//end class