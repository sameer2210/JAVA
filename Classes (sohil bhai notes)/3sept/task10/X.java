public class X{
	X(){
		System.out.println(" 0 arg constructor called");
	}
	
	X(int a,int b,int c){
		this();
		System.out.println(a+"  "+b+" " +c + "       3 arg constructor called");
	}
	
	X(int x,int y,int z,int l,int m){
		this(x,y,z);
		System.out.println(x + " " +y+ " " +z+ " "+l+ " " + m + "             5 arg constructor called ");
	}
	
  
}//end class