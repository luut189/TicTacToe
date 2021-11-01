
public class Aglo {

	public static int[] board = new int[9];
	private static int bot;
	public static int turn;
	
	@SuppressWarnings("deprecation")
	public static void bot() {
		while(Buttons.isBot) {
			bot = (int) (Math.random()*9);
			System.out.println("Bot tried: "+bot);
			
			if(board[bot] == 1 || board[bot] == 2) {
				
			} else {
				board[bot] = 2;
				for(int i = 0; i < 9; i++) {
					if(i == bot) {
						if(board[i] == 2) {
							Main.buttons[i].setLabel("O");
							Main.buttons[i].setFont(Main.xOFont);
							Buttons.isBot = false;
							turn++;
							System.out.println("Bot placed: "+bot + "\n");
						}
					}
				}
			}	
		}
	}
}
