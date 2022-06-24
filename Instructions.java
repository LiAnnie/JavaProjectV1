import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

/**
 * This page is the Instructions page where all instructions will be displayed.
 * The program will includes all the instructions, 
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

	public static JFrame frame = new JFrame("Instructions");
	public static JLabel bg = new JLabel (new ImageIcon("images/Instructions.jpg"));

	/**
	 * method calls the showInstructions
	 * @param String[] args
	 */
	public static void main(String[] args) {
		showInstructions();
	}

	/**
	 * This displays the Instructions menu
	 */
	public static void showInstructions() {
		// setting the frame values
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);

		// declaring the JLabels
		frame.add(bg);

		// BACK BUTTON
		JButton back = new JButton("Back");
		back.setFont(new Font("Diolog", Font.BOLD, 18));
		back.setBounds(100, 40, 150, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {

			@Override
			/**
			 * links the window back to the menu page
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