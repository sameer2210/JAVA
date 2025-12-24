
//Author  Surendra Kumar 

public class SisApp {
	public static void main(String[] args) throws Exception{
		if(args.length<1){
			System.out.println("requied Greet Class");
			System.exit(0);
		}
		
    String className = args[0];
    Class c = Class.forName(className);
    Object obj = c.newInstance();
    
	if(obj instanceof SisGreet){
		 SisGreet greet  = (SisGreet) obj;
		 greet.showMessage();
	}else{
		System.out.println("class Must be SisGreet Type");
	}	
		
		
		
	}
}
