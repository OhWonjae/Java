package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		//��ü ����
		list.add("ȫ�浿");
		list.add(3);
		list.add(new Board());
		System.out.println(list.size());
		Integer t1 = new Integer(3);
		list.remove(t1);
		
		//��ü ���
		String name = (String)list.get(0);
		System.out.println(list.size());
		
	//	Integer t1 = new Integer(3);
		int i = 3;
		Integer t2 = new Integer(3);
		System.out.println(t2==i);
	}

}
