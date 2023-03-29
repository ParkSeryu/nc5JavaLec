package chap11_interface.product;

public class LgTv implements TV {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTv를 켭니다.");
	}	

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTv를 끕니다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을" + channel + "로 변경합니다.");
	}
	
	public void test() {
		System.out.println("test");
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		System.out.println("재정의한 reset메소드");
	}

	@Override
	public void resetTest() {
		// TODO Auto-generated method stub
		
	}

}
