package ch04;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// 키보드로 입력한 내용을 받기 위해 Scanner생성
		Scanner scanner = new Scanner(System.in);
		
		// 키보드에서 입력한 내용을 data변수에 저장
		String data = scanner.nextLine();
		
		//data변수의 값 출력
		System.out.println(data);
	}

}
