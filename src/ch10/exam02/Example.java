package ch10.exam02;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			try {
				int value = Integer.parseInt(scanner.nextLine());
				System.out.println("value : " + value);
			}catch(NumberFormatException e)
			{
				e.printStackTrace();
				System.out.println("���ڸ� �����մϴ�." );
				System.out.println("����");
				return;
			} finally {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		

	}

}
