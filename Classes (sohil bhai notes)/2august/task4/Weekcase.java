public class Weekcase{
	public static void main(String args[])throws Exception{

	String [] dayList =null;
	dayList = new String[7];
	
	dayList[0]="sunday";
	dayList[1]="monday";
	dayList[2]="tueday";
	dayList[3]="wednesday";
	dayList[4]="thu";
	dayList[5]="fir";
	dayList[6]="sat";
/*	
	String [] dayList={"sun","mon","tus","wed","thu","fri","sat"};
*/	
	for(int dayNumber=1;dayNumber<=dayList.length;dayNumber++){
		String dayName= dayList[dayNumber-1];
		System.out.println("day# "+dayNumber +" = " + dayName);
	}
	
}
}

