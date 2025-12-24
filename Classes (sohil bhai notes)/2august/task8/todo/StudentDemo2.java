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
 public class StudentDemo2 {

	public static void main(String args[]){
	
	//fix
	String [][] batchWiseNames = null;
	//batchWiseNames = new String [3][3];  
	//							OR
	batchWiseNames = new String [3] [];   // batch size  3 NOTE [] empty for stu size
	batchWiseNames[0] = new String [3]; //batch wise student size 3
	batchWiseNames[1] = new String [3]; //batch wise student size 3
	batchWiseNames[2] = new String [3]; //batch wise student size 3
	
	batchWiseNames[0][0] ="ravi";
	batchWiseNames[0][1] ="gita";
	batchWiseNames[0][2] ="sita";
	
   	 batchWiseNames[1][0] ="amit";
	batchWiseNames[1][1] ="sumit";
	batchWiseNames[1][2] ="rita";
	
	batchWiseNames[2][0] ="gagan";
	batchWiseNames[2][1] ="aman";
	batchWiseNames[2][2] ="chandan";	
	  
	  for(int batch=1;batch<=batchWiseNames.length;batch++){
	      int totalStudent =  batchWiseNames[batch-1] .length;
	    System.out.println("batch#"+batch +" has total student " + totalStudent);
		  for(int stu=1;stu<=totalStudent;stu++){
		      String name  = batchWiseNames[batch-1][stu-1];
		     System.out.println("\t stu#"+stu  +" name  = " + name);
		  }
		System.out.println("_____________________________");
	  }
System.out.println("___________________________________________");	  
	    for(int batch=1;batch<=batchWiseNames.length;batch++){
	      int totalStudent =  batchWiseNames[batch-1] .length;
		  for(int stu=1;stu<=totalStudent;stu++){
		      String name  = batchWiseNames[batch-1][stu-1];
		     System.out.printf("%-15s ",name);
		  }
		  System.out.println();
	  }
	  
	}//end main

}//end class