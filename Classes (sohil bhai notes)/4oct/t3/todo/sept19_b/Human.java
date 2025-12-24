
public class Human {
  	String name;
	String gender;
	float  weight;
	String speakLanguage1;
	String speakLanguage2;//String []speakLanguages;
	
	void speak(){ 
		System.out.println("(h)"+name+":"+gender+":"+weight +"::"+speakLanguage1 +"  Speaking..");
	}
	void eat(){ 
		System.out.println("(h)"+name+":"+gender+":"+weight +"::"+speakLanguage1 +"  eat..");
	}
	void sleep(){ 
		System.out.println("(h)"+name+":"+gender+":"+weight +"::"+speakLanguage1 +"  sleep..");
	}
	void run(){ 
		System.out.println("(h)"+name+":"+gender+":"+weight +"::"+speakLanguage1 +"  run..");
	}
	
}
