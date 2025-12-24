import java.text.SimpleDateFormat;
import java.util.Date;

//Author  Surendra Kumar 
public abstract class SisGreet {
   final protected String getUserName(){
    	return System.getenv("username");
    }
   protected String getFormatedDate(){
    	Date now = new Date();
    	String strDate = new SimpleDateFormat("dd-MMM-yyy").format(now);
    	return strDate;
    }
	
	public abstract void showMessage();

}
