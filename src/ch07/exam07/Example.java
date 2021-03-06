package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();
		child.Method1();
		child.Method2();
		child.Method3();
		
		Parent parent = child;
		parent.Method1();
		parent.Method2();
		//parent.Method3();
	}

}
