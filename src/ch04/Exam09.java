package ch04;

public class Exam09 {

	public static void main(String[] args) {
		boolean stop = false;
		int count = 0;
		//------------------------
		while(!stop)
		{
			System.out.println("hello");
			count++;
			if(count>10)
			{
				stop = true;
			}
		}
		
		//------------------------------
		while(count<=10)
		{
			System.out.println("hello");
			count++;
		}
	
	}

}
