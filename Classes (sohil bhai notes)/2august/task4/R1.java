public class R1{
	public static void main(String args[])throws Exception{
	
	java.util.Random rand = new java.util.Random();
	int [] numberList = new int[5];
	
	for(int sno=1;sno<=numberList.length;sno++){
	int temp = rand.nextInt(1000);
	numberList[sno-1] = temp;
		System.out.println("number# "+sno +"created.....");
		Thread.sleep(1000);
	}
		System.out.println("numbers are followings:");
	
	for(int sno=1;sno<=numberList.length;sno++){
	int currentFetchNum = numberList[sno-1];
		System.out.println("sno# "+sno +" = " + currentFetchNum);
	}
}
}
