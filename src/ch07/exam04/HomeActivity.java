package ch07.exam04;

public class HomeActivity extends Activity{
	//Field
	//Constructor
	public HomeActivity() {
		super();
	}
	//Method
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		// 부모의 코드 실행
		super.onCreate();
		// 자식에서 추가한 코드 실행
		System.out.println("자식이 UI요소를 생성합니다.");
		System.out.println("자식이 UI요소의 이벤트를 처리합니다");
	}
}
