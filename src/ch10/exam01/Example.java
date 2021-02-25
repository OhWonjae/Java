package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = null;
		// 실행예외(컴파일러가 체크하지 않음)
		arr[0] = 10; 
		
		
		// 일반예외(컴파일 체크예외)
		//FileInputStream fi = new FileInputStream("C:/Temp/file.txt");

	}

}
