package ch08.exam02;

public class Audio implements RemoteControl{

	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("Audio의 볼륨을"+volume+"로 조절합니다.");
		if(volume<RemoteControl.MIN_VOLUME)this.volume = RemoteControl.MIN_VOLUME;

		if(volume>RemoteControl.MAX_VOLUME)this.volume = RemoteControl.MAX_VOLUME;
		this.volume = volume;
		 
	}
	
}
