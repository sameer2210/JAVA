public class CaseDemo2{

public static void main(String args[]){

java.util.Scanner scan = new java.util.Scanner(System.in);

  System.out.println("enter your color for details");
  String inputColor=  scan.next();
switch(inputColor){
case "green": 
	System.out.println("nature");
break;

case "red" :
	System.out.println("danger");

case "white" :
	System.out.println("peace");

case "yellow" :
	System.out.println("focus");
break;

default :
  System.out.println("color not matched");
  break;

}
 
}

}