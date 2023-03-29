package homework.h_0320.mamal;

public class Tiger extends CatType {
	private int teeth;

	Tiger() {
	}

	public Tiger(String name, String type, boolean ssaekki, String ggori, String meal, int teeth) {
		super(name, type, ssaekki, ggori, meal);
		this.teeth = teeth;
	}
	
	public void howManyTeeth() {
		System.out.println(super.name +"은 치아가 " +this.teeth + "개 입니다.");
	}
	
	public void getTypes() {
		System.out.println(super.getType());
	}
	
	
}
