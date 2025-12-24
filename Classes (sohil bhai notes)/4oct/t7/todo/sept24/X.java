
public class X {
  int a,b,c;
 public X() {
	 System.out.println(this  +" 0 arg X constructor called");
}
  
  public X(int a, int b) {
	  this.a=a;
	  this.b=b;
	  System.out.println(this  +" 2 arg X constructor called");
  }
  
  public X(int a, int b,int c) {
	  this.a=a;
	  this.b=b;
	  this.c=c;
	  System.out.println(this  +" 3 arg X constructor called");
  }

void show(){
	  System.out.println("_______________________");
	  System.out.println(this  +" info X");
	  System.out.printf("a=%d b=%d c=%d\n",a,b,c);
	  System.out.println("_______________________");
  }
  
}
