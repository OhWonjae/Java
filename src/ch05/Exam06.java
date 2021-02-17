package ch05;

public class Exam06 {
	public static void main(String[] args) {
	String[] arr1 = new String[3];
	for(int i=0; i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	arr1[0] = "oh";
	arr1[1] = "oh";
	arr1[2] = "oh";
	for(int i=0; i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	System.out.println(arr1[0].equals(arr1[1]));

	System.out.println(!arr1[0].equals(arr1[1]));
	}
}
