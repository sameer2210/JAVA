
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

  //Date  30/10/2020
 public class MustToDo {

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random();
	try{
		System.out.println("TODOA1stmt");
		System.out.println("TODOA2stmt");
		boolean flag=rand.nextBoolean();
		if(flag==true){  int a  = 10/0;		}
		System.out.println("TODOA3stmt");
		System.out.println("TODOA4stmt must be execute");
	}catch(Exception e){
	 System.out.println("ERROR : "+ e.getMessage());
	}
	System.out.println("_______________");
	System.out.println("happy ending ");
	  
	}//end main

}//end class