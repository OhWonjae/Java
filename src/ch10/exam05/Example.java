package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			method("C:/file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void method(String filePath) throws FileNotFoundException
	{
		
			FileInputStream fis  = new FileInputStream(filePath);
		
	}

}
