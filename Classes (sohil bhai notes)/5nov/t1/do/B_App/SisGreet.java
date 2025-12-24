import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class SisGreet {
	final protected String getUserName(){
		return System.getenv("username");
	}
	protected String getFormatedDate(){
		Date now = new Date();
		String strDate = new SimpleDateFormat("dd-MM-yyyy").format(now);
		return strDate;
	}
	
		public abstract void showMessage();
	
}//end class