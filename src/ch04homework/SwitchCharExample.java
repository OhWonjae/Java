package ch04homework;

public class SwitchCharExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		
		switch(time)
		{
		case 8:
			System.out.println("출근");
			

		case 9:
			System.out.println("회의");
			

		case 10:
				System.out.println("업무");
			
		default:
			System.out.println("외근");
		

		}
	}

}
