package chap09_polymorphism;

import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymorphism {
	public static void main(String[] args) {
		Tv tv = new SamsungTv();
		tv.powerOn();
		tv.operate(13);
		tv.powerOff();
		tv.powerOn();
	}
}
