package ch06.exam06;

public class Korean {
	
	// ������ �ʵ��� ���� - �ʵ�� ������ �ٸ��� ���� ��ġ�� ����� ����
	//Field
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	//Constructor Overloading
	Korean()
	{
		this("�ƹ���",1,"054544");
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
