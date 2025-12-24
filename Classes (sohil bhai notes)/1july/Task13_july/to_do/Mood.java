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

  //Date  20/02/2020
 public class Mood {

	public static void main(String args[]){
	
	  String moodType=null;
	  
	  int moodOption =  ((int) (Math.random()*10))%2;
	  
	  if(moodOption==0){
	    moodType="happy";
	  }else{
	    moodType="very happy";
	  }
	  
	  System.out.println("today student mood is " + moodType);
	  
	  
	  
	  
	  System.out.println();
	  
	}//end main

}//end class