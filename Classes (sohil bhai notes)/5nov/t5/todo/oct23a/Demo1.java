
public class Demo1 {

	public static void main(String[] args) {

   Person p1= new Person();
   Person p2= new PersonType1();
   Person p3= new PersonType2();
   Person p4= new PersonType3();
   Person p5= new PersonType4();
   Person p6= new PersonType5();
   Person p7= new PersonType6();
   Person list[] ={p1,p2,p3,p4,p5,p6,p7};
   
   for(Person temp : list){
	   System.out.println(temp);
	   temp.eat();
	   temp.sleep();
	   
	   if(temp instanceof Listener){
		   System.out.println(temp +" can hear");
		   //temp.hear();CTE
		   ((Listener) temp).hear();
	   }
	   
	   if(temp instanceof Seeable){
		   System.out.println(temp +" can see");
		   Seeable s = (Seeable) temp;
		   s.see();
	   }
	   
	   if(temp instanceof Runner){
		   System.out.println(temp +" can run");
		   ((Runner) temp).run();
	   }
	   if(temp instanceof Speaker){
		   System.out.println(temp +" can speak");
		   ((Speaker) temp).speak();
	   }
	   
	   System.out.println("+++++++++++++++++");
   }
   
   
   
   
   
   
   
   
		

		
	}

}
