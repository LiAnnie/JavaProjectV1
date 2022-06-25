import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * This class is the finale room. Here, the user needs to make a choice who the culprit is
 * @author mehreen shaikh
 *
 */

public class Final{
	// creating the Jframe
	public static JFrame frame = new JFrame("Room 4");
	public static JLabel bg = new JLabel (new ImageIcon("images/final.jpg"));

	/**
	 * The main method calling the showfinal method
	 * @param String[] args
	 */
	public static void main(String[] args) {
		showfinal();

	}

	/**
	 * This method shows the final room
	 */
	public static void showfinal() {
		// setting specifications of the JFrame
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		// setting background image
		frame.add(bg);

		// button returning to map menu
		JButton back = new JButton("Map");
		back.setBounds(30, 20, 70, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// button for first person
		JButton per1 = new JButton("Mr.Doof");
		per1.setBounds(300, 440, 150, 50);
		bg.add(per1);
		per1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Incorrect inc = new Incorrect();
				inc.incorrect();
			}
		});

		// button for second person
		JButton per2 = new JButton("Pierre leRoy");
		per2.setBounds(100, 440, 150, 50);
		bg.add(per2);
		per2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Correct cor = new Correct();
				cor.correct();
			}
		});

		// button for third person
		JButton per3 = new JButton("Kelly McNielly");
		per3.setBounds(500, 440, 150, 50);
		bg.add(per3);
		per3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Incorrect inc = new Incorrect();
				inc.incorrect();
			}
		});

		// button for last person
		JButton per4 = new JButton("Augusta Horace");
		per4.setBounds(700, 440, 150, 50);
		bg.add(per4);
		per4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Incorrect inc = new Incorrect();
				inc.incorrect();
			}
		});
		// displays the frame
		frame.setVisible(true);


	}
}// end of finalroom class


/**
 * This class is shown if the user guessed correctly
 * @author Mehreen
 *
 */
class Correct {
	// set JFrame and details
	public static JFrame frame = new JFrame("Room 4");
	public static JLabel bg = new JLabel (new ImageIcon("images/goodEnd.png"));

	/**
	 * The main method calling correct method
	 * @param String[] args
	 */
	public static void main(String[] args) {
		correct();

	}

	// method displaying correct message
	public static void correct() {
		// setting specifications of the JFrame
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// setting background image
		frame.add(bg);

		// button returning to map menu
		JButton back = new JButton("Main Menu");
		back.setBounds(700, 450, 150, 50);
		bg.add(back);
		// action listener sending user back to main menu
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Menu menu = new Menu();
				menu.menuPage();
			}
		});

		// displays frame
		frame.setVisible(true);
	}
}

/**
 * This class is shown if the user guessed incorrectly
 * @author Mehreen
 *
 */
class Incorrect {
	// setting JFrameand details
	public static JFrame frame = new JFrame("Room 4");
	public static JLabel bg = new JLabel (new ImageIcon("images/badEnd.jpg"));

	/**
	 * The main method calling incorrect method
	 * @param String[] args
	 */
	public static void main(String[] args) {
		incorrect();

	}

	/**
	 * displays incorrect message 
	 */
	public static void incorrect() {
		// setting specifications of the JFrame
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// setting background image
		frame.add(bg);

		// button returning to map menu
		JButton back = new JButton("Main Menu");
		back.setBounds(700, 450, 150, 50);
		bg.add(back);
		// action listener sending user back to main menu
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Menu map = new Menu();
				map.menuPage();
			}
		});

		// displays frame
		frame.setVisible(true);
	}
}
