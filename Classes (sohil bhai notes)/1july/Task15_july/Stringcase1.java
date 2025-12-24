public class Stringcase1 {
	public static void main(String args[]){

	String str="SIS JAVA NIT";
	System.out.println(str);
	System.out.println(str.endsWith("NIT"));	//t
	System.out.println(str.endsWith("SIS"));	//f
	
	System.out.println(str.startsWith("NIT"));	//f
	System.out.println(str.startsWith("SIS"));	//t

System.out.println("_____________________________________________");
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("enter file name for check type");	
	String fileName =scan.nextLine();
	
	if(fileName.endsWith(".java")){
	System.out.println("file is java type");
	}else if (fileName.endsWith(".class")){
	System.out.println("file is byte code");

	}else if(fileName.endsWith(".c")){
	System.out.println("file is c");
	}else if(fileName.endsWith(".cpp")){
	System.out.println("file is c plus plus");
	}else if(fileName.endsWith(".php")){
	System.out.println("file is php");
	}else{
		System.out.println("other type");
	}

}
}
//__________________________________________________________________