/**
 * @author annie
 * 06/21/2022
 * TTTInstructions V1
 * A program that shows instructions for the tic tac toe game.
 */

// Import packages for easy utility
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TTTInstructions {
	
	// Public variables to be accessed in all methods
	public static JFrame screen = new JFrame();
	
	static class backListener implements ActionListener{
		/**
		 * Detects if user interacts with back button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			screen.setVisible(false);
			TicTacToe.ttt();
		}
	}
	/**
	 * Displays the instructions screen.
	 */
	public static void instructions() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		screen.setTitle("Instructions");
		screen.setSize(900,600);
		screen.setResizable(false);
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane pane = new JLayeredPane();
		
		// Background
		JLabel tttBackground = new JLabel(new ImageIcon("images/TTTInstructions.jpg"));
		pane.add(tttBackground, JLayeredPane.DEFAULT_LAYER);
		tttBackground.setSize(1100,700);
		tttBackground.setLocation(-100,-70);
		
		// Back Button
		JButton backButton = new JButton("Back");
		pane.add(backButton, JLayeredPane.PALETTE_LAYER);
		backButton.setFont(new Font("Dialog", Font.BOLD, 16));
		backButton.setSize(200,50);
		backButton.setLocation(350,390);
		backButton.addActionListener(new backListener());
		
		screen.add(pane);
		screen.setVisible(true);
		// ------------------------------------------------------------------------------------------
	}
	/**
	 * Main method, calls instructions method.
	 * @param args
	 */
	public static void main(String[] args) {
		instructions();
	}
}
