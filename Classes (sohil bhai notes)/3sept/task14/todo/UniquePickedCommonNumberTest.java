import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class UniquePickedCommonNumberTest {

	public static void main(String[] args) {

		User.showCommanNumberList();
		int [] commonList = User.getCommanNumberList();
		int [] pickedNumbersList=new int[commonList.length];
		System.out.println(Arrays.toString(commonList));
		Arrays.fill(pickedNumbersList, -1);
		System.out.println(Arrays.toString(pickedNumbersList));
		//piked all number randomly...
		Random rand = new Random();
		int totalSize=1;
		while(true){
			int pickIndex = rand.nextInt(commonList.length);
			int value = commonList[pickIndex];
			boolean alreadyFound=false;
			for (int p = 1; p < pickedNumbersList.length; p++) {
				int temp = pickedNumbersList[p-1];
				if(temp==value){
					alreadyFound=true;
					break;
				}
			}
			
			if(alreadyFound==true){
				continue;
			}
			
			System.out.print(value +" ");
			pickedNumbersList[totalSize-1] =value;
			totalSize++;
			if(totalSize>commonList.length){
				break;
			}
		}
		
		
	}

}
