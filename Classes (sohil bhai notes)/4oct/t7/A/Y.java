
public class Y extends X {
	int l,m,n;
	
	public Y(){
		super();
		System.out.println(this + " 0 args y constructor called ");
	}
	public Y(int a, int b, int l) {
		super(a,b);
		this.l=l;
		System.out.println(this + " 3 args y constructor called ");
	}
	public Y(int a, int b, int c, int l){
		super(a,b,c);
		this.l=l;
		System.out.println(this + "4 arg y constructor called ");
	}
	
	
	public Y(int a, int b ,int c, int l,int m){
		super(a,b,c);
		this.l=l;
		this.m=m;
		System.out.println(this + "5 arg y constructor called ");
	}
	public Y(int a, int b, int c, int l,int m, int n){
		super(a,b,c);
		this.l=l;
		this.m=m;
		this.n=n;
		System.out.println(this + "6 arg y constructor called ");
	}
	
	//override
	void show(){
		System.out.println("______------------------______");
		System.out.println(this + " info Y ");
		System.out.printf("a=%d b=%d c=%d l=%d m=%d n=%d\n",a,b,c,l,m,n);
		System.out.println("_______________*******_______________");
	}
	
}//end class