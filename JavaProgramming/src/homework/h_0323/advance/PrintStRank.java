package homework.h_0323.advance;

public class PrintStRank {
	static double mathTotal;
	static double engTotal;
	static double comTotal;
	
	public void printRank(CommonStat cmst[]) {
		double[] arr = {mathTotal, engTotal, comTotal}; // 점수
		int[] rankArr = {1, 1, 1}; // 각 점수별 순위(1로 초기화)
		String[] strArr = {"수학과", "영어과", "컴공과"};
		
		for(int i = 0; i<arr.length; i++) {
			rankArr[i] = 1; // 순위 배열을 for 돌때마다 1등으로 초기화
			for(int j = 0; j<arr.length; j++) { // 배열 i 인덱스의 점수와 나머지 점수 비교
				if(arr[i] < arr[j]) { // i 인덱스의 값보다 크다면
					rankArr[i] = rankArr[i] + 1; // 순위 증가
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("학과 : " + strArr[i] + " 점수 : " + arr[i] + " 순위 : " + rankArr[i] );
		}
	}
}
