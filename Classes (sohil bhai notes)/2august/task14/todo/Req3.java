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
 public class Req3 {

	public static void main(String args[]){
	  
	String [] wordList={"career","job","java","sis","nit","success","salary","fit"};
	//limit: 
	
	//req print
	for(int w=1;w<=wordList.length;w++){
	  String name  = wordList[w-1];
	  System.out.println(name +" ");
	}
	System.out.println("better way-----------for each");
	for(String name : wordList){
	  System.out.println(name);
	}
	
	
	System.out.println("+++++++++++++++++++++++");	
	//req print
	for(int w=1;w<=wordList.length;w++){
	  String name  = wordList[w-1];
	  System.out.println("sno#"+w +" = "+name );
	}
	
	  
	}//end main

}//end class