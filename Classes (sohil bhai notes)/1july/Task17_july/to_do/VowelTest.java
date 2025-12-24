public class VowelTest{

public static void main(String args[]){

java.util.Scanner scan = new java.util.Scanner(System.in);

  System.out.println("enter  aphabet");
  String inputStr=  scan.next();
  char ch = inputStr.charAt(0);
  
  
switch(ch){
case 'a': 
case 'e': 
case 'i': 
case 'o': 
case 'u': 
	System.out.println("vowel");
break;	
default :
  System.out.println("NOT Vowel");tem.out.println("NOT Vowel");
  break;

}
 
}

}