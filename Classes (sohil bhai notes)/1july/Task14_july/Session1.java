public class Session1 {
	public static void main(String args[]){

	boolean isTrainerAvailable;
	boolean isStudentAvailable;
	boolean isResourcesAvailable;
	java.util.Scanner scan = new java.util.Scanner(System.in);

	//input
	System.out.println("is trainer available? true/false");
	isTrainerAvailable=scan.nextBoolean();
	
	System.out.println("is student available? true/false");
	isStudentAvailable=scan.nextBoolean();
	
	System.out.println("is resources available? true/false");
	isResourcesAvailable=scan.nextBoolean();
	
System.out.println("__________________way1_______________");
	if(isTrainerAvailable){
		if(isStudentAvailable){
			if(isResourcesAvailable){
				System.out.println("training done successfuly.");
	}
		}
			}
System.out.println("__________________way2________________");
	if (isTrainerAvailable){
		if (isStudentAvailable){
			if (isResourcesAvailable){
				System.out.println("training done successfuly.");
			}else{
			       System.out.println("training Failed.why?resources not available");
			}
		}else{
		       System.out.println("training Failed.why?student not available");
		}
	}else{
	       System.out.println("training Failed.why?trainer not available");
	}

System.out.println("____________________way3______________________");
	if(isTrainerAvailable){
		if(isStudentAvailable){
			 if(isResourcesAvailable){
				System.out.println("training done successfully.");
			}else{
			       System.out.println("training Failed.");
			}
		}else{
		       System.out.println("training Failed.");
		}
	}else{
	       System.out.println("training Failed.");
	}
	
System.out.println("____________________way4____________________");
	boolean isSuccess1=false;
	if(isTrainerAvailable){
		if(isStudentAvailable){
			if(isResourcesAvailable){
				isSuccess1=true;
			}
		}
	}
System.out.println(isSuccess1==true?"Trainer success":"training unsuccess");

System.out.println("___________________way5____________________");
	boolean isSuccess2=false;
	if(isTrainerAvailable&&isStudentAvailable&&isResourcesAvailable){
				isSuccess2=true;
	}
System.out.println(isSuccess2==true?"Trainer success":"training unsuccess");


System.out.println("_____________________way6__________________");
	if(isTrainerAvailable&&isStudentAvailable&&isResourcesAvailable){
		System.out.println("training done successfully.");
	}else{
		System.out.println("training not successfully.");
	}

}
}
