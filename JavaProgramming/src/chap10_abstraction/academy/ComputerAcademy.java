package chap10_abstraction.academy;

public class ComputerAcademy extends Academy {

	public ComputerAcademy() {
		super(50, 60, 70, 80);
	}
	
	//어노테이션 @~~~ 무슨 클래스라는걸 알려준다 컴파일러나 서버에 
	//@Override : 오버라이드된 메소드라고 컴파일러에게 알림
	//@Override 없으면 컴파일러가 오버라이드된 메소드인지
	//부모와 자식을 계속 비교하면서 컴파일
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원은 컴퓨터를 가르친다.");
	}

	@Override
	public void doHomework() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 숙제가 많다.");
	}

	@Override
	public void takeRest() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원은 5분쉰다.");
	}

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원은 " + super.studentCnt + "명이 출석했다.");
	}

}
