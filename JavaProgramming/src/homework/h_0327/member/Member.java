package homework.h_0327.member;

import java.util.Calendar;
import java.util.Date;

public class Member {
	private int no;
	private String id;
	private String name;
	private Date lastLoginDate;
	private String Status;

	public Member() {
		this.Status = "Y";

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
		long diff = getdiffDate(this.lastLoginDate);
		if (diff >= 365) {
			this.Status = "N";
		}
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public long getdiffDate(Date lastLoginDate2) {
		Calendar now = Calendar.getInstance();
		Calendar lastLoginDate = Calendar.getInstance();

		lastLoginDate.setTime(lastLoginDate2);
		System.out.println(now.getTime());
		System.out.println(lastLoginDate.getTime());
		long diff = now.getTime().getTime() - lastLoginDate.getTime().getTime();
		long date = diff / (1000L * 60 * 60 * 24);
		System.out.println(date);
		return date;
	}
}
