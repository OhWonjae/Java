package ch04homework;

public class IfElseExample {

	public static void main(String[] args) {
int score = 75;
		
		if(score>=90)
		{
			System.out.println("점수가 100~90");
			System.out.println("등급은 A");
		}
		else if(score>=80)
		{
			System.out.println("점수가 80~89");
			System.out.println("등급은 B");
			
		}else if(score>=80)
		{
			System.out.println("점수가 70~79");
			System.out.println("등급은 C");
			
		}
		else
		{
			System.out.println("점수가 70미만");
			System.out.println("등급은 D");
		}

	}

}
