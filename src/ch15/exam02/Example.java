package ch15.exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new LinkedList<>();
		//按眉 历厘
		list.add(new Board(1,"力格1"));
		list.add(new Board(2,"力格2"));
		list.add(new Board(3,"力格3"));
		System.out.println(list.size());
		Integer t1 = new Integer(3);
		list.remove(t1);
		
		//按眉 掘扁
		Board board1 = list.get(0);
		System.out.println(board1.getBno() +board1.getTitle() );
		System.out.println(list.size());
		
		//馆汗贸府
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
