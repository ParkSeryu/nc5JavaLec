package coding_test;

public class anjun_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] board2 = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] board3 = { { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };
		System.out.println(solution(board3));
	}

	public static int solution(int[][] board) {
		int answer = 0;
		int dangerBoard[][] = new int[board.length][board.length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				dangerBoard[i][j] = 0;
			}
		}

		for (int rows = 0; rows < board.length; rows++) {
			for (int cols = 0; cols < board[rows].length; cols++) {
				if (board[rows][cols] == 1) {
					dangerBoard = makeDangerBoard(dangerBoard, rows, cols);
				}
			}
		}

		for (int rows = 0; rows < dangerBoard.length; rows++) {

			for (int cols = 0; cols < dangerBoard[rows].length; cols++) {
				System.out.print(dangerBoard[rows][cols]);
				if (dangerBoard[rows][cols] == 0) {
					answer++;
				}
			}
			System.out.println();
		}

		return answer;
	}

	public static int[][] makeDangerBoard(int[][] dangerBoard, int rows, int cols) {
		for (int row = rows - 1; row <= rows + 1; row++) {
			for (int col = cols - 1; col <= cols + 1; col++) {
				if (row >= 0 && row < dangerBoard.length && col >= 0 && col < dangerBoard[row].length)
					dangerBoard[row][col] = 1;
			}
		}
		return dangerBoard;
	}

}
