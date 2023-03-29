package chap11_interface.product;

public class SamsungTv implements TV{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비를 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비를 끕니다.");
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

	@Override
	public void resetTest() {
		// TODO Auto-generated method stub
		
	}

}
