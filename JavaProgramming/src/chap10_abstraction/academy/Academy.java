package chap10_abstraction.academy;

public abstract class Academy {
	private int classCnt;
	int studentCnt;
	private int teacherCnt;
	private int subjectCnt;
	
	Academy(){
		
	}
	
	Academy(int classCnt, int studentCnt, int teacherCnt, int subjectCnt){
		this.classCnt = classCnt;
		this.studentCnt = studentCnt;
		this.teacherCnt = teacherCnt;
		this.subjectCnt = subjectCnt;
	}
	

	public abstract void teach();
	
	public abstract void doHomework();
	
	public abstract void takeRest();
	
	public abstract void attendance();
	
}
