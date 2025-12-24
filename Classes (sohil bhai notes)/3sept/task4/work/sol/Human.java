public class Human{
	String name;
	
	void action(Kmobile mobile){
		System.out.println(name + "action with " + mobile);
		mobile.clickCamera();
		mobile.search();
		mobile.off();
	}
		
	void action(Kmouse mouse){
		System.out.println(name + "action with "+ mouse);
		mouse.leftClick();
		mouse.rightClick();
		mouse.scroll();
	}
	
	void action(Kbook book){
		System.out.println(name + "action with " + book);
		book.open();
		book.turn();
		book.fold();
		book.close();
	}
		
	void action(Kpen pen){
		System.out.println(name + " action with " + pen);
		pen.capOpen();
	    pen.capClose();
		pen.changeLead();
	}
	
	
	
}//end class