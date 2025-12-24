public class Human {
	String name;
	String gender;
	float weight;
	String speakLanguage1;
	String speakLanguage2;
	
	void speak(){
		System.out.println("(h)" + name + ":" +gender+ ":" + weight + "::" + speakLanguage1 +"  Speaking....");
	}
	void eat(){
		System.out.println("(h)" + name+ ":" + gender + ":" + weight + "::" + speakLanguage1 + "  eating.....");
	}
	void sleep(){
		System.out.println("(h)"+ name +":" + gender + ":" + weight + "::" + speakLanguage1 + "  sleeping.....");
	}
	void run(){
		System.out.println("(h)" + name + ":" +gender+":" + weight + "::" + speakLanguage1 + "  runing....");
	}
	
}//end class