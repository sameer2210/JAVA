public class R1 {
	public static void main(String args[]){
	
	String name = args[0];
	String ageStr = args[1];
	String perStr = args[2];
	String placedStr = args[3];
	
	int age = Integer.parseInt(ageStr);
	float per = Float.parseFloat(perStr);
	boolean isPlaced = Boolean.parseBoolean(placedStr);
	
	System.out.println("name " + name);
	System.out.println("age " + age);
	System.out.println(" per " + per);
	
/*	if(per>90)
		if(per>80) 
*/
	System.out.println(" placed ? " + isPlaced);

}
}