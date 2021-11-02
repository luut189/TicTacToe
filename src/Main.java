import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Main {

  public static JFrame frame;
  public static JPanel gamePanel, titlePanel, checkingPanel, creditPanel, winnerPanel, resetPanel;
  public static JLabel title, credit, winner;
  
  public static JButton[] buttons = new JButton[9];
  public static JButton checking, reset;
  
  private static Font titleFont = new Font("Cambria", Font.PLAIN, 70);
  public static Font players = new Font("Cambria", Font.PLAIN, 30);
  private static Font creditFont = new Font("Cambria", Font.PLAIN, 25);
  public static Font xOFont = new Font("Cambria", Font.PLAIN, 90);
  
  public static Border border = BorderFactory.createLineBorder(Color.white, 1, true);

  public static void main(String[] args) {
    GUI();
    while(true) {
    	Checking.autoCheck();
    	if(Checking.status == 1 || Checking.status == 2 || Checking.status == 3) {
    		Buttons.isBot = false;
    	}
    }
  }

  public static void GUI() {
	//FRAME
    frame = new JFrame();
    frame.setTitle("Tic-Tac-Toe");
    frame.setSize(900, 900);
    frame.getContentPane().setBackground(Color.black);
    frame.setLayout(null);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);

    //GAME PANEL AKA BUTTON PANEL
    gamePanel = new JPanel();
    gamePanel.setBounds(200, 150, 500, 500);
    gamePanel.setBackground(Color.black);
    gamePanel.setLayout(new GridLayout(3, 3));
    frame.add(gamePanel);
    
    //BUTTON
    for(int i = 0; i < buttons.length; i++) {
    	buttons[i] = new JButton();
    	buttons[i].setForeground(Color.white);
    	buttons[i].setBackground(Color.black);
    	buttons[i].addActionListener(new Buttons());
    	gamePanel.add(buttons[i]);
    }
    
    //RESET
    resetPanel = new JPanel();
    resetPanel.setBounds(750, 810, 120, 40);
    resetPanel.setBackground(Color.black);
    resetPanel.setLayout(new GridLayout(1, 1));
    frame.add(resetPanel);
    
    reset = new JButton("Reset");
    reset.setForeground(Color.white);
    reset.setBackground(Color.black);
    reset.setFont(players);
    reset.addActionListener(new Reset());
    resetPanel.add(reset);
    
    //WINNER
    winnerPanel = new JPanel();
    winnerPanel.setBounds(350, 700, 200, 50);
    winnerPanel.setBackground(Color.black);
    winnerPanel.setLayout(new GridLayout(1, 1));
    winnerPanel.setBorder(border);
    frame.add(winnerPanel);
    
    winner = new JLabel("");
    winner.setForeground(Color.white);
    winner.setBackground(Color.black);
    winner.setHorizontalAlignment(SwingConstants.CENTER);
    winner.setVerticalAlignment(SwingConstants.CENTER);
    winner.setFont(players);
    winnerPanel.add(winner);
    
    //TITLE PANEL
    titlePanel = new JPanel();
    titlePanel.setBounds(200, 25, 500, 100);
    titlePanel.setBackground(Color.black);
    titlePanel.setLayout(new GridLayout(1, 1));
    frame.add(titlePanel);
    
    title = new JLabel("Tic-Tac-Toe");
    title.setForeground(Color.white);
    title.setFont(titleFont);
    title.setHorizontalAlignment(SwingConstants.CENTER);
    title.setVerticalAlignment(SwingConstants.CENTER);
    titlePanel.add(title);
    
    //CREDIT PANEL
    creditPanel = new JPanel();
    creditPanel.setBounds(0, 810, 150, 90);
    creditPanel.setBackground(Color.black);
    frame.add(creditPanel);
    
    credit = new JLabel("@TuongLuu");
    credit.setForeground(Color.gray);
    credit.setFont(creditFont);
    creditPanel.add(credit);
    
    frame.setVisible(true);
  }
}

