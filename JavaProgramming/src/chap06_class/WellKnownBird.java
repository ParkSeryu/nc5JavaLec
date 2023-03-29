package chap06_class;

import chap06_class.animal.Bird;

public class WellKnownBird {
	public static void main(String[] args) {
		Bird[] bird = new Bird[2];
		bird[0] = new Bird();
		bird[0].wing = 2;
		bird[0].color = "빨강";
		bird[0].name = "갈라파고스 제도 앵무";
		bird[0].size = 10;
		bird[0].food = "최고급 소고기";
		
		bird[1] = new Bird();
		bird[1].wing = 4;
		bird[1].name = "독수리";
		bird[1].food = "라면";
		start(bird[0]);
		start(bird[1]);
	}
	
	static void start(Bird bd) {
		bd.fly(5);
		bd.cry();
		bd.walk();
		bd.eat();
	}
}
