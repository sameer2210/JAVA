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

  //Date  25/08/2020
 public class StudentStory {

	public static void main(String args[]){
	
	  String []result = new String [24];
	  System.out.println(java.util.Arrays.toString(result));
	  java.util.Arrays.fill(result,"success");
	  System.out.println(java.util.Arrays.toString(result));
	  
	  
	  char [] arr = new char[10];
	  System.out.println(java.util.Arrays.toString(arr));
	  java.util.Arrays.fill(arr,'*');
	  System.out.println(java.util.Arrays.toString(arr));
	  
	  float arr2[] = new float[10];
	  System.out.println(java.util.Arrays.toString(arr2));
	  java.util.Arrays.fill(arr2,100.0f);
	  System.out.println(java.util.Arrays.toString(arr2));
	  
	  
	  int arrx[]={11,22,33,44,55};
	  int arry[]={11,22,66,44,55};
	  int arrz[]={11,22,33,44,55};
	  System.out.println(java.util.Arrays.toString(arrx));
	  System.out.println(java.util.Arrays.toString(arry));
	  System.out.println(java.util.Arrays.toString(arrz));
	  System.out.println(java.util.Arrays.equals(arrx,arry));//false
	  System.out.println(java.util.Arrays.equals(arrx,arrz));//true
	  
	  
	  
	  
	}//end main

}//end class