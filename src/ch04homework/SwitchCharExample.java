package ch04homework;

public class SwitchCharExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		
		switch(time)
		{
		case 8:
			System.out.println("���");
			

		case 9:
			System.out.println("ȸ��");
			

		case 10:
				System.out.println("����");
			
		default:
			System.out.println("�ܱ�");
		

		}
	}

}
