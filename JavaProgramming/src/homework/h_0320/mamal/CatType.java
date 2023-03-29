package homework.h_0320.mamal;

public class CatType extends Mamal{
	private String ggori;
	private String meal;
	
	CatType(){
		
	}
	
	CatType(String ggori, String meal){
		this.ggori = ggori;
		this.meal = meal;
	}
	
	CatType(String name, String type, boolean ssaekki, String ggori, String meal){
		super(name, type, ssaekki);
		this.ggori = ggori;
		this.meal = meal;
	}
	
	void checkGgori() {
		System.out.println(super.name + "은 " + this.ggori + "가 있습니다." );
	}
	
	void meal() {
		System.out.println(super.name + "은 " + this.meal+ "를 먹습니다");
	}
}
