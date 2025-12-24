public class Studentdemo2{
	public static void main(String args[]){
	
	int data3 = 10;
	boolean data1 = true;
	float data4 = 20.4f;
	String data2 = "java is simple";
	
	Student s1 = new Student();
	 s1.speakInt(data1);				//not working = sol
	 s1.speakBoolean(data2);
	 s1.speakFloat(data3);
	 s1.speakString(data4);
	 
	
	}//end main
}//end class