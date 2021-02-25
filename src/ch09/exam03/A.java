package ch09.exam03;

public class A {
	public void method(final int x)
	{
		final int y = 2;
		class B{
			public void method()
			{
				int result = x+y;
			}
		}
	}

}
