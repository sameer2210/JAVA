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

  //Date  18/03/2020
 public class Spe1 {

	public static void main(String args[]){
	
	   int []data= new int[12];
	   System.out.println("total element "+ data.length);
	   System.out.println("ref "+ data);//[I@7852e922
	   
	   data[0]=10;
	   data[1]=20;
	   data[2]=30;
	   data[3]=40;
	   data[4]=50;
	   data[5]=60;
	   data[6]=70;
	   data[7]=80;
	   data[8]=111;
	   data[9]=222;
	   data[10]=333;
	   data[11]=444;
	   
	   for(int e=1;e<=data.length;e++){
	     System.out.print(e+"# =" + data[e-1]);
		 System.out.println();
	   }
	   
	   
	  
	}//end main

}//end class