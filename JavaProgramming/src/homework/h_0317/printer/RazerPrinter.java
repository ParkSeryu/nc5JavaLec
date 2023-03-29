package homework.h_0317.printer;

public class RazerPrinter extends Printer {
	int tonerRemain;
	
	public RazerPrinter(){
		
	}
	
	public RazerPrinter(String model, String maker, String interface1, int paperRemain, int tonerRemain){
		super(model, maker, interface1, paperRemain);
		this.tonerRemain = tonerRemain;
	}
	

	public void print(int printCount, int useToner) {
		this.paperRemain -= printCount;
		this.tonerRemain -= useToner;
		System.out.println("모델 : " + this.model);
		System.out.println("제조사 : " + this.maker);
		System.out.println("인터페이스 종류 : " + this.interface1);
		System.out.println("인쇄매수 : " + printCount);
		System.out.println("인쇄종이잔량 : " + this.paperRemain);
		System.out.println("토너잔량 : " + this.tonerRemain);
	}
}
