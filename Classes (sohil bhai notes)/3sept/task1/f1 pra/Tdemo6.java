public class Tdemo6{
	public static void main(String args[]){
	
	Television t1 = new Television();
	t1.brandName="sony";
	t1.modelNumber="lala420";
	t1.price=987654;
	t1.type="LED";
	t1.size="81inc\"";
	
		t1.on();
		t1.showDetails();
		t1.jumpChannel(1567);
		t1.jumpChannel(235);
		t1.jumpChannel(-17);
		t1.jumpChannel(996);
		t1.jumpChannel(197);
		
			
	}//end main
}//end class