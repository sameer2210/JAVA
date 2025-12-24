 public class Acase1 {
	public static void main(String args[]){
	//A-L
	System.out.println("______________way1_____________");
	System.out.println("ABCDEFGHIJKL");
	 System.out.print("\n");
	  System.out.println("_______________way2___________");
	  System.out.print("A");
	  System.out.print("B");
	  System.out.print("C");
	  System.out.print("D");
	  System.out.print("E");
	  System.out.print("F");
	  System.out.print("G");
	  System.out.print("H");
	  System.out.print("I");
	  System.out.print("J");
	  System.out.print("K");
	  System.out.print("L");
	  System.out.print("\n");
	  System.out.println("_______________way3___________");
	  char ch='A';
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print(ch++);
	  System.out.print("\n");
	  
	  System.out.println("_______________way4___________");
	char ch2='A';
		for(int print=1;print<=12;print++){
		System.out.print(ch2++);
		}
	System.out.print("\n");
	
	System.out.println("________________way5____________");
		
		for(int print='A';print<='L';print++){
		System.out.print((char)print);
		}
	System.out.print("\n");
	
	System.out.println("_______________way6_____________");
	int print='A';
		for(; print<='L'; ){
			System.out.print((char)print);
			print++;
		}
	System.out.print("\n");
	
	System.out.println("_______________way7_____________");
	int print1='A';
		while(print<='L'){
			System.out.print((char)print1);
		}
	System.out.print("\n");
	
}
}








