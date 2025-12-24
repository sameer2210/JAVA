public class PersonEye {

	boolean isOpen;
	void open(){
		//System.out.println(this + " open" );
		System.out.print(" O ");
		isOpen = true;
	}
	void close(){
		//System.out.println(this + "close ");
		System.out.print(" = ");
		isOpen=false;
	}
	
	void rotation(){
		System.out.println(this + "rotation ");
	}
	
}//end class