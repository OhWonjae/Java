package ch06.exam02;

public class Example {

	public static void main(String[] args) {

		//��ü ����
		Car myCar = new  Car();

		//�ʵ尪 �б�
		System.out.println(myCar.company); 
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old); 
		System.out.println(myCar.speed); 
		
		//�ʵ尪 ����
		myCar.company = "�����ڵ���";
		myCar.model = "�׷���";
		myCar.price = 30000000;
		myCar.speed = 60;
		//�ʵ尪 �б�
		System.out.println(myCar.company); 
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old); 
		System.out.println(myCar.speed); 
		
		//
	}

}
