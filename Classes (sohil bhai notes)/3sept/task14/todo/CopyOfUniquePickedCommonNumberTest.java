import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class CopyOfUniquePickedCommonNumberTest {

	public static void main(String[] args) {

		User.showCommanNumberList();
		
		
		User user1 = new User("ravi","male");
		User user2 = new User("gita","female","1234567890");
		User user3 = new User("rita","female");
		User user4 = new User("raju","male","1234567899");
		
		user1.showInfo();
		user2.showInfo();
		user3.showInfo();
		user4.showInfo();
	user1.getshowMatched();
	user2.getshowMatched();
	user3.getshowMatched();
	user4.getshowMatched();
		int pickNumber  = User.pickedNumberForAllUser();
		System.out.println("#1 = pickedNumber"+pickNumber);
		user1.updateMatchedNumber(pickNumber);
		user2.updateMatchedNumber(pickNumber);
		user3.updateMatchedNumber(pickNumber);
		user4.updateMatchedNumber(pickNumber);
		System.out.println("++++++++++++++++++++++++++");
		user1.getshowMatched();
		user2.getshowMatched();
		user3.getshowMatched();
		user4.getshowMatched();
		
		pickNumber  = User.pickedNumberForAllUser();
		System.out.println("#2 = pickedNumber"+pickNumber);
		user1.updateMatchedNumber(pickNumber);
		user2.updateMatchedNumber(pickNumber);
		user3.updateMatchedNumber(pickNumber);
		user4.updateMatchedNumber(pickNumber);
		System.out.println("++++++++++++++++++++++++++");
		user1.getshowMatched();
		user2.getshowMatched();
		user3.getshowMatched();
		user4.getshowMatched();
		
		pickNumber  = User.pickedNumberForAllUser();
		System.out.println("#3 = pickedNumber"+pickNumber);
		user1.updateMatchedNumber(pickNumber);
		user2.updateMatchedNumber(pickNumber);
		user3.updateMatchedNumber(pickNumber);
		user4.updateMatchedNumber(pickNumber);
		System.out.println("++++++++++++++++++++++++++");
		user1.getshowMatched();
		user2.getshowMatched();
		user3.getshowMatched();
		user4.getshowMatched();
		
		 
	}

}
