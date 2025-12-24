public class Boolex {
	public static void main(String args []){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("candidate belongs to St/Sc caste ? true/false");
	boolean isSelected =scan.nextBoolean();

	if(isSelected){
		System.out.println("Dear kallu...");
		System.out.println("We are happy to inform you..");
		System.out.println("you are selected");
	}else{
		System.out.println("go to hell");
	}

}
}