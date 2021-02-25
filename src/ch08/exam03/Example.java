package ch08.exam03;

public class Example {
	public static void use1(Shipable shipable) {
		shipable.sailing();
		shipable.anchor();
	}
	public static void use2(Flyable flyable) {
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}
	public static void main(String[] args)
	{
		Car mycar = new Car();
		use1(mycar); //shipable 인터페이스로 mycar를 사용하겠다
		use2(mycar);//flyable 인터페이스로 mycar를 사용하겠다

	}

}
