package chap06_class.phone;

public class PhoneInfo {
	//이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String)
	String name[] = new String[100];
	String phoneNum[] = new String[100];
	
	// 배열의 현재 인덱스를 담고 있을 변수
	int index = 0;
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNumber
	
	 public void insertPhoneNumber(String name, String number) {
		this.name[index] = name;
		this.phoneNum[index++] = number;
	}
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	// ex) 이름: 홍길동1, 전화번호 : 111111111
	// ex) 이름: 홍길동2, 전화번호 : 222222222
	// ex) 이름: 홍길동3, 전화번호 : 333333333
	// ex) 이름: 홍길동4, 전화번호 : 444444444
	
	public void printAllPhoneNum() {
		for (int i =0; i< index; i++) {
			System.out.println("이름 : " + name[i] + ", 전화번호 : " + phoneNum[i]);
		}
	}
	
	//전달받은 번호의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	// ex) 이름 : 홍길동3, 전화번호 : 33333333
	
	public void printPhoneInfo(int index) {
		System.out.println("이름 : " + name[index] + ", 전화번호 : " + phoneNum[index]);
	}
	
	
	
}
