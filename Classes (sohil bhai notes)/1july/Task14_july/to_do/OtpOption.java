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

  //Date  21/02/2020
 public class OtpOption {

	public static void main(String args[]){
	
	   //0 = num 1 =uc  2=lower
	   
	   String s1="";
	   int temp1  = (int)(Math.random()*10);
	   int option1  = temp1%3;//0-2
	   if(option1==0){
			s1 +=  (int)(Math.random()*10);  //0-9
	   }else if(option1==1){
		  s1 += (char) (((int)(Math.random()*100))%26+65);
	   }else if(option1==2){
			int t = ((int)(Math.random()*100))%26 + 97; //97-122
	      char ch1  = (char)t;
		  s1 +=  ch1;  //0-9
	   }
	   
	   System.out.println(s1);
	  
	}//end main

}//end class