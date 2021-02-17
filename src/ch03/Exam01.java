package ch03;

public class Exam01 {

	public static void main(String[] args) {
		//산술연산의 다양한 형태
		
		int var1 = 1;
		var1 +=1;
		var1++;
		
		int var2 = 10;
		var2 = var2 - 1;
		var2-=1;
		var2--;
		int var3 = 16;
		var3 = var3/2;
		
		//자바는 정수 나눗셈의 결과는 정수입니다
		//실수 나눗셈은 실수나옴
		int var4 = 11;
		double var5  = 4;
		double var6 = var4 / var5;
		System.out.println(var6);
		
		//나머지구하기
		float var10 = 1.2f;
		float var11  = 0.5f;
		float var9 = var10 % var11;
		System.out.println(var9);
	}

}
