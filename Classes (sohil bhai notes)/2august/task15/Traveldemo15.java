public class Traveldemo15 {
	public static void main(String args[]){
	
	String [] days={"MON","TUE","WED","THU","FRI"};
	int [][]data = {
	 {45,25,56,12,55},
	 {65,55,65,85,66},
	 {56,35,45,67,45},
	 {20,50,35,34,74},
	 {70,67,55,89,65},
	 {60,45,67,80,74},
	 {70,65,65,90,54},
	};
	System.out.println("total weeks " + data.length);
	
	System.out.println("___________________________________");
	System.out.printf("%5s","D/W");
	
	for(int day=1;day<=days.length;day++){
	  String name = days[day-1];
		System.out.printf("%5s",name);
		}
		System.out.println("\n_________________________");
	for(int week=1;week<=data.length;week++){
	  System.out.printf("%5s","week"+week);
		int weekDataKm[] =data[week-1];
		//5 day data 
		
	for(int day=1;day<=weekDataKm.length;day++){
	int km =weekDataKm[day-1];
		System.out.printf("%5d",km);
	}
	System.out.println();
	}
	//find total sum
	int totalKmSum =0;
	float avgKm=0;
	int minKm =data[0][0];
	int maxKm =data[0][0];
	int totalDays=0;

	for(int week=1;week<=data.length;week++){
	for(int day=1;day<=data[week-1].length;day++){
	  int tempKm = data[week-1][day-1];
		totalKmSum = totalKmSum+tempKm;
		totalDays++;
		//min 
		if(minKm>tempKm){
			minKm =tempKm;
		}
		if(maxKm<tempKm){
			maxKm = tempKm;
		}
	}
	}
	
	avgKm = (float)totalKmSum/totalDays;
	System.out.println("/n+++++++++++++++++++++++++++++++\n");
	System.out.println("total Days " + totalDays);
	System.out.println("total Km " + totalKmSum);
	System.out.println("avg Km " + avgKm);
	System.out.println("min Km " + minKm);
	System.out.println("max Km " + maxKm);
	float patrollnLtr = (totalKmSum/40F);
	System.out.println("patrol required " +patrollnLtr+"Ltr");
	System.out.println("patrol price/liter 110 ");
	System.out.println("required money " +(patrollnLtr*110) +"Rs");
	System.out.println("\n+++++++++++++++++++++++++++++++");

}
}