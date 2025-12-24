
public class Student extends Human{
	String id;
	String institute;
	float percentage;
	
		public void read(){
			System.out.println("s)reading " + name + ":" + gender + ":" + weight + "::" + speakLanguage1 + " # " + id + " # " + institute + "*" + percentage);
		}
		public void write(){
			System.out.println("(s)Writing " + name + ":" + gender + ":" + weight +"::" + speakLanguage1 + "# " + id + " # "  + institute + " * " + percentage);
		}
		
}//end class