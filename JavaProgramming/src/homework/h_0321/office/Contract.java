package homework.h_0321.office;

public class Contract extends OfficeMan {

	public Contract(String emp, String name, double pay, String rank) {
		super(emp, name, pay, rank);
	}

	@Override
	public double getMonthPay(double workDay) {
		double salary = super.getPay() * workDay;
		return salary;
	}

}
