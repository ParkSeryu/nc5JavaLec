package chap11_interface.product;

public interface ElectronicDevice {
	void powerOn();

	void powerOff();

	default void reset() {
		System.out.println("장치를 리셋합니다.");
	}

	void resetTest();

	 static void warn() {
		System.out.println("알람을 울리다.");
	}
}
