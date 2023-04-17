package kr.ac.kopo.day15.inter;

public class SamsungTV implements TV {

	public SamsungTV() {
		System.out.println("삼성TV 구매완료...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("TV 전원 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원 OFF");

	}

	@Override
	public void channelUp() {
		System.out.println("CHANNEL UP...");
	}

	@Override
	public void channelDown() {
		System.out.println("CHANNEL DOWN...");
	}

	@Override
	public void volumeUp() {
		System.out.println("VOLUME UP...");
	}

	@Override
	public void volumeDown() {
		System.out.println("VOLUME DOWN...");

	}

	@Override
	public void mute() {
		System.out.println("MUTE...");
	}

}
