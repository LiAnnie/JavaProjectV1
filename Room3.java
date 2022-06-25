import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * This program displays a room with a suspect in it. The room has two buttons
 * search and interrogate, each having different functionalities. The search button
 * leads to room3_game and user can play game
 * @author Mehreen Shaikh
 */

public class Room3{
	// creating the jframe
	public static JFrame frame = new JFrame("Room 3");

	public static JLabel bg = new JLabel (new ImageIcon("images/room3_bg.png"));

	/**
	 * The main method calling the showroom method
	 * @param String[] args
	 */
	public static void main(String[] args) {
		showroom3();
	}

	/**
	 * showroom method which displays first frame
	 */
	public static void showroom3() {
		// setting specifications of the JFrame
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// setting background image
		frame.add(bg);
		// button returning to map menu
		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		// set action listener for the buttons, leads to map
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// setting action listener, leads to interrogate class
		JButton inter = new JButton("Interrogate");
		inter.setBounds(550, 440, 150, 50);
		bg.add(inter);
		inter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Interrogate1 interrogate = new Interrogate1();
				interrogate.intro();
			}
		});

		// button for search
		JButton search = new JButton("Search");
		search.setBounds(200, 440, 150, 50);
		bg.add(search);
		// setting action listener, leads to room3_game
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room3_Game game = new Room3_Game();
				game.gamePage();
			}
		});

		// set method true
		frame.setVisible(true);
	}



}// end of showroom3 class


/**
 * This class is the first Interrogation frame
 * @author Mehreen S
 *
 */
class Interrogate1 {
	// recreating frame and specifications
	public static JFrame frame = new JFrame("Room 3");
	static Scanner scan = new Scanner(System.in);

	public static void intro() {
		// setting specifications
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		// adding background as a JLabel
		JLabel bg = new JLabel (new ImageIcon("images/room3_bg1.png")); 
		frame.add(bg);

		// read in text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

			str = reader.readLine();
			lbl = new JLabel(str);
			lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			lbl.setBounds(170, 290, 870, 200); 
			bg.add(lbl);

			reader.close();

		}
		// catch any file exceptions
		catch(Exception e) {
			System.out.println("Unable to read txt file");
		}


		// adding first option
		JButton op1 = new JButton("What is your occupation?");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		// adding action listener
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Occupation occ = new Occupation();
				occ.occupation();
			}
		});

		// adding second option
		JButton op2 = new JButton("Why were you at the museum?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				why_At why = new why_At();
				why.museum();
			}
		});

		// setting frame as true
		frame.setVisible(true);
	}
}

//______________________________________________________________________________________________________
//______________________________________________________________________________________________________

/**
 * This class is one of the questions asked by the user
 * @author Mehreen S
 *
 */
class Occupation {
	// setting JFrame
	public static JFrame frame = new JFrame("Room 3");
	static Scanner scan = new Scanner(System.in);

	public static void occupation() {
		// setting specifications
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/room3_bg2.png")); 
		frame.add(bg);

		// read text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

			reader.readLine();
			str = reader.readLine();
			lbl = new JLabel(str);
			lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			lbl.setBounds(170, 290, 870, 200); 
			bg.add(lbl);

			reader.close();

		}
		// catch any exceptions
		catch(Exception e) {
			System.out.println("Couldn't read txt file");
		}

		// creating new options for user
		JButton op1 = new JButton("The mona lisa was stolen last night");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				frame.setVisible(false);
				MonaStolen map = new MonaStolen();
				map.monaLisa();
			}
		});

		// other button option
		JButton op2 = new JButton("Why were you at the museum?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				frame.setVisible(false);
				why_At map = new why_At();
				map.museum();
			}
		});

		// displays frame
		frame.setVisible(true);
	}
}

/**
 * This class is another question
 * @author Mehreen S
 *
 */
class why_At {
	// setting JFrame
	public static JFrame frame = new JFrame("Room 3");
	static Scanner scan = new Scanner(System.in);

