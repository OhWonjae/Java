package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		while(run)
		{
			System.out.println("-----------");

			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");

			System.out.println("-----------");

			System.out.println("����> ");
			
			String s = scanner.nextLine();
			int num = Integer.parseInt(s);
			int budget=0;
			switch(num)
			{
			case 1:
				System.out.print("���ݾ�");
				s = scanner.nextLine();
				budget = Integer.parseInt(s);
				break;

			case 2:
				System.out.print("��ݾ�");
				s = scanner.nextLine();
				budget = Integer.parseInt(s);
				break;

			case 3:
				System.out.print("�ܰ�");
				s = scanner.nextLine();
				budget = Integer.parseInt(s);
				break;

			case 4:
				System.out.print("���α׷� ����");
				return;
			}
		}
	}

}
