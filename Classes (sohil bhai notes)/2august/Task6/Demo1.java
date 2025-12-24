public class Demo1 {
	public static void main(String args[]){
	
	int [] coinArr = new int[5];
	coinArr[0] = 1;
	coinArr[1] = 2;
	coinArr[2] = 3;
	coinArr[3] = 4;
	System.out.println("total coins "+ coinArr.length);
	
	//fetch
	System.out.println(coinArr[0]);
	System.out.println(coinArr[1]);
	System.out.println(coinArr[2]);
	System.out.println(coinArr[3]);
	
	//fetch
	for(int coinNo=1;coinNo<=coinArr.length;coinNo++){
	int coinValue = coinArr[coinNo-1];
	System.out.println("sno# " +coinNo +" = "+ coinValue);
	}
	
}
}