	public static void museum() {
		// setting specifications
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/room3_bg1.png")); 
		frame.add(bg);

		// read text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

			reader.readLine();
			reader.readLine();
			str = reader.readLine();
			lbl = new JLabel(str);
			lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			lbl.setBounds(170, 290, 870, 200); 
			bg.add(lbl);

			reader.close();

		}

		// catch any errors
		catch(Exception e) {
			System.out.println("Couldn't read txt file");
		}


		// options for user
		JButton op1 = new JButton("The mona lisa was stolen last night");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				MonaStolen mona = new MonaStolen();
				mona.monaLisa();
			}
		});

		// more options
		JButton op2 = new JButton("What is your occupation?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Occupation occ = new Occupation();
				occ.occupation();
			}
		});
		// frame visible
		frame.setVisible(true);
	}
}

/**
 * This class talks about the stolen painting
 * @author Mehreen S
 *
 */
class MonaStolen {
	// set JFrame and specifications
	public static JFrame frame = new JFrame("Room 3");

	static Scanner scan = new Scanner(System.in);

	public static void monaLisa() {
		// specifications
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/room3_bg2.png")); 
		frame.add(bg);

		// read text files
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

			reader.readLine();
			reader.readLine();
			reader.readLine();
			str = reader.readLine();
			lbl = new JLabel(str);
			lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			lbl.setBounds(170, 290, 870, 200); 
			bg.add(lbl);

			reader.close();

		}
		// catch any exceptions 
		catch(Exception e) {
			System.out.println("Couldn't read txt file");
		}


		// buttons for users
		JButton op1 = new JButton("Did you steal the painting?");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				did_YOU didYou = new did_YOU();
				didYou.didyou();
			}
		});

		// more options
		JButton op2 = new JButton("What do you think of the Mona Lisa?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Thoughts thoughts = new Thoughts();
				thoughts.thoughts();
			}
		});


		frame.setVisible(true);
	}
}

/**
 * This class asks the suspect if he stole it
 * @author Mehreen S
 *
 */
class did_YOU {
	public static JFrame frame = new JFrame("Room 3");

	static Scanner scan = new Scanner(System.in);

	public static void didyou() {
		// specifics
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/room3_bg1.png")); 
		frame.add(bg);

		// read text file
		try {
			JLabel lbl = new JLabel();
			JLabel labl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			Scanner scanner = new Scanner(reader);
			String str, str2 = "";
			bg.setLayout(null);

			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			str = reader.readLine();
			str2 = reader.readLine();
			lbl = new JLabel(str);
			labl = new JLabel(str2);
			lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			lbl.setBounds(170, 280, 870, 200); 
			bg.add(lbl);
			labl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			labl.setBounds(170, 305, 870, 200); 
			bg.add(labl);

			reader.close();

		}

		// catch any excepitons
		catch(Exception e) {
			System.out.println("Couldn't read txt file");
		}

		// creating more buttons for user
		JButton op1 = new JButton("Thank you for your answers.");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room3 back = new Room3();
				back.showroom3();
			}
		});

		//more optiond
		JButton op2 = new JButton("What do you think of the Mona Lisa?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Thoughts thoughts = new Thoughts();
				thoughts.thoughts();
			}
		});

		// display frame
		frame.setVisible(true);
	}
}

/**
 * This class asks the suspect for their thoughts 
 * @author Mehreen
 *
 */
class Thoughts {
	// creating JFrame and specifications
	public static JFrame frame = new JFrame("Room 3");
	static Scanner scan = new Scanner(System.in);

	public static void thoughts() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/room3_bg1.png")); 
		frame.add(bg);

		// reading text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			str = reader.readLine();
			lbl = new JLabel(str);
			lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			lbl.setBounds(170, 290, 870, 200); 
			bg.add(lbl);

			reader.close();

		}

		// cating any exceptions
		catch(Exception e) {
			System.out.println("Couldn't read txt file");
		}


		// adding more options for the user
		JButton op1 = new JButton("Thank you for your answers.");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room3 map = new Room3();
				map.showroom3();
			}
		});

		// more options
		JButton op2 = new JButton("Did you steal the painting?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				did_YOU map = new did_YOU();
				map.didyou(); 
			}
		});

		// set specifications
		frame.setVisible(true);
	}
}
