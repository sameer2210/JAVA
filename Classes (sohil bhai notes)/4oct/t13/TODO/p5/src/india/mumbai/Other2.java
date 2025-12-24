package india.mumbai;

public class Other2{
 void m1(){
   india.raipur.Parent p = new india.raipur.Parent();
   System.out.println(p.a);//OK public 
   System.out.println(p.b);//CTE private 
   System.out.println(p.c);//CTE  protected as private  in other location for non child
   System.out.println(p.d);//CTE default as private in other location 
 }