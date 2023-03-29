package chap06_class.animal;

public class Bird {
	// 날개(int wing),
	// 색깔(String color),
	// 새이름(String name),
	// 크기(int size),
	// 식습관(String food)
	public int wing;
	public String color;
	public String name;
	public int size;
	public String food;
	
	public Bird() {}
	
	public Bird(String name) {
		this.name = name;
	}
	
	public Bird(String name, String food) {
		this.name = name;
		this.food = food;
	}

	// 날다(void fly),
	// 독수리(name)는 날개를 이용하여 하늘을 납니다.
	// 운다(void cry),
	// 독수리는 나무에 앉아 웁니다.
	// 걷는다(void walk),
	// 독수리는
	// 먹이를 먹는다(void eat)
	// 독수리는 고기(food)를 먹는다.

	public void fly(int num) {
		for (int i = 0; i < num; i++)
			System.out.println(name + "은 " + wing + "개의 날개를 이용하여 하늘을 납니다.");
	}

	public void cry() {
		if (name.equals("독수리"))
			System.out.println(name + "은 나무에 앉아 웁니다.");
		else {
			System.out.println(name + "은 강변에 앉아 웁니다.");
		}
	}

	public void walk() {
		System.out.println(name + "은 걷는다.");
	}

	public void eat() {
		System.out.println(name + "은" + food + "를 먹는다.");
	}

}
