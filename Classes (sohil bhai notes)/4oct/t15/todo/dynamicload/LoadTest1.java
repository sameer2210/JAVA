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

  //Date  04/10/2020
 public class LoadTest1 {

	public static void main(String args[]){
	  
	  //static   must know which bluePrint required
	  //   load it	  //create object 	  //then use object
	//load class ,   static block  , constrcutor ,create object  then method 
	java.util.Random rand  = new java.util.Random();
	System.out.println(rand);
	System.out.println(rand.nextInt());
	System.out.println("____________________________");	
		Trainer t  =  new Trainer();
		 t.teach();
		//load class ,   static block  , constrcutor ,create object  then method 
	}//end main

}//end class