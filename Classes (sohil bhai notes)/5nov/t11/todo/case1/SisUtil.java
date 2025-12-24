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

  //Date  31/10/2020
 public class SisUtil{ 
 
			//20-30, 60-70
			public static boolean isValidNumberMethod1(int num){
				boolean temp =false;
				boolean c1  = num>=20&& num<=30;
				boolean c2  = num>=60&& num<=70;
				if(c1 || c2){
					temp =true;
				}else{
					//raise exception 
					String msg="value must be 20-30 or 60-70 :given "+ num;
					NumberRangeException  e = new NumberRangeException(msg);
					throw e;
				}
			
			return temp;
			}
			
			
			//best *****
			public static boolean isValidNumberMethod2(int num) throws NumberRangeException{
				boolean temp =false;
				boolean c1  = num>=20&& num<=30;
				boolean c2  = num>=60&& num<=70;
				if(c1 || c2){
					temp =true;
				}else{
					//raise exception 
					String msg="value must be 20-30 or 60-70 :given "+ num;
					NumberRangeException  e = new NumberRangeException(msg);
					throw e;
				}
			
			return temp;
			}
 }//End of class 
