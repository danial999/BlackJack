package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JPanel {
	public  static JTextField textField_score_player;
	private static JTextField textField_Sum;
	public static boolean delerWon =false;
	public static boolean palyerWon=false;
	public static boolean play=false;
	
	public Score() {
		
		setLayout(null);
		textField_score_player = new JTextField();
		textField_score_player.setBounds(248, 62, 86, 20);
		add(textField_score_player);
		textField_score_player.setColumns(10);
		mainvvd.engine.Game.player.scoreBet=0;
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainvvd.engine.Game.player.score==0){
					JOptionPane.showMessageDialog(null,"you dont have a mony  !!!  ");
					return;
				}
				if(textField_Sum.getText().equals("")){
			JOptionPane.showMessageDialog(null,"you have  to  to put a many !!!  ");

					return;
				}
                hit hit= new hit();
				MainScreen.card.add("hit", hit);
				MainScreen.cardLayot.show(MainScreen.card, "hit");
                //hit.textField.setText(sum);
                String name = String.valueOf(mainvvd.engine.Game.player.getName());
                hit.textField_1.setText(name); 
                
                
			}
		});
		btnPlay.setBounds(245, 231, 89, 23);
		add(btnPlay);
		
		textField_Sum = new JTextField();
		textField_Sum.setBounds(248, 182, 86, 20);
		add(textField_Sum);
		textField_Sum.setColumns(10);
		
		Score.textField_score_player.setText(""+mainvvd.engine.Game.player.score);
		JButton button = new JButton("10");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainvvd.engine.Game.player.score>=mainvvd.engine.Game.player.scoreBet+10){
					mainvvd.engine.Game.player.scoreBet+=10;
					Score.textField_Sum.setText(""+mainvvd.engine.Game.player.scoreBet);
				}
			}
		});
		button.setBounds(82, 118, 89, 23);
		add(button);
		
		JButton button_1 = new JButton("5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainvvd.engine.Game.player.score>=mainvvd.engine.Game.player.scoreBet+5){
					mainvvd.engine.Game.player.scoreBet+=5;
					Score.textField_Sum.setText(""+mainvvd.engine.Game.player.scoreBet);
				}
				
			}
		});
		button_1.setBounds(245, 118, 89, 23);
		add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainvvd.engine.Game.player.score>=mainvvd.engine.Game.player.scoreBet+1){
					mainvvd.engine.Game.player.scoreBet+=1;
					Score.textField_Sum.setText(""+mainvvd.engine.Game.player.scoreBet);
				}
			}
		});
		button_2.setBounds(411, 118, 89, 23);
		add(button_2);
		
		JButton btnClose = new JButton("close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnClose.setBounds(82, 312, 89, 23);
		add(btnClose);
		
	
	}

}
