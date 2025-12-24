
public class Parent {
  void eat(){System.out.println(this + " eat from Parent");}
  void sleep(){System.out.println(this + " sleep from Parent");}
  void speak(){System.out.println(this + " speak from Parent");}
  final void greet(){System.out.println(this + " greet from Parent");}
  
  static void specialAction(){
	  System.out.println("special method from Parent******");
  }
  static void verSpecialAction(){
	  System.out.println("verSpecialAction method from Parent******");
  }
  
  
}
