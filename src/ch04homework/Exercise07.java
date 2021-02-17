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

			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");

			System.out.println("-----------");

			System.out.println("선택> ");
			
			String s = scanner.nextLine();
			int num = Integer.parseInt(s);
			int budget=0;
			switch(num)
			{
			case 1:
				System.out.print("예금액");
				s = scanner.nextLine();
				budget = Integer.parseInt(s);
				break;

			case 2:
				System.out.print("출금액");
				s = scanner.nextLine();
				budget = Integer.parseInt(s);
				break;

			case 3:
				System.out.print("잔고");
				s = scanner.nextLine();
				budget = Integer.parseInt(s);
				break;

			case 4:
				System.out.print("프로그램 종료");
				return;
			}
		}
	}

}
