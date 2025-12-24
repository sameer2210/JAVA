
public class SisDate {
	private transient long fastTime;
	
		public SisDate(){
			this(System.currentTimeMillis());
		}
		
		public SisDate(long date){
			fastTime = date;
		}
		
		
}//end class