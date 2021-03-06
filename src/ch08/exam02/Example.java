package ch08.exam02;

public class Example {
	public static void method(RemoteControl rc) {
		//인터페이스의 설명대로만 사용하는 코드
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl rc = new Audio(); // 오디오라는 객체를 RemoteControl인터페이스로 사용하겠다!
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(0);
		
		method(new Television());
		method(new Audio());
	}

}
