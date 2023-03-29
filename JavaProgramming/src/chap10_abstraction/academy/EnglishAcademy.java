package chap10_abstraction.academy;

public class EnglishAcademy extends Academy {

	public EnglishAcademy() {
		super(10, 20, 30, 40);
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("영어학원은 영어를 가르친다.");
	}

	@Override
	public void doHomework() {
		// TODO Auto-generated method stub
		System.out.println("영어학원은 영어숙제를 한다.");
	}

	@Override
	public void takeRest() {
		// TODO Auto-generated method stub
		System.out.println("영어학원은 10분쉰다.");
	}

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("영어학원은 " + super.studentCnt + "명이 출석했다.");
	}

}
