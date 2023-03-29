package chap99_etc;

public class _02_countKorea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가A나B다C라D바바바다다다라라아아";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 44032 && ch <= 55203) {
				count++;
			}
		}

		System.out.println(count);
	}                                                

}
