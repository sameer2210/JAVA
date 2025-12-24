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

  //Date  16/03/2020
 public class ArrayTest4 {

	public static void main(String args[]){
	
	 int []arr= new int[5];
	 
	System.out.println(arr[0]); 
	System.out.println(arr[1]); 
	System.out.println(arr[2]); 
	System.out.println(arr[3]); 
	System.out.println(arr[4]); 
	System.out.println("____________________");
	arr[0]=1001;
	arr[1]=1002;
	arr[2]=1003;
	arr[3]=1004;
	arr[4]=1005;
	
	
	System.out.println(arr[0]); 
	System.out.println(arr[1]); 
	System.out.println(arr[2]); 
	System.out.println(arr[3]); 
	System.out.println(arr[4]); 
	 System.out.println("_______________________");
	 for(int pos=1;pos<=5;pos++){
	   System.out.println("sno"+pos +" = " + arr[pos-1]);
	 }
	 
	  
	}//end main

}//end class