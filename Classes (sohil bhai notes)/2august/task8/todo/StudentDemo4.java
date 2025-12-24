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
 public class StudentDemo4 {

	public static void main(String args[]){
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		String [][] myStudents = null;
		System.out.println("how many batch required ");
		int totalBatch  =Integer.parseInt(scan.nextLine());
		//create batch
		myStudents= new String[totalBatch][];
		
		System.out.println("total batch  " + myStudents.length);
		
		//create diff size for each batch student
		for(int batch=1;batch<=myStudents.length;batch++){
		 System.out.println("batch#"+batch  +" = "+ myStudents[batch-1]);
		   System.out.println("enter total student size int this batch");
					int totalStudent  =Integer.parseInt(scan.nextLine());
					myStudents[batch-1]  = new String [totalStudent];
					 
		}//
		
System.out.println("___________________________________");
//fill student names
		for(int batch=1;batch<=myStudents.length;batch++){
		 System.out.println("batch#"+batch  +" has total stu "+ myStudents[batch-1].length);
		 			 for(int stu=1;stu<= myStudents[batch-1].length;stu++){
					   System.out.println("enter #"+stu+" student name");
					   String name  = scan.nextLine();
					   myStudents[batch-1][stu-1]  = name;
					 
					 }//student
		}//batch
		
		
 		for(int batch=1;batch<=myStudents.length;batch++){
			System.out.println("batch#"+batch  +" has total stu "+ myStudents[batch-1].length);
			 for(int stu=1;stu<= myStudents[batch-1].length;stu++){
					String name =  myStudents[batch-1][stu-1] ;
					System.out.println(" #"+stu+"  =  " + name);
					 }//student
					 System.out.println("__________________________________");
		}//batch

 
 
	  
	}//end main

}//end class