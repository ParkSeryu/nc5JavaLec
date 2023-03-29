package chap07_inherit.car;

public class KiaCarInherit extends Car {
	
	public void speedUp() {
		System.out.println("엑셀을 밟는다.");
	}
	
	public void speedDown() {
		System.out.println("브레이크를 밟는다.");
	}
}
