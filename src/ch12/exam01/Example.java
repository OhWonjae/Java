package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new Thread(new NetworkTask());
		thread1.start();
		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//채팅 작업을 하는 스레드 생성과 실행
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				{
				// TODO Auto-generated method stub
				System.out.println("채팅 작업을 합니다");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		});
		thread3.start();
		while(true)
		{
			System.out.println("메인 작업을 합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
