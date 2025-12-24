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

  //Date  18/08/2020
 public class Test1 {

	public static void main(String args[]){
	//size 8     total element 5
	  String arr[] ={"aaa","bbb","ccc", "ddd","eee",null,null,null} ;
	  int totalElement=5;
	  for(int e=1 ;e<=totalElement;e++){
	    System.out.println("index =" +(e-1) +" pos = "+e +"  = " + arr[e-1]);
	  }
	  
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 System.out.println("enter delete pos   1-5 ");
   	 int deletePos = Integer.parseInt(scan.nextLine()) ;//scan.nextInt();
     	 System.out.println();
	 
	int deleteIndex = deletePos-1;
	int lastShiftIndex = totalElement-1;
	
	//shift element
	for(int s=deleteIndex;s<=lastShiftIndex;s++){
	   System.out.println(s);
	    arr[s] = arr[s+1];
	}
	totalElement--;

	System.out.println("__________________");
	 for(int e=1 ;e<=totalElement;e++){
	    System.out.println("index =" +(e-1) +" pos = "+e +"  = " + arr[e-1]);
	  }
	  
	  
	}//end main

}//end class