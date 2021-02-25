package ch07.exam10;

public class Example {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = 5;
		parent.Method1();
		parent.Method2();
		Child c = (Child)parent;
		c.Method3();
		c.field2 = 5;
	}

}
