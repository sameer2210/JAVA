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

  //Date  28/10/2020
 public class Test3 {

	public static void main(String args[]){
	
 java.util.Scanner scan  = new java.util.Scanner(System.in);
 System.out.println("how many words do you want to store?");
 int totalWord =scan.nextInt();
 String wordList[]  = new String[totalWord];
 for(int w=1;w<=wordList.length;w++){
   System.out.println("enter word#"+w);
   String word  = scan.next();
   wordList[w-1]=word;
 }
 System.out.println(java.util.Arrays.toString(wordList));
 
 
 
 
 
 
 
 
 
	  
	}//end main

}//end class