
public class Checking {
	
	public static int status;
	
	public static void autoCheck() {
		if(
				(Algo.board[0] == 1 && Algo.board[1] == 1 && Algo.board[2] == 1) ||
				(Algo.board[3] == 1 && Algo.board[4] == 1 && Algo.board[5] == 1) ||
				(Algo.board[6] == 1 && Algo.board[7] == 1 && Algo.board[8] == 1) ||
				
				(Algo.board[0] == 1 && Algo.board[3] == 1 && Algo.board[6] == 1) ||
				(Algo.board[1] == 1 && Algo.board[4] == 1 && Algo.board[7] == 1) ||
				(Algo.board[2] == 1 && Algo.board[5] == 1 && Algo.board[8] == 1) ||
				
				(Algo.board[0] == 1 && Algo.board[4] == 1 && Algo.board[8] == 1) ||
				(Algo.board[2] == 1 && Algo.board[4] == 1 && Algo.board[6] == 1) ) 
		{
			status = 1;
		} else if(
				(Algo.board[0] == 2 && Algo.board[1] == 2 && Algo.board[2] == 2) ||
				(Algo.board[3] == 2 && Algo.board[4] == 2 && Algo.board[5] == 2) ||
				(Algo.board[6] == 2 && Algo.board[7] == 2 && Algo.board[8] == 2) ||
				
				(Algo.board[0] == 2 && Algo.board[3] == 2 && Algo.board[6] == 2) ||
				(Algo.board[1] == 2 && Algo.board[4] == 2 && Algo.board[7] == 2) ||
				(Algo.board[2] == 2 && Algo.board[5] == 2 && Algo.board[8] == 2) ||
				
				(Algo.board[0] == 2 && Algo.board[4] == 2 && Algo.board[8] == 2) ||
				(Algo.board[2] == 2 && Algo.board[4] == 2 && Algo.board[6] == 2) ) 
		{
			status = 2;
		} else if(Algo.turn == 9) {
			status = 3;
		} else {
			status = 0;
		}
		
		if(status == 1) {
			Main.winner.setText("PLAYER WON!");
		} else if(status == 2) {
			Main.winner.setText("CPU WON!");
		} else if(status == 3) {
			Main.winner.setText("DRAW!");
		} else {
			Main.winner.setText("");
		}
		
		if(status == 1 || status == 2 || status == 3) {
			for(int i = 0; i < Main.buttons.length; i++) {
				Main.buttons[i].setEnabled(false);
			}
		} else {
			for(int i = 0; i < Main.buttons.length; i++) {
				Main.buttons[i].setEnabled(true);
			}
		}
	}

}
