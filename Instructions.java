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
		JLabel label = new JLabel("<html><body>Instructions: <br>Step 1<br>Step 2<br>Step 3</body></html>");
		label.setFont(new Font("Diolog", Font.BOLD, 28));
		label.setBounds(100, 100, 300, 300);
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