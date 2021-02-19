package ch06.exam02;

public class Example {

	public static void main(String[] args) {

		//객체 생성
		Car myCar = new  Car();

		//필드값 읽기
		System.out.println(myCar.company); 
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old); 
		System.out.println(myCar.speed); 
		
		//필드값 변경
		myCar.company = "현대자동차";
		myCar.model = "그랜저";
		myCar.price = 30000000;
		myCar.speed = 60;
		//필드값 읽기
		System.out.println(myCar.company); 
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old); 
		System.out.println(myCar.speed); 
		
		//
	}

}
