package ch08.exam04;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		//Ÿ�̾� ����
		mycar.t1 = new KumhoTire();
		mycar.t2 = new KumhoTire();
		mycar.t3 = new HankookTire();
		mycar.t4 = new HankookTire();
		if(mycar.t3 instanceof KumhoTire) {
			System.out.println("asdf");
		}
		
		//�޸���
		mycar.run();
		
	}

}
