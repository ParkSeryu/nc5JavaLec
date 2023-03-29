package chap11_interface;

import chap11_interface.product.ElectronicDevice;
import chap11_interface.product.LgTv;
import chap11_interface.product.SamsungTv;
import chap11_interface.product.TV;

public class _03_multiInherit {

	public static void main(String[] args) {
		TV tv = new LgTv();
		tv.powerOn();
		tv.changeChannel(15);
		tv.powerOff();
		tv.reset();

		
		// static 메소드를 사용하려면
		// static 메소드가 선언된 클래스를
		// 사용해서 호출한다.
		
		ElectronicDevice.warn(); 
		// static 메소드는 클래스 원형으로만 사용 가능하다.
		
		// static 메소드는 상속받은 자식클래스에서 호출이 불가능하다. (원형으로만 사용가능)
		/* 
		 Tv.warn();
		 Display.warn();
		 */ // -> 이런거 다 안됨!
		
		tv = new SamsungTv();
		tv.powerOn();
		tv.changeChannel(19);
		tv.reset();
		tv.powerOff();

	}

}
