/**
 * 
 * @author annie
 * 06/21/2022
 * HangmanInstructions V1
 * Displays instructions for hangman.
 * 
 */

// Importing packages for easier utility.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HangmanInstructions {
	
	// Public variables to be accessed in all methods.
	public static JFrame screen = new JFrame();
	
	static class backListener implements ActionListener{
		/**
		 * Detects if user interacts with back button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			screen.setVisible(false);
			Hangman.hangman();
		}
	}
	/**
	 * Main instructions screen that displays instructions.
	 */
	public static void instructions() {
		screen.setTitle("Instructions");
		screen.setSize(900,600);
		screen.setResizable(false);
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane pane = new JLayeredPane();
		
		// Background
		JLabel hangmanBackground = new JLabel(new ImageIcon("images/Instructions1.jpg"));
		pane.add(hangmanBackground, JLayeredPane.DEFAULT_LAYER);
		hangmanBackground.setSize(900,575);
		hangmanBackground.setLocation(0,0);
		
		// Back Button
		JButton backButton = new JButton("Back");
		pane.add(backButton, JLayeredPane.PALETTE_LAYER);
		backButton.setFont(new Font("Dialog", Font.BOLD, 16));
		backButton.setSize(200,50);
		backButton.setLocation(350,470);
		backButton.addActionListener(new backListener());
		
		screen.add(pane);
		screen.setVisible(true);
	}
	/**
	 * Main method, calls the instructions method.
	 * @param args
	 */
	public static void main(String[] args) {
		instructions();
	}
}
