package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;

public class _02_withoutPolymorphism {
	public static void main(String[] args) {
		LgTv lgtv = new LgTv();
		SamsungTv stv = new SamsungTv();
		
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		lgtv.powerOn();				
		
		stv.powerOn();
		stv.operate(13);
		stv.powerOff();
		stv.powerOn();
	}
}
