package test;

public class test8 {
	public static void main(String[] args) {
		Parent2 pa = new Child2(5);
	}
}
class Parent2{
	int a=0;
	Parent2(){
		a++;
		System.out.print(a);
	}
}

class Child2 extends Parent2{
	int b=0;
	Child2(int a){
//		System.out.println("this.a : "+this.a);
//		System.out.println("a : "+a);
		this.b=a;
		System.out.print(++a);
	}
}
