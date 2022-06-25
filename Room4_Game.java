import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

/**
 * This class displays the room4_game. In this class you can search the suspect's laptop
 * @author mehreen shaikh
 *
 */
public class Room4_Game{
	/**
	 * Calls computer screen class
	 * @param String[] args
	 */
	public static void main(String[] args) {
		compscreen();

	}//end of main
	
	// specifications of JFrame
	public static JLabel bg = new JLabel(new ImageIcon("images/computer_bg.jpg"));
	public static JFrame frame = new JFrame("Room 4");

	public static void compscreen(){   
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.add(bg);

		// adding back button
		JButton back = new JButton("Back");
		back.setBounds(10, 10,90, 50);
		bg.add(back);
		// action listener leads to map
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4 map = new Room4();
				map.showroom4();
			}
		});

		// adds mini button for interaction to the files 
		JButton files = new JButton("");
		files.setBounds(250, 80, 10, 10);
		bg.add(files);
		// leads user to the file class with action listener
		files.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Filess files = new Filess();
				files.file();
			}
		});

		// adding mini button for bank info
		JButton images = new JButton();
		images.setBounds(250, 180, 10, 10);
		bg.add(images);
		// leads to log in screen
		images.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Imgs login = new Imgs();
				login.img();
			}
		});

		// button for eclipse section
		JButton eclpise = new JButton("");
		eclpise.setBounds(250, 300, 10, 10);
		bg.add(eclpise);
		eclpise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Eclipse ecl = new Eclipse();
				ecl.eclipse();
			}
		});
		// displays screen
		frame.setVisible(true);
	}

	
	
	
	
}//end of class

/**
 * This class displays the computer screen and some buttons
 * @author Mehreen
 *
 */
class compScreen {}

/**
 * This class has a files display where the user can view the check list
 * @author Mehreen
 *
 */
class Filess {
	// setting JFrame 
	public static JFrame frame = new JFrame("Room 4");
	static Scanner scan = new Scanner(System.in);

	public static void file() {
		// details for frame
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/filebg.jpg")); 
		frame.add(bg);

		// adding back button to map
		JButton back = new JButton("Back");
		back.setBounds(10, 10,90, 50);
		bg.add(back);
		// action listener
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4_Game map = new Room4_Game();
				map.compscreen();
			}
		});
		// displays frame
		frame.setVisible(true);
	}
}

/**
 * This method leads to a log in screen 
 * @author Mehreen
 *
 */
class Imgs { //implements ActionListener{

	// setting frame and all variables
	public static JFrame frame = new JFrame("Room 4");
	static Scanner scan = new Scanner(System.in);

	private static JLabel user;
	private static JTextField userText = new JTextField();
	private static JLabel pass;
	private static JPasswordField passText = new JPasswordField();
	private static JButton login;
	private static JLabel incorrect;
	private static JLabel title;

	public static void img() {
		// adding details
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);

		// adding user label
		user = new JLabel("User:");
		user.setFont(new Font("Diolog", Font.BOLD, 24));
		user.setBounds(300, 170, 80, 25);
		frame.add(user);

		// adding textfield for user input
		userText.setBounds(400, 170, 170, 40);
		frame.add(userText);

		// adding password label
		pass = new JLabel("Password:");
		pass.setFont(new Font("Diolog", Font.BOLD, 24));
		pass.setBounds(270, 260, 150, 25);
		frame.add(pass);

		// adding password field for user input
		passText.setBounds(400, 250, 170, 40);
		frame.add(passText);

		// adding button for log in
		login = new JButton("Login");
		login.setBounds(400, 320, 70, 40);
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// convert their answer to string
				String user = userText.getText();
				String password = passText.getText();

				// if the user enters nothing
				if (userText.getText().isEmpty() || passText.getText().isEmpty()){
					JOptionPane.showMessageDialog(frame, "Please enter all values");
				}

				// if the guess is correct
				if (userText.getText().equals("kelly321") && passText.getText().equals("coder2022")) {
					user = "";
					password = "";
					frame.dispose();
					Info in = new Info();
					in.info();
				}
				// error message if incorrect
				else {
					incorrect.setText("Incorrect, try again");
				}
			}
		});
		
		
		
		
		
		
		//login.addActionListener(new Imgs());
		frame.add(login);

		// adding button to map
		JButton back = new JButton("Back");
		back.setBounds(10, 10,90, 50);
		frame.add(back);
		// adds action listener
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4_Game map = new Room4_Game();
				map.compscreen();
			}
		});

		// setting JLabels
		incorrect = new JLabel("");
		incorrect.setBounds(370, 350, 200, 100);
		frame.add(incorrect);

		title = new JLabel("Bank Account");
		title.setFont(new Font("Diolog", Font.BOLD, 40));
		title.setBounds(300, 30, 400, 100);
		frame.add(title);

		// set frame display
		frame.setVisible(true);
	}
}

	//@Override
	/**
	 * This method checks if the password is correct
	 * @param e
	 */
	/*
	 * public void actionPerformed(ActionEvent e) { // convert their answer to
	 * string String user = userText.getText(); String password =
	 * passText.getText();
	 * 
	 * // if the user enters nothing if (user.equals("") || password.equals("")){
	 * 
	 * JOptionPane.showMessageDialog(frame, "Please enter all values"); }
	 * 
	 * // if the guess is correct if (user.equals("kelly321") &&
	 * password.equals("coder2022")) {
	 * 
	 * userText.setText(""); passText.setText(""); frame.dispose(); Info in = new
	 * Info(); in.info(); } // error message if incorrect else {
	 * incorrect.setText("Incorrect, try again"); } } }
	 */

/**
 * This class diplays the bank info
 * @author Mehreen
 *
 */
class Info implements ActionListener {
	// sets frame and details
	public static JFrame frame = new JFrame("Room 4");
	private static JButton back;
	static Scanner scan = new Scanner(System.in);

	public static void info() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JLabel bg = new JLabel (new ImageIcon("images/bankInfo.jpg")); 
		frame.add(bg);

		// adding back button and linking action listener
		back = new JButton("Back");
		back.setBounds(700, 500, 70, 40);
		back.addActionListener(new Info());
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4_Game screen = new Room4_Game();
				screen.compscreen();
			}
		});
		
		frame.setVisible(true);


	}

	// action listener to computerscreen
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setVisible(false);
		Room4_Game screen = new Room4_Game();
		screen.compscreen();
	}
}

/**
 * This program shows the eclipse button
 * @author Mehreen
 *
 */
class Eclipse {
	// setting JFrame and specifics
	public static JFrame frame = new JFrame("Room 4");

	static Scanner scan = new Scanner(System.in);

	public static void eclipse() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		// setting background
		JLabel bg = new JLabel (new ImageIcon("images/eclipsebg.png")); 
		frame.add(bg);

		// back button to map
		JButton back = new JButton("Back");
		back.setBounds(670, 40,90, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4_Game map = new Room4_Game();
				map.compscreen();
			}
		});

		// adds little delete button to have pop up message
		JButton delete = new JButton("Delete Code");
		delete.setBounds(670, 220, 150, 50);
		bg.add(delete);
		// this button shows a mini message with action listener
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "\"Hey! Stop messing with that!\"");
			}
		});

		// displays screen
		frame.setVisible(true);
	}
}
