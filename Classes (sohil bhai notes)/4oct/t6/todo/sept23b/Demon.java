
public class Demon {
   void kill(){
	   System.out.println(this +" killing any person....");
   }
   

   void killAndEat(Human human){
	   System.out.println(this +" killing given human...."+human.name);
	   
	   human.cry();
	   try{ Thread.sleep(2000); } catch(Exception e){}
	   human.cry();
	   try{ Thread.sleep(2000); } catch(Exception e){}
	   human.cry();
	   try{ Thread.sleep(3000); } catch(Exception e){}
	   System.out.println(human.name  +" killed and eatten by "+this);
	   
   }
   
   
   void eat(){
	   System.out.println(this +" eating any person....");
   }
   void run(){
	   System.out.println(this +" running....");
   }
   
}
