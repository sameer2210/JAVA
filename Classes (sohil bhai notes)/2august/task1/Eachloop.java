public class Eachloop {  
	public static void main(String[] args) {  

	
	//declaring an array
	int arr[] = {12,23,44,56,67,89};
	for(int i:arr){
		System.out.println(i);
	}
System.out.println("____________________________________________");
	
//Labeled name loop
	aa:
	for(int i = 1;i<=3;i++){
	bb:
	for(int j=1;j<=3;j++){
	 if(i==2&&j==2){
	//  break bb;
	   break aa;
	 }
	System.out.println(i+ " "+j);
	}
	}	
System.out.println("____________________________________________");

	String cars [] ={"volvo","bmw","ford","mazda"};
	for(Strng i : cars){
		System.out.println(i);
	}
	
}
}
