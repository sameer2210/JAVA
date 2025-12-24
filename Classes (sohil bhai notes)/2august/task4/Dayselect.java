public class Dayselect {
	public static void main(String args[])throws Exception{
	
	java.util.Random rand = new java.util.Random();
	String [] dayList = new String[7];
	
	dayList[0]="sunday";
	dayList[1]="monday";
	dayList[2]="tueday";
	dayList[3]="wedday";
	dayList[4]="thuday";
	dayList[5]="friday";
	dayList[6]="satday";
	
	System.out.println("total day "+"\12"+ dayList.length);
	for(int pick=1;pick<=10;pick++){
		Thread.sleep(1000*(rand.nextInt(3)+1));
		int pickDayIndex=rand.nextInt(dayList.length);
		
		String pickDay= dayList[pickDayIndex];
		System.out.print("\r"+pickDay.toUpperCase());
	}
}
}