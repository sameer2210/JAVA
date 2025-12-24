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

  //Date  02/11/2020
 public class Test3 {

/*	 way 1 			//never compile

		public static void main(String args[]){
				X.m3();   //caller must be handled  exception  may be come or not
		}//end main
*/  way2
  compile but wrong approach : why?  exception  must not reach to jvm..,it will shutdown app
		public static void main(String args[])throws Exception{
				X.m3();   //caller must be handled  exception  may be come or not
		}//end main
*/
  //compile but wrong approach : why?  exception  must not reach to jvm..,it will shutdown app
		public static void main(String args[]){
		try{
				X.m3();   //caller must be handled  exception  may be come or not
		}catch(Exception e){  
		 System.out.println("error found "+ e.getMessage() +" ");
		 System.out.println("TODO for problem.....");
		}		
				
		}//end main





}//end class