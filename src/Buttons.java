import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener {

	public static boolean isBot;
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < Aglo.board.length; i++) {
			if(e.getSource() == Main.buttons[i]) {
				if(Aglo.board[i] != 2 && Aglo.board[i] != 1) {
					Main.buttons[i].setLabel("X");
					Main.buttons[i].setFont(Main.xOFont);
					  
					Aglo.board[i] = 1;
					System.out.println("Player placed: " + i);
					isBot = true;
					Aglo.turn++;
					
					if(!(Checking.status == 1 || Checking.status == 2 || Checking.status == 3)) {
						  Aglo.bot();
					}
					
				} else {
					System.out.println("Taken!");
					isBot = false;
				}
			}
		}		
	}

}
