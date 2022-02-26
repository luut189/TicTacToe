import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener {

	public static boolean isBot;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < Algo.board.length; i++) {
			if(e.getSource() == Main.buttons[i]) {
				if(Algo.board[i] != 2 && Algo.board[i] != 1) {
					Main.buttons[i].setText("X");
					Main.buttons[i].setFont(Main.xOFont);
					  
					Algo.board[i] = 1;
					System.out.println("Player placed: " + i);
					isBot = true;
					Algo.turn++;
					
					if(!(Checking.status == 1 || Checking.status == 2 || Checking.status == 3)) {
						  Algo.bot();
					}
					
				} else {
					System.out.println("Taken!");
					isBot = false;
				}
			}
		}		
	}

}
