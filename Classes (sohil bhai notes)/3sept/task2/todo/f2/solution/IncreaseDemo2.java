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

  //Date  02/09/2020
 public class IncreaseDemo2 {

	public static void main(String args[]){
	
	UpdateUtil  util= new UpdateUtil();
	
	Dabba dabba1  = new Dabba();
	dabba1.a =100;   //int a=100;
	 
	 System.out.println(" main a= " + dabba1.a );//100
	
	 util.increaseValue2(dabba1);   //// util.increaseValue(a);
	 
	 System.out.println("after main a= " + dabba1.a  );//101
 
		
	  
	}//end main

}//end class