package chap11_interface;

import chap11_interface.buildings.Building;
import chap11_interface.buildings.HighBuilding;

public class _01_interface {

	public static void main(String[] args) {
		// 인터페이스는 인스턴스화가 불가능하기 때문에
		// 상속받은 자식클래스를 인스턴스화 해서 사용한다.
		Building bd = new HighBuilding();
		// Building bd = new Building();
		bd.build();
		bd.turnOnAircon();
		System.out.println(bd.getParkingPrice(1000));
	}
}
