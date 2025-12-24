public class SwDemoCase1 {
	public static void main(String args[]){
	
		Calculator c1 = new Calculator();
			c1.open();
			c1.min();
			c1.max();
			c1.restore();
			c1.move();
			
			c1.add(1,2);
			c1.sub(5,2);
			c1.close();
			System.out.println("_____________________");
			
		MsPaint p1 = new MsPaint();
			p1.open();
			p1.min();
			p1.max();
			p1.restore();
			p1.move();
			
			p1.draw();
			p1.erase();
			
			p1.close();
			System.out.println("________________________");
			
		StickyNote s1 = new StickyNote();
			s1.open();
			s1.min();
			s1.max();
			s1.restore();
			s1.move();
			
			s1.writeTodoNotes();
			s1.changeColor();
			
			s1.close();			
			
	}//end main		
			
}//end calss			