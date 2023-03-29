package homework.h_0316;

import java.util.Random;

public class middle_0316 {
	public static void main(String[] args) {
		middle_0316 c = new middle_0316();
		// c.problem1();
		PhoneInfo p = new PhoneInfo();
		p.start();
	}

	void problem1() {
		int[] arr = new int[20];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = rand.nextInt(101);
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + arr[i] + " ");
			} else {
				System.out.print(" " + arr[arr.length - i] + " ");
			}
		}
	}
}

class PhoneInfo {
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	int i = 0;

	public void start() {

		int leftLimit = 65; // letter 'A'
		int rightLimit = 90; // letter 'Z'
		int targetStringLength = 3;

		while (i < name.length) {
			Random random = new Random();
			String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			String generatedNumber = String.valueOf(random.nextInt(10000) + 1);
			insertPhoneInfo(generatedString, generatedNumber);
		}
		printAllPhoneInfo();
		printPhoneInfo(12);
	}

	// 이름과 번호를 배열에 저장
	public void insertPhoneInfo(String name, String number) {
		this.name[i] = name;
		phoneNum[i] = number;
		i++;
	}

	// 모든 PhoneInfo 출력
	public void printAllPhoneInfo() {
		for (int i = 0; i < name.length; i++)
			System.out.println("이름 : " + name[i] + " 폰번호 : " + phoneNum[i]);
	}

	// 번호에 해당하는 이름과 번호 출력
	public void printPhoneInfo(int index) {
		System.out.println(index + "번 이름 : " + name[index] + " 폰번호 : " + phoneNum[index]);
	}
}