package revision;

class Inheritance2 extends Inheritance{
	void drink() {
		System.out.println("aayush drinking water......");
	}
	
	int y;
	
	public int gety() {
		return y;
	}
	
	public void sety(int y) {
		System.out.println("aayush set set setr set set");
		this.y = y;
	}
	
		public static void main(String[] args){
			
			
//			Inheritance in = new Inheritance();
			Inheritance2 t = new Inheritance2();
			
			 t.run();
			 t.speak();
			 t.eat();
			t.setx(5);
			t.getx();
			 
		     t.drink();
			 t.sety(1);
	         t.gety();
		}
}		