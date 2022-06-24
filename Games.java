/**
 * 
 * @author annie
 * 06/21/2022
 * Games V1
 * Shows the game page that allows the user to play games without going through rooms.
 *
 */

// Importing packages for easier usage
import java.awt.event.*;
import javax.swing.*;

public class Games {
	// Public variables
	public static JLayeredPane pane = new JLayeredPane();
	public static JFrame room = new JFrame();
	
	/**
	 * the main method, calls games.
	 * @param String[] args
	 */
	public static void main(String[] args) {
		games();
	}
	
	// Action listeners for game buttons
	static class mapListener implements ActionListener{
		/**
		 * Detects if user interacts with map button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Map.map();
			room.setVisible(false);
		}
	}
	static class hangListener implements ActionListener{
		/**
		 * Detects if user interacts with hangman button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Hangman.hangman();
			room.setVisible(false);
		}
	}
	static class ticListener implements ActionListener{
		/**
		 * Detects if user interacts with tictactoe button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			TicTacToe.ttt();
			room.setVisible(false);
		}
	}
	static class lapListener implements ActionListener{
		/**
		 * Detects if user interacts with laptop button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Room4_Game.compscreen();
			room.setVisible(false);
		}
	}
	static class vaultListener implements ActionListener{
		/**
		 * Detects if user interacts with vault button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Room3_Game.gamePage();
			room.setVisible(false);
		}
	}
	/**
	 * The games method, displays the game room.
	 * @param void
	 */
	public static void games() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		room.setTitle("Games");
		room.setSize(900,600);
		room.setResizable(false);
		room.setLocationRelativeTo(null);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Background
		JLabel roomImage = new JLabel(new ImageIcon("images/GameRoom.jpg"));
		pane.add(roomImage, JLayeredPane.DEFAULT_LAYER);
		roomImage.setSize(1000,700);
		roomImage.setLocation(-50,-75);

		// Buttons
		JButton back = new JButton("Map");
		pane.add(back, JLayeredPane.PALETTE_LAYER);
		back.setSize(200,50);
		back.setLocation(25, 25);
		back.addActionListener(new mapListener());
		
		JButton tic = new JButton("Tic Tac Toe");
		pane.add(tic, JLayeredPane.PALETTE_LAYER);
		tic.setSize(200,50);
		tic.setLocation(25,420);
		tic.addActionListener(new ticListener());
		
		JButton hangman = new JButton("Hangman");
		pane.add(hangman, JLayeredPane.PALETTE_LAYER);
		hangman.setSize(200,50);
		hangman.setLocation(25,300);
		hangman.addActionListener(new hangListener());
		
		JButton vault = new JButton("Vault");
		pane.add(vault, JLayeredPane.PALETTE_LAYER);
		vault.setSize(200,50);
		vault.setLocation(25,360);
		vault.addActionListener(new vaultListener());
		
		JButton laptop = new JButton("Laptop");
		pane.add(laptop, JLayeredPane.PALETTE_LAYER);
		laptop.setSize(200,50);
		laptop.setLocation(25,480);
		laptop.addActionListener(new lapListener());

		room.add(pane);
		room.setVisible(true);
		// ------------------------------------------------------------------------------------------
	}
	
}
