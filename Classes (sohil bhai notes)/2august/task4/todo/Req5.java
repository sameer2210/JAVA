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

  //Date  17/03/2020
 public class Req5 {
	public static void main(String args[]) throws Exception{
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	boolean [] totdayAttendanceList = new boolean[23];
	
	
	//update info by operator 
	for(int stu=1;stu<=totdayAttendanceList.length;stu++){
	System.out.println("sno#"+stu  +" is    present ? y/n");
	String input  = scan.next();
	char option = input.charAt(0);//"yes" "y"  charAt(0)  y
	 if('y'==option){
	     totdayAttendanceList[stu-1] =true;
	 }//else{   //allready no }
	}
	
	
	for(int stu=1;stu<=totdayAttendanceList.length;stu++){
	boolean isPrensent = totdayAttendanceList[stu-1];
	//System.out.println("sno#"+stu  +" is    present ? "+ isPrensent);
	System.out.println("sno#"+stu  +" is    present ? "+ (isPrensent?"yes":"no"));
	}
	
	
	 
	}//end main

}//end class