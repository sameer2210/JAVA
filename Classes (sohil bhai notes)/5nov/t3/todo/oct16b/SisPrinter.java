
public class SisPrinter {
  public void connect(){
	  
	  System.out.println("Printer connecting.....");
	  try{ Thread.sleep(5000); } catch(Exception e){}
	  System.out.println("Printer COnnected.....");
	  
	  
  }

  public void print(String data){
	  System.out.println("printing start........");
	  try{ Thread.sleep(5000); } catch(Exception e){}
	  System.out.println("^^^^^^^^^^printed output bellow^^^^^^^^^^^^^^^^^^");
	  System.out.println(data);
	  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	  System.out.println("printing Stop........");
  }

  
  public void disConnect(){
	  System.out.println("Printer disConnecting.....");
	  try{ Thread.sleep(5000); } catch(Exception e){}
	  System.out.println("Printer disConnected.....");
  }

}
