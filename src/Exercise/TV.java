package Exercise;

public class TV  implements RemoteController{
	int ch;

	@Override
	public void turn_on() {
		// TODO Auto-generated method stub
		System.out.println("turn on");
	}

	@Override
	public void turn_off() {
		// TODO Auto-generated method stub
		System.out.println("turn off");
	}

	@Override
	public void setch(int ch) {
		// TODO Auto-generated method stub
		this.ch = ch;
	}
	
}
