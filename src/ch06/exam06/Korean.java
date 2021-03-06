package ch06.exam06;

public class Korean {
	
	// 변수와 필드의 차이 - 필드는 변수와 다르게 선언 위치가 상관이 없음
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	//Constructor Overloading
	Korean()
	{
		this("아무개",1,"054544");
	}
	Korean(String name)
	{
		this(name,1,"1234325");
	}
	Korean(String name, String ssn){
		this(name,1,ssn);
	}
	Korean(String name, int age,String ssn ){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
