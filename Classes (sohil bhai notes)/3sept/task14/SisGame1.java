public class SisGame1 {
	public static void main(String args[]) {
	
		User user1 = new User("sameer ","male");
		User user2 = new User("riya ","female","123456789");
		User user3 = new User("rita","female");
		User user4 = new User("ravi","male","123564789");
		
		user1.showInfo();
		user2.showInfo();
		user3.showInfo();
		user4.showInfo();
	 
	 user1.getshowMatched();
	 user2.getshowMatched();
	 user3.getshowMatched();
	 user4.getshowMatched();
	 
		User.showCommanNumberList();
	
	
	}//end main
}//end class