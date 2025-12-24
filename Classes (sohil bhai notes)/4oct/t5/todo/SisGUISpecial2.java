
import javax.swing.*;
public class SisGUISpecial2 {

	public static void main(String[] args) {
  
   String name  = JOptionPane.showInputDialog("Enter your name");		
 // System.out.println("enter name is " + name);
  
  String num1Str = JOptionPane.showInputDialog("Enter 1st num");
  String num2Str = JOptionPane.showInputDialog("Enter 2nd num");
  
  int a = Integer.parseInt(num1Str);
  int b = Integer.parseInt(num2Str);
  int sum = a+b;
  String info ="hello "+name +" : "+ a +" + " + b +" = " +sum;
//System.out.println(info);

JOptionPane.showMessageDialog(null, info);
  
  System.out.println(a +" + " + b +" = " +sum);
  
  
  
  
  

	}

}
