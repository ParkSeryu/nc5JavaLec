package homework.h_0320.mamal;

public class Mamal {
	public String name;
	private String type;
	private boolean ssaekki;

	Mamal() {

	}

	Mamal(String name, String type, boolean ssaekki) {
		this.name = name;
		this.type = type;
		this.ssaekki = ssaekki;
	}

	public void checkType() {
		System.out.println(this.name + "은 포유류 입니다.");
	}
	
	void whatSaeki() {
		System.out.println(this.name + "은 새끼를 낳습니다.");
	}
	
	public String getType() {
		return this.type;
	}
}
