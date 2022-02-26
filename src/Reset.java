import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < Main.buttons.length; i++) {
			Main.buttons[i].setText("");
			Main.buttons[i].setEnabled(true);
			Algo.board[i] = 0;
		}
		Checking.status = 0;
		Algo.turn = 0;
		Main.winner.setText("");

	}

}
