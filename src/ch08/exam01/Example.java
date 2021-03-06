package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Audio(); // 오디오라는 객체를 RemoteControl인터페이스로 사용하겠다!
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(0);
		
	}

}
