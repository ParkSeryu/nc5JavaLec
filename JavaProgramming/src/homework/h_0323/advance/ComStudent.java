package homework.h_0323.advance;

public class ComStudent extends CommonStat {

	public ComStudent(int sno, String name) {
		super(sno, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(String subject, int score) {
		// TODO Auto-generated method stub
		super.saveInfo(subject, score);
		PrintStRank.comTotal += score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("학과 : 컴퓨터공학과");
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		return super.getAvg();
	}

}
