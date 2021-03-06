package ch08.exam03;

public class Car implements Shipable, Flyable{

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("take off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("land");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}

	@Override
	public void sailing() {
		// TODO Auto-generated method stub
		System.out.println("sail");
	}

	@Override
	public void anchor() {
		// TODO Auto-generated method stub
		System.out.println("anchor");
	}

}
