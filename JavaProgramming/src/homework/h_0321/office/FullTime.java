package homework.h_0321.office;

public class FullTime extends OfficeMan {

	public FullTime(String emp, String name, double pay, String rank) {
		super(emp, name, pay, rank);
	}

	@Override
	public double getMonthPay(double bonus) {
		double salary = super.getPay() / 12 + bonus / 12;
		return salary;
	}

}
