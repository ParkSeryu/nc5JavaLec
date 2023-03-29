package homework.h_0317;

import homework.h_0317.printer.InkjetPrinter;
import homework.h_0317.printer.Printer;
import homework.h_0317.printer.RazerPrinter;

public class basic_0317 {
	public static void main(String[] args) {
		Printer normalPrinter = new Printer();
		Printer normalPrinter2 = new Printer("일반 프린터", "구닥다리회사", "PS2 Port", 100);
		InkjetPrinter inkjetPrinter = new InkjetPrinter("잉크젯 프린터", "중소회사", "paraller port", 200, 300);
		RazerPrinter razerPrinter = new RazerPrinter("레이저 프린터", "대기업", "USB", 500, 300);
		Printer normalPrinter3 = (Printer)new RazerPrinter("일반 프린터", "구닥다리회사", "PS2 Port", 100, 200);
		
		//normalPrinter2.print(20);
		normalPrinter3.print(40);
		inkjetPrinter.print(50);
		inkjetPrinter.print(50, 30);
		//razerPrinter.print(50);
		//razerPrinter.print(50, 30);
		
		
	}
}
