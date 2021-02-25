package ch06.exam08;

import java.util.Arrays;

public class BoardService {
	//Field
	String[][] boards;
	
	int count;
	//Constructor
	BoardService(int rows, int columns){
		boards = new String[rows][columns];
	}
	
	int getNewBno()
	{
		return ++count;
	}
	
	//Method
	void create(String title, String content, String writer, int hitcount) {
		String[] board= {
				""+getNewBno(),
				title,
				content,
				writer,
				String.valueOf(hitcount)
		};
		for(int i=0; i<boards.length; i++)
		{
			if(boards[i][0]==null)
			{
				boards[i] = board;
				break;
			}
		}
	}
	
	void showList(){
		for(int i=0; i< boards.length; i++)
		{
			for(int j=0; j< boards[i].length; j++)
			{
				System.out.print(boards[i][j]);
			}
			System.out.println();
		}
		
	}
	String[] read(int bno){
		String[] result = null;
		String strBno = String.valueOf(bno);
		for(int i=0; i< boards.length; i++)
		{
			if(boards[i][0]!=null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		
		}
		return result;
	}
	
}
