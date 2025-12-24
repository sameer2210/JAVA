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
 public class StudentInfo {

	public static void main(String args[]){
	 //String [] studentNames;
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
	 System.out.println("how many student names required?");
	 String [] studentNameList = new String[scan.nextInt()];
	 System.out.println("total students "+ studentNameList.length);
	 
	 for(int stu=1;stu<=studentNameList.length;stu++){
	     String name  =  studentNameList[stu-1];
		 System.out.println("sno#"+stu  +" name  = " + name);
	 }
	 //fill values
	 for(int stu=1;stu<=studentNameList.length;stu++){
		 System.out.println("enter stu"+stu  +" name ");
	     String name  =  scan.next();
		 studentNameList[stu-1] = name;
	 }


	  for(int stu=1;stu<=studentNameList.length;stu++){
	     String name  =  studentNameList[stu-1];
		 System.out.println("sno#"+stu  +" name  = " + name);
	 }
	 
	}//end main

}//end class