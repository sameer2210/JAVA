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

  //Date  19/08/2020
 public class StudentDemo1 {

	public static void main(String args[]){
	
	//fix
	String [][] batchWiseNames = null;
	System.out.println(batchWiseNames);  //null
	
	batchWiseNames = new String [3][3];  
	System.out.println(batchWiseNames);  //[[Ljava.lang.String;@7852e922
	System.out.println("total batch " + batchWiseNames.length);  //3
	System.out.println(" batch1 =  " + batchWiseNames[0]);
	System.out.println(" batch2 =  " + batchWiseNames[1]);
	System.out.println(" batch3 =  " + batchWiseNames[2]);
	
	System.out.println(" batch1 total student =  " + batchWiseNames[0].length);
	System.out.println(" batch2 total student =  " + batchWiseNames[1].length);
	System.out.println(" batch3 total student =  " + batchWiseNames[2].length);
	
	System.out.println(" batch1 1 student name =  " + batchWiseNames[0][0]);
	System.out.println(" batch1 2 student name =  " + batchWiseNames[0][1]);
	System.out.println(" batch1 3 student name =  " + batchWiseNames[0][2]);
	
	
	System.out.println(" batch2 1 student name =  " + batchWiseNames[1][0]);
	System.out.println(" batch2 2 student name =  " + batchWiseNames[1][1]);
	System.out.println(" batch2 3 student name =  " + batchWiseNames[1][2]);
	
	
	System.out.println(" batch3 1 student name =  " + batchWiseNames[2][0]);
	System.out.println(" batch3 2 student name =  " + batchWiseNames[2][1]);
	System.out.println(" batch3 3 student name =  " + batchWiseNames[2][2]);
	batchWiseNames[0][0] ="ravi";
	batchWiseNames[0][1] ="gita";
	batchWiseNames[0][2] ="sita";
	
    	batchWiseNames[1][0] ="amit";
	batchWiseNames[1][1] ="sumit";
	batchWiseNames[1][2] ="rita";
	
	batchWiseNames[2][0] ="gagan";
	batchWiseNames[2][1] ="aman";
	batchWiseNames[2][2] ="chandan";	
	  
	  
	 System.out.println("_________________________________________");
	System.out.println(" batch1 1 student name =  " + batchWiseNames[0][0]);
	System.out.println(" batch1 2 student name =  " + batchWiseNames[0][1]);
	System.out.println(" batch1 3 student name =  " + batchWiseNames[0][2]);
	
	
	System.out.println(" batch2 1 student name =  " + batchWiseNames[1][0]);
	System.out.println(" batch2 2 student name =  " + batchWiseNames[1][1]);
	System.out.println(" batch2 3 student name =  " + batchWiseNames[1][2]);
	
	
	System.out.println(" batch3 1 student name =  " + batchWiseNames[2][0]);
	System.out.println(" batch3 2 student name =  " + batchWiseNames[2][1]);
	System.out.println(" batch3 3 student name =  " + batchWiseNames[2][2]); 
	
	
	  
	}//end main

}//end class