public class X {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	
	public X(int a){
		this.a = a;
		System.out.println(this + "created with 1 args");
	}
	
	public X(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println(this + " creades with 2 args");
	}
	
	public X(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		System.out.println(this + "creaed with 4 args");
	}
	public X(int a,int b,int c,int d,int e,int f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
		System.out.println(this + "created with 6 args");
	}
	
	void show(){
		String msg =this + " [a=" + a + ",b=" + b + ",c=" + c +",d="+ d
											+ ",e=" + e + ",f=" + f +"]";
		System.out.println(msg);
	}
	
	
}//end class