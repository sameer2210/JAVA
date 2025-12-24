public class SwCase1 {
		public static void main(String args[]){
		
		Calculator c1 = new Calculator();
			c1.open();
			c1.min();
			c1.max();
			c1.restore();
			c1.move();
			
			c1.add(1,2);
			c1.sub(5,3);
			
			c1.close();
			System.out.println("_________________________");
	
	
	
		}//end main
	}//end class