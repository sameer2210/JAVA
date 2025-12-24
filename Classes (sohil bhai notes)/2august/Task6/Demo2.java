public class Demo2 {
	public static void main(String args[]){
	
	int [] coinArr = {1,2,5,10};
	System.out.println("total coins "+ coinArr.length);
	
	for(int coinNo=1;coinNo<=coinArr.length;coinNo++){
	int coinValue = coinArr[coinNo-1];
	System.out.println("sno# "+coinNo +" = "+coinValue);
	}	
	java.util.Random rand = new java.util.Random();
	
	//int pickIndex = rand.nextInt(4);
	int pickIndex = rand.nextInt(coinArr.length);
	int pick = coinArr[pickIndex];
	System.out.println("picked coin is "+ pick);
	
}
}