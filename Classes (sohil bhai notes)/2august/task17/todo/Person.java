/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  31/08/2020
 public class Person{ 
     String name;
     String gender;
	 int age;
   
   
   void aboutMySelf(){
			//process 
		//text print     printer...   speaker
        System.out.println("My name is :" + name);
        System.out.println("Age is  : " + age);
        System.out.println("and Gender is : " + gender);
   
   }
   
   int giveNumber()  {
        //generate one number and return 
		int number  =(int) (Math.random()*1000);
		return number;
	}
   
   int [] generateNumbers(int totalRequiredNumber){
		java.util.Random rand  = new java.util.Random();
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
       String colors[] ={"reg", "green", "white", "blue", "pink", "black"};
	   java.util.Random rand  = new java.util.Random();
	   int pickIndex  = rand.nextInt(colors.length);//0-5
	   pickColor  = colors[pickIndex];
	   
	   return pickColor;
}


int totalWords(String sentence){
    //process
     String [] words = sentence.split(" ");
	 int  totalWords= words.length;
	 return totalWords;
}

void writeWinnerNotes(String msg){
  //write into notes   //print....
  System.out.println("Name "+ name  +" writing notes [" +msg+"]");

}   
   
   
 }//End of class 
