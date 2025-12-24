import java.util.Random;

public class CaseRaq2 {
	public static void main(String args[]){
	
		Human myFriendList[]=
				{new Human(),
				new Trainer(),
				new Singer(),
				new Student(),
			
			new Human(),
			new Singer(),
			new Student(),
				
				new Trainer()
				};
				
	//student meet my any friend
		
	int pickIndex = new Random().nextInt(myFriendList.length);
		//o-5
	Human sirFriend = myFriendList[pickIndex];
	System.out.println("sir friend "+ sirFriend);
	sirFriend.speak();
	
	//human or Student or Trainer Or Singr
	//which form call it will know at time of execute
	//Run time polymorphism
	//Late binding
	//dynamical binding
	//polymorphism 2 way
	
	
	}//end main
}//end class