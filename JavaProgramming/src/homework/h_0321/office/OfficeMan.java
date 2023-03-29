package homework.h_0321.office;

public abstract class OfficeMan {
	private String emp;
	private String name;
	private double pay;
	private String rank;
	
	OfficeMan(){
		
	}

	OfficeMan(String emp, String name, double pay, String rank) {
		this.emp = emp;
		this.name = name;
		this.pay = pay;
		this.rank = rank;
	}

	public abstract double getMonthPay(double bonus);

	public void showEmployeeInfo() {
		System.out.println("사번 : " + this.emp + " 이름 : " + this.name + " 고용구분 : " + this.rank + " 급여 : " + this.pay);
	}

	public String getEmp() {
		return emp;
	}

	String getName() {
		return name;
	}

	double getPay() {
		return pay;
	}

	public String getRank() {
		return rank;
	}


}
