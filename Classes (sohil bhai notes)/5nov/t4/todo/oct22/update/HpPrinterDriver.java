/*
@Author:aman jain Hp 
 */

 public class HpPrinterDriver implements SisPrinter{ 
  public void connect(){
    System.out.println("HpPrinterDriver   connecting...@@@@@");
  }
  public   void disConnect(){
    System.out.println("HpPrinterDriver  dis  connecting...@@@@");
	}
	
  
  
  public  void print(String data){
  System.out.println("HpPrinterDriver Printing.@@@.");
  System.out.println("@@@@@@@@@@@@@@@@@");
  System.out.println(data);
  System.out.println("@@@@@@@@@@@@@@@@@");
  }


  
 }//End of class 
