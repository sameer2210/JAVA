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
 public class StudentAttendanceApp {

	public static void main(String args[]){
	
	//String [] studentNames = new String[24];
	String [] studentNames = {
	"aditya","abhishek","abhishek verma","ananay","ankita",
	"anjali","bharat","jivan","joyti pandey","jyoti kumar",
	"karan","ashish","rasmi","sangita","salini","divyanshu",
	"harshit","swaraj","sohil","ugrsen","vikash","vikil"
	};
	boolean [] todayAttendance = new boolean[studentNames.length];
	//all false 
	//sis Think all student present(true)
	//fill it with true 
	/*
	for(int stu=1;stu<=studentNames.length;stu++){
	todayAttendance[stu-1]= true;
	}*/
	java.util.Arrays.fill(todayAttendance,true);
	
	
	//then update
	
	System.out.println("total student" + studentNames.length);
	for(int stu=1;stu<=studentNames.length;stu++){
	String name  = studentNames[stu-1];
	boolean isPresent = todayAttendance[stu-1];
	 System.out.printf("#%-3d %-15s %-5s \n" ,stu , name  , isPresent);
	}
	
	
	
	
	
	
	
	
	  
	}//end main

}//end class