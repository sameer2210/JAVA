public class X{
	int a;
	int b;
	int c;
	void show(){
	 System.out.println("________________________\n");
	 System.out.printf("a=%3d b=%3d c=%3d \n",a,b,c);
	 System.out.println("__________________________");
	}
	
	void update1(int x,int y,int z){
	 System.out.println("update way1 called x,y,x "+x+","+y+","+z);
		a=x;
		b=y;
		c=z;
	}
	
	void update2(int x, int y, int c){
	 System.out.println("update way2 called x,y,c "+x+","+y+","+c);
		a=x;
		b=y;
		c=c;
	}
	
	void update3(int a, int b, int c){
	 System.out.println("update way3 called a,b,c " +a+ "," +b+ "," +c);
		a=a;
		b=b;
		c=c;
	}
	
	//corporate standard
	void update4(int a, int b, int c){
	  System.out.println("update way4 called a,b,c "+ a +","+ b +","+ c);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
}//end class
	