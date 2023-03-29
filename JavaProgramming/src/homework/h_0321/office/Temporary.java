package homework.h_0321.office;

public class Temporary extends OfficeMan {
	public double hireYear;

	public Temporary(String emp, String name, double pay, String rank) {
		super(emp, name, pay, rank);
	}

	@Override
	public double getMonthPay(double bonus) {
		double salary = super.getPay() / 12;
		return salary;
	}

}
