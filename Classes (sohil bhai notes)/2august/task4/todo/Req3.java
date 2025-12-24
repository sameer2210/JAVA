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
 public class Req3 {
//RAM HEAP   FILE  DB
	public static void main(String args[]) throws Exception{
	java.util.Random rand  = new java.util.Random();
	
	int [] numberList= new int[5];//[0,0,0,0,0]
	java.util.Date [] createdTimeList= new java.util.Date [numberList.length];
	//[null,null,null,null,null,]
	for(int sno=1;sno<=numberList.length;sno++){
	  int temp  = rand.nextInt(100000);
	  java.util.Date currentTime  = new java.util.Date(); 
	  
	   numberList[sno-1] = temp;
	   createdTimeList[sno-1] = currentTime;
	  
		System.out.println("number#"+sno +"created...");
		int delaySecond  = rand.nextInt(3)+1;
		Thread.sleep(delaySecond*1000);//1 second
	}
	
	System.out.println("numbers are followings:");
	
	
	for(int sno=1;sno<=numberList.length;sno++){
	 
	    int currentFetchNum  = numberList[sno-1];
		java.util.Date  createdTime  = createdTimeList[sno-1] ;
		String str  = ""+createdTime;
		String timeStr  = str.substring(11,19);  
		//System.out.println("sno#"+sno +"= " + currentFetchNum +" "+createdTime);
		//System.out.println("sno#"+sno +"= " + currentFetchNum +" "+timeStr);
		System.out.printf("sno#%-2d=%-8d %-20s\n",sno ,currentFetchNum,timeStr);
	}
	
	
	
	 
	 
	 
	 
	  
	}//end main

}//end class