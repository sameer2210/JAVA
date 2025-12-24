public class Person{
	
	 String name;
	 String gender;
	 int age;
	
	 void aboutMySelf(){
				//process
			//text print printer...... speker
	 System.out.println("My name is :" + name);
	 System.out.println("Age is : " + age);
	 System.out.println("and Gender is :" + gender);
	
	}
	
	int giveNumber(){
	  //generate one number and return
		int number = (int) (Math.random()*1000);
		return number;
	}
	
	int [] generateNumber(int totalRequiredNumber){
		java.util.Random rand = new java.util.Random();
	  //create array
		int [] numberList = new int[totalRequiredNumber];
		//fill
		for(int e=1;e<=numberList.length;e++){
		 int temp = rand.nextInt(1000);
			numberList[e-1] = temp;
		}
		
		//return;
		return numberList;
	}
	
	String giveColor(){
		String pickColor=null;
	  String colors[] = {"reg","green","white","blue","pink","black"};
	  java.util.Random rand = new java.util.Random();
	  int pickIndex = rand.nextInt(colors.length);
	  pickColor = colors[pickIndex];
	 
	  return pickColor;
	}
	
	int totalWords(String sentence){
	  //process
	  String []words = sentence.split(" ");
		int totalWords = words.length;
		return totalWords;
	}
	
	void writeWinnerNotes(String msg){
	//write into notes	//print.....
	System.out.println("Name " + name +"writing notes [" + msg+"]");
	}
	
}
