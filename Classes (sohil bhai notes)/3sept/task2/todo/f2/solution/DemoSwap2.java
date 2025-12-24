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
 public class DemoSwap2 {

	public static void main(String args[]){
	
	UpdateUtil  util= new UpdateUtil();
	
	
	BoxType1 box = new BoxType1();
	System.out.println("main box = "+ box);
	box.a=100;//	 int a=100;
	 box.b  = 200; //int b =200;
	 System.out.println(" main a= " + box.a  +" b = " +box.b); 
	 util.swap2(box);
	 
	System.out.println("after swap main a= " + box.a  +" b = " +box.b);
	//a=100 b=200
		
	  
	}//end main

}//end class