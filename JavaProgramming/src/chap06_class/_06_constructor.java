package chap06_class;

import chap06_class.car.Car;

public class _06_constructor {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("현대");
		Car car3 = new Car("현대", "제네시스");
		Car car4 = new Car("현대", "아반떼", "검정");
		Car car5 = new Car("기아", "k9", "파란색", 4000);
	}
}
