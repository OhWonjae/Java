package ch05homework;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum=0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while(run)
		{
			System.out.println("-----------");

			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");

			System.out.println("-----------");

			System.out.println("����> ");
			
			String s = scanner.nextLine();
			int num = Integer.parseInt(s);
			
			switch(num)
			{
			case 1:
				System.out.print("�л���");
				s = scanner.nextLine();
				studentNum = Integer.parseInt(s);
				scores = new int[studentNum];
				break;

			case 2:
				for(int i=0; i< scores.length; i++)
				{
					System.out.print(String.format("scores[%d]>",i));
					s = scanner.nextLine();
					scores[i] = Integer.parseInt(s);
				}
				
				break;

			case 3:
				for(int i=0; i< scores.length; i++)
				{
					System.out.print(String.format("scores[%d]>",i));
					System.out.println(scores[i]);
				}
				break;

			case 4:
				int maxscore=0;
				int sum=0;
				double avgscore=0;
				for(int i=0; i< scores.length; i++)
				{
					if(maxscore<scores[i])
					{
						maxscore = scores[i];
					}
					sum+= scores[i];
				}
				avgscore = (double)sum/scores.length;
				System.out.println("�ְ�����" + maxscore);

				System.out.println("�������" + avgscore);
				break;
			case 5:
				System.out.println("����");
				return;
			}
		}
	}

}
