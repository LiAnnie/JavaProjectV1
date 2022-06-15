import java.awt.*; 
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*; 

/**
 * This page is the Instructions page where all instructions will be displayed.
 * The program will read in a text file which includes all the instructions, 
 * as well as have a back button which returns to the main menu
 * @author Mehreen Shaikh
 *
 */

/**
 * Calls the method of showInstructions
 * @param args
 *
 */
public class Instructions {
	public static void main(String[] args) {
		showInstructions();
	}

	/**
	 * This displays the Instructions menu
	 */
	public static void showInstructions() {
		// setting the frame values
		JFrame frame = new JFrame("Instructions");
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.ORANGE);
		
		// declaring the JLabels
		JLabel label = new JLabel("<html><body>This game is a mystery game where you need to find out who\r\n"
				+ "stole the Mona Lisa! There are four suspects, each who have their"
				+ " own story to tell. Who will turn out to be the culprit?"
				+ " When clicking start, you will be redirected to a map.\r\n"
				+ "<br>In that map there are several buttons that lead to different\r\n"
				+ "<br>rooms. In each room there is a suspect who you must interrogate\r\n"
				+ "<br>and search! To learn more about your suspects, make sure to play\r\n"
				+ "<br>the mini games while searching to find more clues. Good Luck \r\n"
				+ "<br>Detective, the museum is counting on you! <br></body></html>");
		label.setFont(new Font("Diolog", Font.BOLD, 20));
		label.setBounds(150, 60, 600, 300);
		frame.add(label);
		
		// BACK BUTTON
		JButton back = new JButton("Back");
		back.setBackground(Color.RED);
		frame.setLayout(null);
		back.setFont(new Font("Diolog", Font.BOLD, 18));
		back.setBounds(100, 450, 150, 50);
		frame.add(back);
		back.addActionListener(new ActionListener() {

			@Override
			/**
			 * This links the window back to the menu page
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Menu win1 = new Menu();
				win1.menuPage();
			}
			
		});
		
		// displays the instruction page as true
		frame.setVisible(true);
	}
		
	}
