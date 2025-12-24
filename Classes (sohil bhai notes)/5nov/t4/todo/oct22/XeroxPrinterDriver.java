/*
@Author:aman jain Hp 
 */

 public class XeroxPrinterDriver extends SisPrinter{ 
  public void connect(){
    System.out.println("XeroxPrinterDriver   connecting...^^^^^^^^^^^");
  }
  public   void disConnect(){
    System.out.println("XeroxPrinterDriver  dis  connecting...^^^^^^^^^");
	}
	
  
  
  public  void print(String data){
  System.out.println("XeroxPrinterDriver Printing.^^^^^^^^^^^^^^^.");
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  System.out.println(data);
  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }


  
 }//End of class 
