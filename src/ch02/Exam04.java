package ch02;

public class Exam04 {
	public static void main(String[] args)
	{
		//문자열 => 숫자(정수,실수)_
		
		//문자열은 String 타입 변수에 저장
		String var1 = "10";
		System.out.println(var1);
		
		// 문자열과 숫자가 +되면 문자열 결합
		String var3 = ""+3 +5;
		System.out.println(var3);
		
		
		// a\문자열을 숫자로 변경해서 연산
		int var=Integer.parseInt(var1)+5;
		
		// 문자열을 실수로 변경해서 연산
		String var4 = "0.1";
		float var5 = Float.parseFloat(var4);
		System.out.println(var5);
		//숫자 =? 문자열로
		int var6 = 10;
		String var7 = "3";
		String var8 = String.valueOf(3) + var7;
		System.out.println(var8);
	}
}
