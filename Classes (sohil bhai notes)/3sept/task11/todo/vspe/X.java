/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  12/09/2020
 public class X{
         int a;
static int b;
void m1(){     
  System.out.println(this + "m1 method object");
}
void m2(){     
  System.out.println(this +"m2 method object");
}
void m3(){     
  System.out.println(this +"m3 method object");
  System.out.println(a);//ok
  System.out.println(b);//ok
  m2();//yes ok
  ms1();//ok yes
  
}

static  void ms1(){  
//CTE System.out.println(this);
//error: non-static variable this cannot be referenced from a static context

System.out.println("static method sm1() ");
}

static void ms2(){  
//System.out.println(this);
//error: non-static variable this cannot be referenced from a static context
System.out.println("static method sm2() ");
}


static void ms3(){  
//System.out.println(this);
//error: non-static variable this cannot be referenced from a static context
System.out.println("static method sm3() ");
//CTE System.out.println(a);
// non-static(object) variable a cannot be referenced from a static context /class leve
System.out.println(b);//OK
//CTE m1();
//non-static(object) method m1() cannot be referenced from a static context  // static method 
ms1();//ok
}

}//classs
