import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset implements ActionListener {

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < Main.buttons.length; i++) {
			Main.buttons[i].setLabel("");
			Main.buttons[i].setEnabled(true);
			Aglo.board[i] = 0;
		}
		Checking.status = 0;
		Aglo.turn = 0;
		Main.winner.setText("");

	}

}
