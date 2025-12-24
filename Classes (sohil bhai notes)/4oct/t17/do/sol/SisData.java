public class SisData {

	private transient long fastTime;
	
	public SisDate() {
	this(System.currentTimeMillis());
	}
	
		public SisDate(long date) {
			fastTime = date;
		}
		
}//end class