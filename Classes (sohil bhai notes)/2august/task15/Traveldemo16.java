public class Traveldemo16 {
	public static void main (String args[] ){
	
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
	System.out.println("total weeks " + data.length);
	
	System.out.println("______________________________");
	System.out.printf("%5s","D/W");
	for(int day=1;day<=days.length;day++){
	  String name = days[day-1];
		System.out.printf("%5s",name);
		}
		System.out.println("\n_____________________");
	
	for(int week=1;week<=data.length;week++){
	  System.out.printf("%5s","week"+week);
		int weekDataKm[] = data[week-1];
		//5 day data
	for(int day=1;day<=weekDataKm.length;day++){
	  int km = weekDataKm[day-1];
		System.out.printf("%5d",km);
	}//end day wise data
	  System.out.println();
	}
	
	//find total sum
	int totalKmSum =0;
	float avgKm =0;
	int minKm =data[0][0];
	int maxKm=data[0][0];
	int totalDays=0;
		
	for(int week=1;week<=data.length;week++){
	for(int day=1;day<=data[week-1].length;day++){
	  int tempKm = data[week-1][day-1];
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
	avgKm = (float)totalKmSum/totalDays;
	
	int [] weekWiseTotalKm =new int[data.length];
	//System.out.println(java.util.Arrays.toString(weekWiseTotalKm));
	
	for(int week=1;week<=data.length;week++){
	// d1 d2 d3 d4......++++
	  int perWeekSum=0;
		for(int day=1;day<=data[week-1].length;day++){
		  int tempKm = data[week-1][day-1];
			perWeekSum+=tempKm;
		}
		//store in array
		weekWiseTotalKm[week-1] = perWeekSum;	
	}
	//System.out.println(java.Arrays.toString(weekWiseTotalKm));
	int dayWiseTotalKm[] = new int[days.length];
	
	for(int day=1;day<=days.length;day++){
	  //System.out.println(days[day-1]);
		int totalDayKmSum=0;
		  for(int week=1;week<=data.length;week++){
			int km = data[week-1][day-1];
			  totalDayKmSum+=km;
			  //System.out.println("week# "+week +" = " + km);
		  }
		//store array
		dayWiseTotalKm[day-1] = totalDayKmSum;
		//System.out.println("_____________________");
	}
	//System.out.println(java.util.Arrays.toString(dayWiseTotalKm));
	
	//creat report
	System.out.println("*************************************************\n_______________________________");
		System.out.printf("%5s","D/W");
	for(int day=1;day<=days.length;day++){
	  String name = days[day-1];
		System.out.printf("%5s",name);
		}
		System.out.printf("%10s","wwsum ");
		System.out.printf("%10s","wwavg ");
		System.out.println(" \n_________________________");
	
	for(int week=1;week<=data.length;week++){
	  System.out.printf("%5s","week"+week);
		int weekDataKm[] = data[week-1];
		//5 day data
		  for(int day=1;day<=weekDataKm.length;day++){
			int Km = weekDataKm[day-1];
			System.out.printf("%5d",Km);
		  }//end day wise data

		//week wise sum display
		System.out.printf("%10s",weekWiseTotalKm[week-1]);
		System.out.printf("%8.2f ",(float)weekWiseTotalKm[week-1]/days.length);
		System.out.println();
	}
	System.out.println("________________________________\n");
	
	System.out.printf("%5s","dwsum");
	for(int day=1;day<=days.length;day++){
		int dwkm =dayWiseTotalKm[day-1];
		System.out.printf("%5d",dwkm);
	}
	System.out.println();
	//avg print
	  System.out.printf("%-5s","AVG ");
	for(int day=1;day<=days.length;day++){
	  int dwkm = dayWiseTotalKm[day-1];
	  System.out.printf("%3.1f",(float)dwkm/days.length);
	}
	System.out.println("\n___________________________");
	
	System.out.println("++++++++++++++++++++++++++++++");
	System.out.println("total Days "+ totalDays);
	System.out.println("total km "+ totalKmSum);
	System.out.println("avg km " + avgKm);
	System.out.println("min km " +minKm);
	System.out.println("max km " +maxKm);	
	float patrollnLtr = (totalKmSum/40F);
	System.out.println("patrol required " +patrollnLtr+"Ltr");
	System.out.println("patrol price /liter 110");
	System.out.println("required money " + (patrollnLtr*110) +"Rs");
	System.out.println("+++++++++++++++++++++++++++++++\n**************************************************************");

}
}
