/**
 * 
 * @author annie
 * 06/07/2022
 * TitlePage V1
 * Title screen program for the game, launches a basic title page with 2 buttons, exit and continue
 *
 */

// Import packages for easy utility
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitlePage {
	
	// Public variables to be accessible in all methods
	public static JFrame title = new JFrame();
	
	public static class playListener implements ActionListener {
		/**
		 * Detects if user interacts with play button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			title.setVisible(false);
			Menu.menuPage();
		}
	}
	
	public static class exitListener implements ActionListener {
		/**
		 * Detects if user interacts with exit button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	/**
	 * Displays the title page.
	 */
	public static void titlePage() {
		title.setTitle("Mystery Mania");
		title.setSize(900,600);
		title.setResizable(false);
		title.setLocationRelativeTo(null);
		title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title.setLayout(new BorderLayout());
		
		// Title Display
		JLabel gameName = new JLabel("Mystery Mania", SwingConstants.CENTER);
		gameName.setFont(new Font("Dialog", Font.BOLD, 36));
		title.add(gameName, BorderLayout.NORTH);
		
		// Buttons Display
		JButton play = new JButton("Play");
		play.setFont(new Font("Dialog", Font.BOLD, 18));
		JButton exit = new JButton("Exit");
		exit.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JPanel buttons = new JPanel(new GridLayout(1,2, 5, 5));
		buttons.add(play);
		buttons.add(exit);
		title.add(buttons, BorderLayout.SOUTH);
		
		// Image display
		Icon img = new ImageIcon("images/title.jpg");
		JLabel background = new JLabel(img);
		title.add(background);
		
		// Buttons Function
		playListener playButton = new playListener();
		play.addActionListener(playButton);
		exitListener exitButton = new exitListener();
		exit.addActionListener(exitButton);
		
		title.setVisible(true);
	}
	
	/**
	 * The main method, calls the titlePage method.
	 * @param String[] args
	 */
	public static void main(String[] args) {
		titlePage();
	}
}
