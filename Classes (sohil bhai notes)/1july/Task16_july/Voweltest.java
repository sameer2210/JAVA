public class Voweltest {

	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("enter alphabet");
	String str = scan.nextLine();
	char alphabet = str.charAt(0);
/*	
	if(alphabet=='a'){
		System.out.println("its vowel a for aao batao");
	}else if(alphabet=='e'){
		System.out.println("its vowel e for ese batao");
	}else if(alphabet=='i'){
		System.out.println("its vowel i for inhe batao");
	}else if(alphabet=='o'){
		System.out.println("its vowel o for oor batao");
	}else if(alphabet=='u'){
		System.out.println("its vowel u for unhe batao");
	}else{
		System.out.println("NOT a vowel");
	}
*/
System.out.println("______________________________________________");
		
	switch(alphabet){
	case'a':
		System.out.println("its vowel a for aoo batao");
	break;
	case'e':
		System.out.println("its vowel e for ese batao");
	break;
	case'i':
		System.out.println("its vowel i for isse batao");
	break;
	case'o':
		System.out.println("its vowel   o for outstanding");
	break;
		  
	case 'u':
			System.out.println("its vowel   uc for unique");
	break;
	default : 
	     System.out.println("NOT a vowel");
		 break;
	}
}
}