package ch02;

public class Exam04 {
	public static void main(String[] args)
	{
		//���ڿ� => ����(����,�Ǽ�)_
		
		//���ڿ��� String Ÿ�� ������ ����
		String var1 = "10";
		System.out.println(var1);
		
		// ���ڿ��� ���ڰ� +�Ǹ� ���ڿ� ����
		String var3 = ""+3 +5;
		System.out.println(var3);
		
		
		// a\���ڿ��� ���ڷ� �����ؼ� ����
		int var=Integer.parseInt(var1)+5;
		
		// ���ڿ��� �Ǽ��� �����ؼ� ����
		String var4 = "0.1";
		float var5 = Float.parseFloat(var4);
		System.out.println(var5);
		//���� =? ���ڿ���
		int var6 = 10;
		String var7 = "3";
		String var8 = String.valueOf(3) + var7;
		System.out.println(var8);
	}
}
