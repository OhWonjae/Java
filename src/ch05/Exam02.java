package ch05;

import java.util.Arrays;

public class Exam02 {
	public static void main(String[] args) {
		int[] scores1 = {90,85,95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		int[] scores2 = null;
		scores2 =new int[] {1,2,3,4};
		//메소드 호출
		add(scores2);
	}
	public static void add(int[] arrys)
	{
		System.out.println("값" + Arrays.toString(arrys));
	}
}
