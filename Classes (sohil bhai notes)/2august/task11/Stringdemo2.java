public class Stringdemo2 {
	public static void main(String args[]){
	
	String str=new String ("");
	System.out.println("str = "+str);
	for (int a= 1; a<= 10; a++){
		if(a<10){
			str = str+a+",";
		}else{
			str = str+a;
		}
	}
	System.out.println("str = "+str);
	
}
}