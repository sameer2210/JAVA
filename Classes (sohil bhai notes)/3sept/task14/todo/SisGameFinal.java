import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class SisGameFinal {

	public static void main(String[] args) throws Exception{

		User.showCommanNumberList();
		
		
		User user1 = new User("surendra","male");
		User user2 = new User("ananya","female","1234567890");
		User user3 = new User("jyoti kumari","female");
		User user4 = new User("rashmiranjan","male","1234523699");
		User user5 = new User("ashish","male","1234566899");
		User user6 = new User("karan","male","1234545899");
		User user7 = new User("anjali","female","1234567899");
		
		user1.showInfo();
		user2.showInfo();
		user3.showInfo();
		user4.showInfo();
		user5.showInfo();
		user6.showInfo();
		user7.showInfo();

 	int roundNumber=1;
		while(true){
			System.out.println(Arrays.toString(User.getPickedNumbers()));
			System.out.println("__________Round#"+roundNumber++);
			int pickNumber  = User.pickedNumberForAllUser();
			System.out.println("# = pickedNumber"+pickNumber);
			user1.updateMatchedNumber(pickNumber);
			user2.updateMatchedNumber(pickNumber);
			user3.updateMatchedNumber(pickNumber);
			user4.updateMatchedNumber(pickNumber);
			user5.updateMatchedNumber(pickNumber);
			user6.updateMatchedNumber(pickNumber);
			user7.updateMatchedNumber(pickNumber);
			user1.getshowMatched();
			user2.getshowMatched();
			user3.getshowMatched();
			user4.getshowMatched();
			user5.getshowMatched();
			user6.getshowMatched();
			user7.getshowMatched();
			if(user1.isWinner()||user2.isWinner()
			  ||user3.isWinner()||user4.isWinner()
			  ||user5.isWinner()||user6.isWinner()
			  ||user7.isWinner()  ){
				System.out.println("Winner found$$$$$$$");
				break;
		  }
			
			Thread.sleep(2000);
	}//while
		
 }//main
}//class
