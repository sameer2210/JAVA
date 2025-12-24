public class Output2 {
	public static void main(String args[]){
	
	System.out.println("start");
	int counter =0;
	 for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			for(int k=1;k<=5;k++){
		System.out.println("teeth "+ ++counter);
		
		if(i==2&&j==2&& k==2){
			break;
		  }
		} 
		if(i==2 & j==2)break;
	}
	  if(i==2){ break;}
		}
	System.out.println("end   ");
	
}
}