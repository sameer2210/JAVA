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

  //Date  03/09/2020
 public class Demo2 {

	public static void main(String args[]){
	
	WhiteBoard sisWhiteBoard =new  WhiteBoard();
	
	Student s1  = new Student();
	Student s2  = new Student();
	Student s3  = new Student();
	s1.name="Jivan";
	s2.name="Ashish";
	s3.name="Ananya";
	
	System.out.println("main  sisWhiteBoard = " + sisWhiteBoard);
	sisWhiteBoard.showData();
	
	s1.addInfoInWhiteBoard(sisWhiteBoard);
	sisWhiteBoard.showData();
	
	 s2.addInfoInWhiteBoard(sisWhiteBoard);
	sisWhiteBoard.showData();
	  
	  s3.addInfoInWhiteBoard(sisWhiteBoard);
	  s3.addInfoInWhiteBoard(sisWhiteBoard);
	  s3.addInfoInWhiteBoard(sisWhiteBoard);
	sisWhiteBoard.showData();
	  
	}//end main

}//end class