public class Human{
	String name;
	
	void actionWithKmobile(Kmobile mobile){
		System.out.println(name +"action with mobile   " + mobile);
		mobile.on();
		mobile.clickCamera();
		mobile.search();
		mobile.off();
	}
	
	void actionWithKmouse(Kmouse mouse){
		System.out.println(name +"action with mouse     " + mouse);
		mouse.leftClick();
		mouse.rightClick();
		mouse.scroll();
	}	
		
	void actionWithKpen(Kpen pen){
		System.out.println(name + "action with pen    "+ pen);
		pen.capOpen();
		pen.capClose();
		pen.changeLead();
	}
	
	void actionWithKbook(Kbook book){
		System.out.println(name + "action with book     "+ book);
		book.opened();
		book.turn();
		book.fold();
		book.closed();
	}
		
	
}//end class