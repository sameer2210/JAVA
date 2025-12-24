public class R4 {
	public static void main(String args[])throws Exception{
	
	System.out.println("total student 10 ");

	java.util.Scanner scan = new java.util.Scanner(System.in);
	boolean [] totaldayAttendanceList = new boolean[10];
	
	for(int stu=1;stu<=totaldayAttendanceList.length;stu++){
	System.out.println("sno# "+stu +"is present ? y/n");
	String input = scan.next();
	char option = input.charAt(0);
	
	if('y'==option){
	totaldayAttendanceList[stu-1]=true;
	}
	}
	for(int stu=1;stu<=totaldayAttendanceList.length;stu++){
	boolean isPresent =totaldayAttendanceList[stu-1];
	Thread.sleep(900);
	System.out.println("sno# "+ stu +" is present ? "+(isPresent?"yes":"no"));
	}

}
}