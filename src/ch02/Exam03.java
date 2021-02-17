package ch02;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 타입 이하의 피연산자 연산은 결과가 int
		short var1 = 10;
		int var2 = 20;
		int var3 = var1 + var2;
		
		//int 타입보다 큰 타입이 연산이 되면 큰타입이 결과가됨
		long var4 = 10;
		long var5 = 20;
		long var6 = var4 + var5;
		
		int var7 = 10;
		float var8 = 1.5f;
		float var9 = var7+var8;
		
	}

}
