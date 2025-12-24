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

  //Date  26/08/2020
 public class TravelDemo {

	public static void main(String args[]){
	
	  String [] days={"MON","TUE","WED","THU","FRI"};
	  int [][]data = {
	      {45,30,35,40,74},
	      {20,80,35,56,84},
	      {56,35,45,67,45},
	      {20,50,35,34,74},
	      {70,67,55,89,65},
	      {60,45,67,80,74},
	      {70,65,65,90,54},
	  };
	  
	  System.out.println("total weeks " +data.length );
	  
		System.out.println("_____________________________________");
		System.out.printf("%5s","D/W");
	   for(int day=1;day<=days.length;day++){
	    String name = days[day-1];
		System.out.printf("%5s",name);
		}
		System.out.println("\n_____________________________________");
	  
	  for(int week=1;week<=data.length;week++){
	     System.out.printf("%5s","week"+week);
		 int weekDataKm[] =data[week-1]; 
		 //5 day data
		 for(int day=1;day<=weekDataKm.length;day++){// data[week-1].length;
		   int km  = weekDataKm[day-1];  // OR data[week-1][day-1];
			System.out.printf("%5d",km);
		   }//end day wise data 
		 
		 System.out.println();
	  }
	  // find total sum 
	  int totalKmSum =0;
	  float  avgKm =0;
	  int minKm =data[0][0];
	  int maxKm=data[0][0];
	  int totalDays=0;
	  
	    for(int week=1;week<=data.length;week++){
	    for(int day=1;day<=data[week-1].length;day++){// ;
		       int tempKm  = data[week-1][day-1];
			   totalKmSum = totalKmSum+tempKm;
			   totalDays++;
			   //min
			   if(minKm>tempKm){
				minKm = tempKm;
			   }
			   
			    if(maxKm<tempKm){
				maxKm = tempKm;
			   }
		   } 
		 }
		 
		 
		 avgKm =  (float)totalKmSum/totalDays;
		 System.out.println("+++++++++++++++++++++++++++");
		 System.out.println("total Days " + totalDays);
		 System.out.println("total km " + totalKmSum);
		 System.out.println("avg km " +avgKm);
		 System.out.println("min km " +minKm);
		 System.out.println("max km " +maxKm);
		 float patrolInLtr  = (totalKmSum/40F) ;
		 System.out.println("patrol required  " +patrolInLtr+"Ltr");
		 System.out.println("patrol price /lter  75 ");
		 System.out.println("required money " +(patrolInLtr*75) +"Rs");
		 System.out.println("+++++++++++++++++++++++++++");
	  
	  
	  
	}//end main

}//end class