/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  02/09/2020
 public class UpdateUtil{ 
			
			void swap(int a, int b){
			System.out.println("before swap a = "+ a  +" b=" + b);
			  int t =a;
			  a=b;
			  b=t;
			System.out.println("after swap a = "+ a  +" b=" + b);
			}
			
			
			void swap2(BoxType1 box){
			System.out.println("swap2() box = "+ box);
			System.out.println("before swap a = "+ box.a  +" b=" + box.b);
			  int t =box.a;
			  box.a=box.b;
			  box.b=t;
			System.out.println("after swap a = "+ box.a  +" b=" + box.b);
			}

			
			
			
			void increaseValue(int a){
			System.out.println("before increase value = "+a);
			  a++;
			System.out.println("after increase value = "+a);
			}
			
			
			void increaseValue2(Dabba d1){
			System.out.println("before increase value = "+d1.a);
			  d1.a++;
			System.out.println("after increase value = "+d1.a);
			}
			
 }//End of class 
