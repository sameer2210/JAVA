public class MsPaint extends Software {
	
	void draw() {
		System.out.println(this + " drawing ...");
	}
	void erase() {
		System.out.println(this + " erase.... ");
	}
	
	void close() {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("do you want to save and exit ?true/false");
		boolean save = scan.nextBoolean();
		if(save) {
			System.out.println("saved your data and Close " + this);
			System.exit(0);
			}else{
				System.out.println("continue work " +this );
			}
			
	}//void
	
}//class