package homework.h_0323.advance;

public class CommonStat implements Student {

	public int sno; // 학번
	StringBuffer name; // 이름
	String[] subject; // 과목
	int[] finalExam; // 최종점수
	int subjectIndex;


	public CommonStat() {
	};

	CommonStat(int sno, String name) {
		this.sno = sno;
		this.name = new StringBuffer(name);
		this.subjectIndex = 0;
		this.finalExam = new int[100];
		this.subject = new String[100];
		
	}

	@Override
	public void saveInfo(String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[this.subjectIndex] = subject;
		this.finalExam[this.subjectIndex++] = score;
	}

	@Override
	public void printInfo() {
		System.out.println("학번 : " + this.sno);
		System.out.println("이름 : " + this.name.toString());
		System.out.println("평균점수 : " + this.getAvg());
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double sum = 0;
		int i = 0;
		for (; i<subjectIndex; i++) {
			sum += finalExam[i];
		}
		return sum / i;
	}

}
