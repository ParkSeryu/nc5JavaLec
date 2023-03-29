package homework.h_0321.car;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도를 높입니다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 낮춥니다.");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("기름을 넣습니다.");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("전기를 충전합니다.");
	}

}
