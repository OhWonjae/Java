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
				String data1 = "안녕하세요";
				String data2 = "이제 마쳐요";
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
