public class Upperlower {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("enter alphabet");
	String input = scan.nextLine();
	char alphabet = input.charAt(0);


	if(alphabet>=65&&alphabet<=90){	//Upper case
		char lower = (char)(alphabet +32);
		System.out.println("lower case = "+lower);
	
	}else if(alphabet>=97&&alphabet<=122){	//Lower case
		char upper = (char)(alphabet -32);
		System.out.println("Upper case = "+upper);
	}else{
		System.out.println("Not a alphabet char");
	}
System.out.println("_________________________________________________");
/*
	if(alphabet>='A'&& alphabet<='Z'){
		char lower = (char)(alphabet +32);
		System.out.println("lower case = " + lower);
	}else if(alphabet>='a'&&alphabet<='z'){
		char upper =(char)(alphabet -32);
		System.out.println("Upper case = " + upper);
	}else{
		System.out.println("Not a alphabet char");
	}
*/				
}
}