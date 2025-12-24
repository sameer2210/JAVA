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

  //Date  24/02/2020
 public class VowelTest2 {

	public static void main(String args[]){
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   System.out.println("enter alphabet");//"a"
	   String str  = scan.nextLine();//"a"
	   char alphabet = str.charAt(0);//"a"->  'a'
	   
	   switch(alphabet){
	      case 'a':
			System.out.println("its vowel  a for apple");
		  break;
		  case 'e':
			System.out.println("its vowel   e for eagle");
		  break;
		  
		  case 'i':
			System.out.println("its vowel   i for iphone");
		  break;
		  
		  case 'o':
			System.out.println("its vowel   o for outstanding");
		  break;
		  
		  case 'u':
			System.out.println("its vowel   uc for unique");
		  break;
		 default : 
	     System.out.println("NOT a vowel");
		 break;
	   }//end 
	   
	   
	   
	   
	   
	   
	   
	   
	  
	}//end main

}//end class