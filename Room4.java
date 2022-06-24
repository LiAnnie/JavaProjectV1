import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/* This program displays a room with a suspect in it. The room has two buttons
 * search and interrogate, each having different functionalities. The search button
 * leads to room4_game
 * @author Mehreen Shaikh
 */

public class Room4{
	// creating the jframe
	public static JFrame frame = new JFrame("Room 4");
	public static JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg"));

	/**
	 * The main method	
	 * @param String[] args
	 */
	public static void main(String[] args) {
		showroom4();

	}

	/**
	 * This method sets up the frame
	 */
	public static void showroom4() {
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
		/**
		 * Adds action listener
		 */
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		/**
		 * Creates interrogate button
		 */
		JButton inter = new JButton("Interrogate");
		inter.setBounds(550, 440, 150, 50);
		bg.add(inter);
		// adds action listener
		inter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Interrogate2 inte = new Interrogate2();
				inte.intro2();
			}
		});

		// button for search
		JButton search = new JButton("Search");
		search.setBounds(200, 440, 150, 50);
		bg.add(search);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4_Game search = new Room4_Game();
				search.compscreen();
			}
		});
		// displays frame
		frame.setVisible(true);		
	}

}// end of showroom4 class


/**
 * This class focuses on the interogations
 * @author Mehreen S
 *
 */
class Interrogate2 {
	// recreating frame and specifications
	public static JFrame frame = new JFrame("Room 4");

	static Scanner scan = new Scanner(System.in);

	public static void intro2() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);
		JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg")); 
		frame.add(bg);

		// read in text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomFour.txt"));
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

		// adding JButton back
		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// adding first option
		JButton op1 = new JButton("What is your occupation?");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		// Action Listener
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Occupation2 occ2 = new Occupation2();
				occ2.occupation2();
			}
		});

		// adding second option
		JButton op2 = new JButton("Why were you at the museum?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		// Action listener
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				why_At2 why2 = new why_At2();
				why2.museum2();
			}
		});
		// displays frame
		frame.setVisible(true);
	}
}

//______________________________________________________________________________________________________
//______________________________________________________________________________________________________

/**
 * This class answers more questions
 * @author Mehreen S
 *
 */
class Occupation2 {
	// setting frame and specifications
	public static JFrame frame = new JFrame("Room 3");
	static Scanner scan = new Scanner(System.in);

	public static void occupation2() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);


		JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg")); 
		frame.add(bg);

		// read text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomFour.txt"));
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
			System.out.println("Could not read txt file");
		}

		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// creating new options for user
		JButton op1 = new JButton("The mona lisa was stolen last night");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				frame.setVisible(false);
				MonaStolen2 map = new MonaStolen2();
				map.monaLisa2();
			}
		});

		JButton op2 = new JButton("Why were you at the museum?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				frame.setVisible(false);
				why_At2 map = new why_At2();
				map.museum2();
			}
		});


		frame.setVisible(true);
	}
}

/**
 * This class answers why they were at museum
 * @author Mehreen 
 *
 */
class why_At2 {
	// setting Jframe and specificiations
	public static JFrame frame = new JFrame("Room 4");
	static Scanner scan = new Scanner(System.in);

	// void method for showing frame
	public static void museum2() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg")); 
		frame.add(bg);

		// read text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomFour.txt"));
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

		// catch any exceptions
		catch(Exception e) {
			System.out.println("Could not read txt file");
		}

		// adding the back button
		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		// action listener for button
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// options for user
		JButton op1 = new JButton("The mona lisa was stolen last night");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				MonaStolen2 map = new MonaStolen2();
				map.monaLisa2();
			}
		});

		// another button for the user
		JButton op2 = new JButton("What is your occupation?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Occupation2 map = new Occupation2();
				map.occupation2();
			}
		});
		// displays the screen
		frame.setVisible(true);
	}
}

/**
 * This class answers the mona lisa question
 * @author Mehreen
 *
 */
class MonaStolen2 {
	// set JFrame and specifications
	public static JFrame frame = new JFrame("Room 4");
	static Scanner scan = new Scanner(System.in);

	public static void monaLisa2() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg")); 
		frame.add(bg);

		// read text files
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomFour.txt"));
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
			System.out.println("Could not read txt file");
		}

		// creates back button back to map
		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// buttons for users
		JButton op1 = new JButton("You don't seem very interessted...");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				did_YOU2 you2 = new did_YOU2();
				you2.didyou2();
			}
		});

		// adds new button
		JButton op2 = new JButton("Well, what do you do in your job?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		// adding option listener
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				whatJob job = new whatJob();
				job.thoughts2();
			}
		});
		// displays frame
		frame.setVisible(true);
	}
}

/**
 * This class answers more questions
 * @author Mehree
 *
 */
class did_YOU2 {
	// creat JFrame and pecifications
	public static JFrame frame = new JFrame("Room 4");

	static Scanner scan = new Scanner(System.in);

	public static void didyou2() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);


		JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg")); 
		frame.add(bg);

		// read text file
		try {
			JLabel lbl = new JLabel();
			JLabel labl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomFour.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

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
		// catches any exceptions
		catch(Exception e) {
			System.out.println("Could not read txt file");
		}

		// setting back button that leads to map
		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});

		// creating more buttons for user
		JButton op1 = new JButton("Thank you for your answers.");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4 room4 = new Room4();
				room4.showroom4();
			}
		});

		// adding second option
		JButton op2 = new JButton("Well, what do you do in your job?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		// adding action listener
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				whatJob job = new whatJob();
				job.thoughts2();
			}
		});
		// sets frame as visible
		frame.setVisible(true);
	}
}

/**
 * This class answers what they do as their job
 * @author Mehreen
 *
 */
class whatJob {
	// creating JFrame and specifications
	public static JFrame frame = new JFrame("Room 4");

	static Scanner scan = new Scanner(System.in);
	public static void thoughts2() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);


		JLabel bg = new JLabel (new ImageIcon("images/room4_bg.jpg")); 
		frame.add(bg);

		// reading text file
		try {
			JLabel lbl = new JLabel();
			BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomFour.txt"));
			Scanner scanner = new Scanner(reader);
			String str = "";
			bg.setLayout(null);

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

		// catch any exceptions
		catch(Exception e) {
			System.out.println("Could not read txt file");
		}

		// creates back button
		JButton back = new JButton("Map");
		back.setBounds(50, 30, 150, 50);
		bg.add(back);
		// Action Listener
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
		});
		// adding more options for the user
		JButton op1 = new JButton("Thank you for your answers.");
		op1.setBounds(550, 440, 250, 50);
		bg.add(op1);
		// Action listener
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room4 room4 = new Room4();
				room4.showroom4();
			}
		});

		// creating second button
		JButton op2 = new JButton("Did you steal the painting?");
		op2.setBounds(100, 440, 250, 50);
		bg.add(op2);
		// adding action listener
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				did_YOU2 you2 = new did_YOU2();
				you2.didyou2(); 
			}
		});

		// sets frame visible
		frame.setVisible(true);
	}
}