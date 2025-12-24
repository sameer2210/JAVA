public class UpdateUtil{
	
	void swap(int a, int b){
	System.out.println("before swap a= " +a +" b= " +b);
		int t =a;
		a=b;
		b=t;
		System.out.println("after swap a = " +a + " b =" +b);
	}
		
	void swap2(BoxType1 box){
	System.out.println("swap2() box =" + box);
	System.out.println("before swap a= " + box.a +" b=" + box.b);
		int t =box.a;
		box.a=box.b;
		box.b=t;
		System.out.println("after swap a = " + box.a +" b =" + box.b);
	}
	
	void increaseValue(int a){
		System.out.println("before increase value ="+a);
		a++;
		System.out.println("after increase value = "+a);
	 }
	
	void increaseValue2(Dabba d1){
		System.out.println("before incease value ="+d1.a);
		d1.a++;
		System.out.println("after increase value = "+d1.a);
	}
	
	
	}//end class