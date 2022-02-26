
public class Algo {

	public static int[] board = new int[9];
	static int[] score = {-1, 1, 0};
	public static int turn;
	
	public static void bot() {
		int bestScore = -Integer.MAX_VALUE;
		int move = -1;
		for(int i = 0; i < 9; i++) {
			if(board[i] != 1 && board[i] != 2) {
				board[i] = 2;
				turn++;
				int score = minimax(0,false);
				turn--;
				board[i] = 0;
				if(score > bestScore) {
					bestScore = score;
					move = i;
				}
			}
		}
		board[move] = 2;
		Main.buttons[move].setText("O");
		Main.buttons[move].setFont(Main.xOFont);
		Buttons.isBot = false;
		turn++;
	}
	
	public static int minimax(int depth, boolean isMax) {
		int result = checkWinner();
		if(result != 0) {
			return score[result-1];
		}
		
		if(isMax) {
			int bestScore = -Integer.MAX_VALUE;
			for(int i = 0; i < 9; i++) {
				if(board[i] != 1 && board[i] != 2) {
					board[i] = 2;
					turn++;
					int score = minimax(depth+1, false);
					turn--;
					board[i] = 0;
					bestScore = Math.max(score, bestScore);
				}
			}
			return bestScore;
		} else {
			int bestScore = Integer.MAX_VALUE;
			for(int i = 0; i < 9; i++) {
				if(board[i] != 1 && board[i] != 2) {
					board[i] = 1;
					turn++;
					int score = minimax(depth+1,true);
					board[i] = 0;
					turn--;
					bestScore = Math.min(score, bestScore);
				}
			}
			return bestScore;
		}
	}
	
	public static int checkWinner() {
		if(
				(board[0] == 1 && board[1] == 1 && board[2] == 1) ||
				(board[3] == 1 && board[4] == 1 && board[5] == 1) ||
				(board[6] == 1 && board[7] == 1 && board[8] == 1) ||
				
				(board[0] == 1 && board[3] == 1 && board[6] == 1) ||
				(board[1] == 1 && board[4] == 1 && board[7] == 1) ||
				(board[2] == 1 && board[5] == 1 && board[8] == 1) ||
				
				(board[0] == 1 && board[4] == 1 && board[8] == 1) ||
				(board[2] == 1 && board[4] == 1 && board[6] == 1) ) 
		{
			return 1;
		} else if(
				(board[0] == 2 && board[1] == 2 && board[2] == 2) ||
				(board[3] == 2 && board[4] == 2 && board[5] == 2) ||
				(board[6] == 2 && board[7] == 2 && board[8] == 2) ||
				
				(board[0] == 2 && board[3] == 2 && board[6] == 2) ||
				(board[1] == 2 && board[4] == 2 && board[7] == 2) ||
				(board[2] == 2 && board[5] == 2 && board[8] == 2) ||
				
				(board[0] == 2 && board[4] == 2 && board[8] == 2) ||
				(board[2] == 2 && board[4] == 2 && board[6] == 2) ) 
		{
			return 2;
		} else if(turn == 9) {
			return 3;
		} else {
			return 0;
		}
	}
}
