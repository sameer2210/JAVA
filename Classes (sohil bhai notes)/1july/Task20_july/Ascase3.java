public class Ascase3{
	public static void main(String args[]){
	
	char ch='A';
	for(int row=1;row<=7;row++){
	     for(int col=1;col<=4;col++){
		System.out.print(ch++);
		}
	System.out.print("\n");
	}

System.out.println("______________________________________________");
	
	for(int row=1;row<=7;row++){
	 for(int col=1;col<=4;col++){
		System.out.print(ch++);
		if(ch<='Z'){
		System.out.printf("%4s",ch++);
		}else{
		System.out.printf("%4s"," ");
		}
		}
	System.out.print("\n");
	}
	
}
}