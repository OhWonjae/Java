package ch06.exam05;

public class Korean {
	
	// 변수와 필드의 차이 - 필드는 변수와 다르게 선언 위치가 상관이 없음
	//Field
	String nation = "한국";
	String name;
	String ssn;
	
	//Constructor
	Korean(String name, String ssn){
		this.name = name;
		this.ssn=ssn;
	}
}
