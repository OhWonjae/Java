package ch04homework;

import java.io.IOException;

public class WhileKeyControllerExample {

	public static void main(String[] args) {
		boolean run = true;
		int speed=0;
		int keycode =0 ;
		while(run)
		{
			if(keycode!=13 && keycode!=10)
			{
				System.out.println("-----------------");

				System.out.println("1.���� | 2.���� | 3.����");

				System.out.println("-----------------");

				System.out.println("����");
			}
			try {
				keycode = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(keycode==49)
			{
				speed++;
				System.out.println("����ӵ�" + speed);
			}else if(keycode==50)
			{
				speed--;
				System.out.println("����ӵ�" + speed);
			}else if(keycode==51)
			{
				run = false;
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
