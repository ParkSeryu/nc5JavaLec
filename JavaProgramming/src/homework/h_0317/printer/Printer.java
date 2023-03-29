package homework.h_0317.printer;

public class Printer {
	String model;
	String maker;
	String interface1;
	int paperRemain;

	public Printer() {}

	public Printer(String model, String maker, String interface1, int paperRemain) {
		this.model = model;
		this.maker = maker;
		this.interface1 = interface1;
		this.paperRemain = paperRemain;
	}

	public void print(int printCount) {
		this.paperRemain -= printCount;
		System.out.println("모델 : " + model);
		System.out.println("제조사 : " + maker);
		System.out.println("인터페이스 종류 : " + interface1);
		System.out.println("인쇄매수 : " + printCount);
		System.out.println("인쇄종이잔량 : " + paperRemain);
	}

}
