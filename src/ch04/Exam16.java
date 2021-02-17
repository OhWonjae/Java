package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// 키보드로 입력한 내용을 받기 위해 Scanner생성
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("숫자 1: ");
			double num1 =Double.parseDouble(scanner.nextLine());

			System.out.println("숫자 2: ");
			double num2 =Double.parseDouble(scanner.nextLine());
			double result = num1+num2;
			System.out.println(result);
			
		}
		
	}

}
