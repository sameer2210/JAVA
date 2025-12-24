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
 public class Student{ 
	String name;
	//copy only ref address
	void addInfoInWhiteBoard(WhiteBoard sisWhiteBoard){
	  System.out.println(name +" student has WhiteBoard ref "+ sisWhiteBoard +" start add info ");
	  
	  try{ Thread.sleep(3000); } catch(Exception e){}
	  
		String temp   = (int)(Math.random()*100)+ " :"+name;
		sisWhiteBoard.updateData(temp);
	  System.out.println(name +" student has added info "+ temp +" in "+sisWhiteBoard);
	}
	
	
 }//End of class 
