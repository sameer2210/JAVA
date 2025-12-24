public class SwDemoCase1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.open();// S
		c1.min();// S
		c1.max();// S
		c1.restore();// S
		c1.move();// S

		c1.add(1, 2);// C
		c1.sub(5, 2);// C

		c1.close();// S
		System.out.println("_____________***********_________________");

		MsPaint p1 = new MsPaint();
		p1.open();// S
		p1.min();// S
		p1.max();// S
		p1.restore();// S
		p1.move();// S

		p1.draw();// p
		p1.erase();// p

		p1.close();// P override
		System.out.println("_____________***********_________________");

		StickyNote s1 = new StickyNote();
		s1.open();// S
		s1.min();// S
		s1.max();// S
		s1.restore();// S
		s1.move();// S

		s1.writeTodoNotes();// sn
		s1.changeColor();// sn

		s1.close();// S
	}

}
