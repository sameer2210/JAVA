/*
@Author:lee jon  Dell 
 */
 public class DellPrinterDriver implements  SisPrinter{ 
@Override
  public void connect(){
    System.out.println("DellPrinterDriver   connecting....+++++");
  }
  @Override
  public   void disConnect(){
    System.out.println("DellPrinterDriver  dis  connecting....++++");
	}
	
  
  @Override
  public  void print(String data){
  System.out.println("DellPrinter Printing....");
  System.out.println("++++++++++++++++++++++++");
  System.out.println(data);
  System.out.println("++++++++++++++++++++++++");
  }


  
 }//End of class 
