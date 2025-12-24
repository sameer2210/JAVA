public class R2{
	public static void main(String args[])throws Exception{
	
	java.util.Random rand = new java.util.Random();
	int [] numberList = new int[5];

	java.util.Date [] createdTimeList= new java.util.Date [numberList.length];
	for(int sno=1;sno<=numberList.length;sno++){
	int temp = rand.nextInt(1000);
	java.util.Date currentTime = new java.util.Date();
	
	numberList[sno-1]=temp;
	createdTimeList[sno-1]= currentTime;
	
		System.out.println("number# "+sno +"created.....");
		Thread.sleep(1000);

/*
		int delaySecond  = rand.nextInt(3)+1;	// take more time 
		Thread.sleep(delaySecond*1000);
*/

	}	
	System.out.println("numbers are followings:");
	for(int sno=1;sno<=numberList.length;sno++){
	
	int currentFetchNum = numberList[sno-1];
	java.util.Date createdTime = createdTimeList[sno-1];
	
	String str =""+createdTime;
	String timeStr = str.substring(11,19);
	System.out.printf("sno#%-2d=%-8d %-20s\n",sno,currentFetchNum,timeStr);
	}

}
}

