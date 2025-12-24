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

  //Date  23/02/2020
 public class StringSpeDemo2 {

	public static void main(String args[]){
		  System.out.println();

	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("enter file name for check type");
	String fileName =scan.nextLine();
	
	if(fileName.endsWith(".java")){
	 System.out.println("file is java type");
	}else if(fileName.endsWith(".class")){
	 System.out.println("file is byte code");
	}else if(fileName.endsWith(".c")){
	 System.out.println("file is c");
	}else if(fileName.endsWith(".cpp")){
	 System.out.println("file is c plus plus");
	}else if(fileName.endsWith(".php")){
	 System.out.println("file is php");
	
	}else{
	  System.out.println("other type");
	}
	
	
	
	
	}//end main

}//end class