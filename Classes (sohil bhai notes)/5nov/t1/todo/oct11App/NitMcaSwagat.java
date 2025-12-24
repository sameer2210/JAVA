import javax.swing.JFrame;
import javax.swing.JOptionPane;

 //NIT Student Soumya
 public class NitMcaSwagat extends SisGreet{ 
    
	public  void showMessage(){
	  String msg  = "welcome user "+ getUserName()+"\n";
	  msg  = msg+" today date is "+getFormatedDate();
	
	  JFrame frame  = new JFrame();
	  frame.setTitle("NIT-SIS");
	  frame.setSize(800, 800);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
	  JOptionPane.showMessageDialog(frame, msg);
	  
	  }
	
 }//End of class 
