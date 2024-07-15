package test;


class Z{
	Z(){
		System.out.println("안녕! 나는 class Z의 기본 실행되는 생성자야");
	}
	public void Z(int a){
		System.out.println("난 실행이 안됨");
	}
}

class A extends Z{
	A(){
//		System.out.printf("%d ",10);
////		System.out.println("안녕! 나는 class A의 기본 실행되는 생성자야");
	}
}
class B  extends A{
	B(int a){
//		System.out.println("명시");
	}
	B(){
//		System.out.println("기본");
	}
}
class C1 extends B{
	C1(int a){
		super (10);
//		System.out.println("나 1빠");
//		System.out.printf("%d ", a);
	}
}


public class test9 {
	public static void main(String[] args) {
//		B b = new C1(1000);
		
		Z c = new C1(1000);
		c.Z(100);
		
//		B b = new C1(1000);
//		C1 b = new C1(1000);
	}
}
