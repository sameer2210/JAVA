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

  //Date  03/03/2020
 public class StringPalindromWay1 {

	public static void main(String args[]){
	//ctrl+q  for notepad++ comment
	  // String str="java";
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  System.out.println("enter your text");//java
	  String str=scan.nextLine();
	  long startTime = System.nanoTime();
	  String revStr=new String("");
	  for(int pos=str.length();pos>=1;pos--){
	       char ch  = str.charAt(pos-1);
		   revStr = revStr+ch;
	    //System.out.println((pos-1)+" "+ch);
	  }
	  long endTime = System.nanoTime();
	  System.out.println("way1 TotalTime= "+ (endTime-startTime));
	  ///avaj
	  System.out.println("rev " + revStr);
	  System.out.println(str.equals(revStr)?"Palindrom":" NOT Palindrmo");
	  
	  
	}//end main

}//end class