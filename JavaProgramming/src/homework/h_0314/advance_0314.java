package homework.h_0314;

public class advance_0314 {
	public static void main(String[] args) {
		String str = "dBEfIZ";
		String answer = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			char splitCh;
//			splitCh = ch >= 'A' && ch <= 'Z' ? (char) ((int) ch + 33) : (char) ((int) ch - 33);
//			splitCh = splitCh < 'A' ? splitCh += 26 : splitCh > 'z' ? splitCh -= 26 : splitCh;
//			answer = splitCh + answer;
//		}
		String prStr = "";
		char convertCh;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
//			char convertCh = ch >= 'A' && ch <= 'Z'
//					? (ch + 33) > 'z' ? (char) (('a' - 1) + ((ch + 33) - 'z')) : (char) (ch + 33)
//					: (ch - 33) < 'A' ? (char) (('Z' + 1) - ('A' - (ch - 33))) : (char) (ch - 33);
//
//			prStr = convertCh + prStr;

			if (ch >= 'A' && ch <= 'Z') {
				if ((ch + 33) > 'z') {
					convertCh = (char) (('a' - 1) + ((ch + 33) - 'z'));
				} else {
					convertCh = (char) (ch + 33);
				}
			} else if ((ch - 33) < 'A') {
				convertCh = (char) (('Z' + 1) - ('A' - (ch - 33)));
			} else {
				convertCh = (char) (ch - 33);
			}
			prStr = convertCh + prStr;
		}

		System.out.println(prStr);
	}
}
