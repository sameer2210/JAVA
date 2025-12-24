public class Tdemo5{
	public static void main(String args[]){
	
	Television t1 = new Television();
	t1.brandName="sony";
	t1.modelNumber="fisss";
	t1.price=78666;
	t1.type="LED";
	t1.size="81inc\"";
	
	 t1.on();
	 t1.showDetails();
	 t1.channelDown();
	 t1.channelDown();
	 t1.channelDown();
	 t1.channelUp();
	 t1.channelUp();
	 t1.channelUp();
/*		for(int a=1;a<=1100;a++){
		t1.channelUp();
		}
*/	
	
	}//end mains
}//end class