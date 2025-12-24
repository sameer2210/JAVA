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
 public class ArrayTest6 {

	public static void main(String args[]){
	
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 System.out.println("how many element required");
	 int []arr= new int[  scan.nextInt()   ];
	 
	  System.out.println(arr);
	  System.out.println("total element size "+arr.length);
   

   System.out.println("_______________________");
	 for(int pos=1;pos<=arr.length;pos++){
	   System.out.println("sno"+pos +" = " + arr[pos-1]);
	 }
	//CTE   arr.length=10;
	  
	}//end main

}//end class