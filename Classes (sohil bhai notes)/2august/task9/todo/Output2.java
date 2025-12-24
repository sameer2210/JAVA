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

  //Date  20/08/2020
 public class Output2 {

	public static void main(String args[]){
	
System.out.println("start");	  
int counter  =0;
   for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				for(int k=1;k<=5;k++){
			   System.out.println(" loop "+ ++counter);
			   
			   if(i==2&&j==2&& k==2){
			         break;
				  //stop loop
			   }
			}//k loop
			if(i==2 & j==2 )break;
			
      }//j loop
           if(i==2){  break;}
	}  
	  
System.out.println("end  ");	  
	}//end main

}//end class