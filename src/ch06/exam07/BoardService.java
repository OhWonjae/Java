package ch06.exam07;

public class BoardService {
	//Field
	int count;
	
	
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}
	void save(String title, String content)
	{
		int bno = getNewBno();
		System.out.println(bno);
		System.out.println(title + "�� �����մϴ�");

		System.out.println(content + "�� �����մϴ�");
	}
	
	int getSum(int[] values)
	{
		int result =0;
		for(int value: values)
		{
			result += value;
		}
		return result;
	}
	int getSum(int x, int y)
	{
		return x+y;
	}
}
