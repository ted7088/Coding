package test;

public class test7 {

	public static void main(String[] args) {
		Child33 c = new Child33("Soojebi");
	}
}

class Parent33 {
	String name = "Parent";

	public Parent33() {
		System.out.println(this.name);
	}
}

class Child33 extends Parent33 {
	public Child33(String name) {
		System.out.println("name: "+name);
		System.out.println("this.name:"+this.name);
	}
}
