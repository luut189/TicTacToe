import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checking implements ActionListener {
	
	public static int status;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(
				(Aglo.board[0] == 1 && Aglo.board[1] == 1 && Aglo.board[2] == 1) ||
				(Aglo.board[3] == 1 && Aglo.board[4] == 1 && Aglo.board[5] == 1) ||
				(Aglo.board[6] == 1 && Aglo.board[7] == 1 && Aglo.board[8] == 1) ||
				
				(Aglo.board[0] == 1 && Aglo.board[3] == 1 && Aglo.board[6] == 1) ||
				(Aglo.board[1] == 1 && Aglo.board[4] == 1 && Aglo.board[7] == 1) ||
				(Aglo.board[2] == 1 && Aglo.board[5] == 1 && Aglo.board[8] == 1) ||
				
				(Aglo.board[0] == 1 && Aglo.board[4] == 1 && Aglo.board[8] == 1) ||
				(Aglo.board[2] == 1 && Aglo.board[4] == 1 && Aglo.board[6] == 1) ) 
		{
			status = 1;
		} else if(
				(Aglo.board[0] == 2 && Aglo.board[1] == 2 && Aglo.board[2] == 2) ||
				(Aglo.board[3] == 2 && Aglo.board[4] == 2 && Aglo.board[5] == 2) ||
				(Aglo.board[6] == 2 && Aglo.board[7] == 2 && Aglo.board[8] == 2) ||
				
				(Aglo.board[0] == 2 && Aglo.board[3] == 2 && Aglo.board[6] == 2) ||
				(Aglo.board[1] == 2 && Aglo.board[4] == 2 && Aglo.board[7] == 2) ||
				(Aglo.board[2] == 2 && Aglo.board[5] == 2 && Aglo.board[8] == 2) ||
				
				(Aglo.board[0] == 2 && Aglo.board[4] == 2 && Aglo.board[8] == 2) ||
				(Aglo.board[2] == 2 && Aglo.board[4] == 2 && Aglo.board[6] == 2) ) 
		{
			status = 2;
		} else if(Aglo.turn == 10) {
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
	
	public static void autoCheck() {
		if(
				(Aglo.board[0] == 1 && Aglo.board[1] == 1 && Aglo.board[2] == 1) ||
				(Aglo.board[3] == 1 && Aglo.board[4] == 1 && Aglo.board[5] == 1) ||
				(Aglo.board[6] == 1 && Aglo.board[7] == 1 && Aglo.board[8] == 1) ||
				
				(Aglo.board[0] == 1 && Aglo.board[3] == 1 && Aglo.board[6] == 1) ||
				(Aglo.board[1] == 1 && Aglo.board[4] == 1 && Aglo.board[7] == 1) ||
				(Aglo.board[2] == 1 && Aglo.board[5] == 1 && Aglo.board[8] == 1) ||
				
				(Aglo.board[0] == 1 && Aglo.board[4] == 1 && Aglo.board[8] == 1) ||
				(Aglo.board[2] == 1 && Aglo.board[4] == 1 && Aglo.board[6] == 1) ) 
		{
			status = 1;
		} else if(
				(Aglo.board[0] == 2 && Aglo.board[1] == 2 && Aglo.board[2] == 2) ||
				(Aglo.board[3] == 2 && Aglo.board[4] == 2 && Aglo.board[5] == 2) ||
				(Aglo.board[6] == 2 && Aglo.board[7] == 2 && Aglo.board[8] == 2) ||
				
				(Aglo.board[0] == 2 && Aglo.board[3] == 2 && Aglo.board[6] == 2) ||
				(Aglo.board[1] == 2 && Aglo.board[4] == 2 && Aglo.board[7] == 2) ||
				(Aglo.board[2] == 2 && Aglo.board[5] == 2 && Aglo.board[8] == 2) ||
				
				(Aglo.board[0] == 2 && Aglo.board[4] == 2 && Aglo.board[8] == 2) ||
				(Aglo.board[2] == 2 && Aglo.board[4] == 2 && Aglo.board[6] == 2) ) 
		{
			status = 2;
		} else if(Aglo.turn == 9) {
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
