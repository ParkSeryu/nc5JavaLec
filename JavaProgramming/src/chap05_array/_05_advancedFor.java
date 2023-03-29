package chap05_array;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 84, 92, 65, 71};
		
		int sum = 0;
		double avg;
		
		for(int s : score) {
			System.out.println(s);
			sum += s;
		}
		
		System.out.println("점수의 총합 : " + sum);
		
		avg = (double)sum / score.length;
		System.out.println("평균 점수 : " + avg);
		
		// 게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고
		// 사용자가 3개의 숫자를 입력(중복불가능)
		// 컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교하는데
		// 비교하는 데 숫자만 같으면 볼로 판정
		// 숫자와 위치까지 모두 같으면 스트라이크로 판정
		// 몇 스트라이크 몇 볼인지 출력
		// 3 스트라이크 게임종료
		// 다시 게임 진행할 지 물어보고(1: 리스타트, 0: 종료)
		
		
		
		
	}

}
