package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String filePath1 = "D:\\java-master\\Java\\src\\ch18\\exam19\\data.db";
		OutputStream os = new FileOutputStream(filePath1);
				String data1 = "�ȳ��ϼ���";
				String data2 = "���� ���Ŀ�";
				/*	
				os.write(data1.getBytes());
				os.write("\n".getBytes());
				os.write(data2.getBytes());
				os.flush();
				
				os.close();*/
		
		PrintWriter out = new PrintWriter(os);
		out.println(3);
		out.println(10.5);
		out.flush();
		out.close();
	}

}
