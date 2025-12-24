package india.raipur;

public class Other1{
 void m1(){
 Parent p = new Parent();
   System.out.println(p.a);//OK
   System.out.println(p.b);//CTE
   System.out.println(p.c);//Ok protected as public in same location for non child
   System.out.println(p.d);//OK default as public 
 }


}//end