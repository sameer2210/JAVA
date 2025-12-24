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

  //Date  28/08/2020
 public class Test {

	public static void main(String args[]){
	
    String s1  = "book";	   
    String s2  = "okob";	  
	System.out.println(s1);
	System.out.println(s2);
	if(s1.length()==s2.length()){
	
	
	    char [] arr1  = s1.toCharArray();   //
		//manual array  char[] ar1 =new char [s1.length] then fill it 
	    char [] arr2  = s2.toCharArray();   //
		java.util.Arrays.sort(arr1);
		java.util.Arrays.sort(arr2);
		
		boolean isAllMatch=true;
		 for(int p=1;p<=arr1.length;p++){
		    char ch1 = arr1[p-1];
		    char ch2 = arr2[p-1];
			if(ch1!=ch2){
			 isAllMatch =false;
			 break;
			}
		 }//end loop
		 
			 if(isAllMatch){
				System.out.println(" Annagram");
			}else{
				System.out.println("NOT Annagram");
			}
	}else{
	 System.out.println("NOT Annagram");
	}
	
	
	
	
	
	
	}//end main

}//end class