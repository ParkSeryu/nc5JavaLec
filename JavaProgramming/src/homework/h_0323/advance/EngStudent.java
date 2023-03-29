package homework.h_0323.advance;

public class EngStudent extends CommonStat {

	public EngStudent(int sno, String name) {
		super(sno, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(String subject, int score) {
		// TODO Auto-generated method stub
		super.saveInfo(subject, score);
		PrintStRank.engTotal += score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("학과 : 영어과");
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		return super.getAvg();
	}

}
