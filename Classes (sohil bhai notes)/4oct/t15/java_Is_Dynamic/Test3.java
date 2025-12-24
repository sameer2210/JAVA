/*
 java Test2  java.util.Random
 java Test2  java.util.Date
 java Test2  YourClassName
 */
 public class Test3 {

	public static void main(String args[]) throws Exception{
	 if(args.length<1){
		System.out.println("required class name to start app");
		System.exit(0);
	 }
	 
	String className=args[0];//get class name from command line
	 Class c  =Class.forName(className);//load class/BluePrint
	 System.out.println("Class Loaded...");
	 Object obj  = c.newInstance();//create object
	 System.out.println("Object created......");
	 
	 System.out.println("obj  = " + obj);//show ref 
	 
	 
	}//end main

}//end class