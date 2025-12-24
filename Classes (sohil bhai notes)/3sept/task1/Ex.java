public class Ex {
	void m1(){	
		System.out.println("m1 called");
	}
	
	void m2(int a){
		System.out.println("m2 called with arg "+ a);
	}
	int m3(){
		return (int)(Math.random()*1000);
	}
	int m4(int a, int b){
	return a+b;
	}
}