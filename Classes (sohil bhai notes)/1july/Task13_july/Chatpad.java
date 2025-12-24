public class Chatpad {
	public static void main (String args[])throws Exception {
	
	//0=H   1=T
	int headOrTail1=( (int)(Math.random()*10) )%2;
	int headOrTail2=( (int)(Math.random()*10)  )%2;
	int headOrTail3=( (int)(Math.random()*10)  )%2;

	System.out.println("toss no1");
	Thread.sleep(5000);
	System.out.println(headOrTail1==0?"Head":"Tail");
	System.out.println("toss no2");
	Thread.sleep(5000);
	System.out.println(headOrTail2==0?"Head":"Tail");
	System.out.println("toss no3");
	Thread.sleep(5000);
	System.out.println(headOrTail3==0?"Head":"Tail");
	
	int totalHead=0;
	int totalTail=0;
	
	if(headOrTail1==0){totalHead++;}
	else{totalTail++;}
	
	if(headOrTail2==0){totalHead++;}
	else{totalTail++;}
	
	if(headOrTail3==0){totalHead++;}
	else{totalTail++;}
	
	System.out.println("total head  ="+totalHead);
	System.out.println("total Tail  ="+totalTail);

	if(totalHead>totalTail){
		System.out.println("winner is Head");
	}else{
		System.out.println("winner is Tail");
	}

}
}



