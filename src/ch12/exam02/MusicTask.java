package ch12.exam02;

public class MusicTask extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("음악을 연주 합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
