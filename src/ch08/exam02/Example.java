package ch08.exam02;

public class Example {
	public static void method(RemoteControl rc) {
		//�������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl rc = new Audio(); // �������� ��ü�� RemoteControl�������̽��� ����ϰڴ�!
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(0);
		
		method(new Television());
		method(new Audio());
	}

}
