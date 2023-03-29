package homework.h_0320.mamal;

public class Lion extends CatType {
	private int teeth;

	public Lion() {
	}

	public Lion(String name, String type, boolean ssaekki, String ggori, String meal, int teeth) {
		super(name, type, ssaekki, ggori, meal);
		this.teeth = teeth;
	}
	
	public void howManyTeeth() {
		System.out.println(super.name +"은 치아가 " +this.teeth + "개 입니다.");
	}
	
	
}
