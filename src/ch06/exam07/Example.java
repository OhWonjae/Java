package ch06.exam07;

public class Example {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("力格1", "力格1");

		bs.save("力格2", "力格2");
		
		int[] arr = {1,2,3};
		int sum = bs.getSum(arr);
		System.out.println(sum);
		sum = bs.getSum(new int[] {1,2,3});
		System.out.println(sum);
	}

}
