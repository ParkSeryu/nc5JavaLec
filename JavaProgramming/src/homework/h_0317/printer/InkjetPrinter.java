package homework.h_0317.printer;

public class InkjetPrinter extends Printer{
	int inkRemain;
	
	public InkjetPrinter(){}
	
	public InkjetPrinter(String model, String maker, String interface1, int paperRemain, int inkRemain){
//		this.model = model;
//		this.maker = maker;
//		this.interface1 = interface1;
//		this.paperRemain = paperRemain;
		super(model, maker, interface1, paperRemain);
		this.inkRemain = inkRemain;
	}
	
	public void print(int printCount) {
		this.paperRemain -= printCount;
		System.out.println("모델 : " + model);
		System.out.println("제조사 : " + maker);
		System.out.println("인터페이스 종류 : " + interface1);
		System.out.println("인쇄매수 : " + printCount);
		System.out.println("인쇄종이잔량 : " + paperRemain);
		System.out.println("잉크잔량 : " + inkRemain);
	}
	
	 public void print(int printCount, int useInk) {
		this.paperRemain -= printCount;
		this.inkRemain -= useInk;
		System.out.println("모델 : " + model);
		System.out.println("제조사 : " + maker);
		System.out.println("인터페이스 종류 : " + interface1);
		System.out.println("인쇄매수 : " + printCount);
		System.out.println("인쇄종이잔량 : " + paperRemain);
		System.out.println("잉크잔량 : " + inkRemain);
	}
}
