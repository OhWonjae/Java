package ch15.exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new LinkedList<>();
		//��ü ����
		list.add(new Board(1,"����1"));
		list.add(new Board(2,"����2"));
		list.add(new Board(3,"����3"));
		System.out.println(list.size());
		Integer t1 = new Integer(3);
		list.remove(t1);
		
		//��ü ���
		Board board1 = list.get(0);
		System.out.println(board1.getBno() +board1.getTitle() );
		System.out.println(list.size());
		
		//�ݺ�ó��
		for(int i=0; i<list.size(); i++)
		{
			Board board = list.get(i);
			System.out.println(board.getBno() +board.getTitle() );	
		}
		for(Board board:list)
		{
			System.out.println(board.getBno() +board.getTitle() );	
					
		}
		
	//	Integer t1 = new Integer(3);
		int i = 3;
		Integer t2 = new Integer(3);
		System.out.println(t2==i);
	}

}
