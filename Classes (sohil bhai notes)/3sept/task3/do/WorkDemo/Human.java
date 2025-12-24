public class Human{
	String name;

	void actionWithMobile(Mobile mobile){
		System.out.println(name +" action with " +mobile);
		mobile.on();
		mobile.search();
		mobile.off();
	}

	void actionWithMouse(Mouse mouse){
		System.out.println(name +" action with "+mouse);
		mouse.leftClick();
		mouse.rigthClick();
		mouse.scroll();
	}

	void actionWithPen(Pen pen){
		System.out.println(name +" action with "+pen);
		pen.capOpen();
		pen.capClose();
		pen.changeLead();
	}

	void actionWithBook(Book book){
		System.out.println(name +" action with "+ book);
		book.open();
		book.turn();
		book.fold();
		book.close();
	}

}//end of class


