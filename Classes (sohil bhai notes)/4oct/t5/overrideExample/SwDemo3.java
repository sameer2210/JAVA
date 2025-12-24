public class SwDemo3{
	public static void main(String args[]){
	
	MsPaint p1 =new MsPaint();
		p1.open();
		p1.min();
		p1.max();
		p1.restore();
		p1.move();
		
		p1.draw();
		p1.erase();
		p1.close();
	System.out.println("___________-------___________");
	
	
	}//end main
}//end class