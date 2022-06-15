// importing all java packages to help functionality
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

/**
 * This program creates a game connected to room 3. The user must guess the
 * passcode to Dr.Doof's vault and search for additional clues.
 * @author Mehreen Shaikh
 */

public class Room3_Game{
	// declaring all JFrame, JLabel, and JButtons
	public static JFrame frame = new JFrame("Room 3");

	/**
	 * The main method
	 * @param args
	 */
	public static void main(String[] args) {
		// calling the game page
		gamePage();
	}


	// This method creates the game page as well as the set up
	public static void gamePage() {
		// setting JFrame specifications
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// adding background
		JLabel bg = new JLabel (new ImageIcon("images/bg.jpg"));
		frame.add(bg);

		// adding text for Doof
		JLabel lab = new JLabel("<html><body>Hmph, you wish to search me? Very well you may check my vault.<br>However I do not remember the code...</body></html>");
		lab.setFont(new Font("Diolog", Font.BOLD, 18));
		lab.setBounds(100, 330, 870, 150);
		bg.add(lab);

		// adding text box
		Icon img = new ImageIcon("images/rect.png");
		JLabel background = new JLabel(img);
		bg.setLayout(null);
		background.setBounds(10, 350, 870, 150);
		bg.add(background); 

		// importing Dr.Doof
		Icon img2 = new ImageIcon("images/doof.png");
		JLabel lbl1 = new JLabel(img2);
		lbl1.setBounds(0, 10, 800, 600);
		bg.add(lbl1);

		JLabel lbl2 = new JLabel("Dr.Doof");
		lbl2.setFont(new Font("Diolog", Font.BOLD, 36));
		lbl2.setBounds(200, 90, 200, 70);
		bg.add(lbl2);

		// this button leads the player into the vault page
		JButton inter = new JButton("Continue");
		inter.setBounds(550, 440, 150, 50);
		bg.add(inter);
		inter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				vault_closed map = new vault_closed();
				map.vaultGuess();
			}
		});


		frame.setVisible(true);

	}
}


// this class is displayed if the user does not guess the code
class TryAgain{
	// declaring all JFrame, JLabel, and JButtons
	public static JFrame frame = new JFrame("Room 3");

	/**
	 * The main method
	 * @param args
	 */
	public static void main(String[] args) {
		tryagain();
	}


	// This method displays doof giving an error message and prompts user to try again
	public static void tryagain() {
		// set specifications
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// set bg
		JLabel bg = new JLabel (new ImageIcon("images/bg.jpg"));
		frame.add(bg);

		// error message prompting to try again
		JLabel lab = new JLabel("Well I don't remember, try again...");
		lab.setFont(new Font("Diolog", Font.BOLD, 18));
		lab.setBounds(100, 330, 870, 150);
		bg.add(lab);

		Icon img = new ImageIcon("images/rect.png");
		JLabel background = new JLabel(img);
		bg.setLayout(null);
		background.setBounds(10, 350, 870, 150);
		bg.add(background); 
		
		Icon img2 = new ImageIcon("images/doof.png");
		JLabel lbl1 = new JLabel(img2);
		lbl1.setBounds(0, 10, 800, 600);
		bg.add(lbl1);

		JLabel lbl2 = new JLabel("Dr.Doof");
		lbl2.setFont(new Font("Diolog", Font.BOLD, 36));
		lbl2.setBounds(200, 90, 200, 70);
		bg.add(lbl2);

		// this button prompts the user to go back to the vault and try again
		JButton inter = new JButton("Try Again");
		inter.setBounds(550, 440, 150, 50);
		bg.add(inter);
		inter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				vault_closed map = new vault_closed();
				map.vaultGuess();
			}
		});
		
		frame.setVisible(true);
	}
}

// this class is where the closed vault and guessing game is located
class vault_closed {
	// declaring frame and variables
	public static JFrame frame = new JFrame("Room 3");
	public static JLabel correct = new JLabel();
	public static JLabel incorrect = new JLabel();
	public static JLabel bg;


	// This method checks to see if the user entered code correct
	public static boolean check (String j) {
		int numba = Integer.parseInt(j);

		if (numba == 2658) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// this method is the guessing game
	public static void vaultGuess() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// display the vault bg
		bg = new JLabel (new ImageIcon("images/vault closed.jpg"));
		frame.add(bg);

		// add textfield to store guesses
		JTextField sun = new JTextField(4);
		sun.setBounds(700, 70, 150, 50);
		bg.add(sun);

		// button to check user input
		JButton go = new JButton("Go!");
		go.setBounds(700, 150, 70, 50);
		bg.add(go);
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				String text = sun.getText();
				// if user guess is correct
				if (check(text) == true ) {
					text = "";
					sun.setText(""); 
					frame.setVisible(false);
					vault_open map = new vault_open();
					map.openVault();

				}
				// if user guess is incorrect
				else {
					frame.setVisible(false);
					TryAgain map = new TryAgain();
					map.tryagain();
					text = "";
					sun.setText("");
				}
			}
		});


		frame.setVisible(true);
	}
}

class vault_open{
	// declaring JFrame and specifications
	public static JFrame frame = new JFrame("Room 3");
	public static void main(String[] args) {
		openVault();
	}
	public static void openVault() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		// display new bg
		JLabel bg = new JLabel (new ImageIcon("images/vault opened.jpg"));
		frame.add(bg);
		
		// add JLabel telling the situation
		JLabel lab = new JLabel("Hmmm nothing suspicious here...");
		lab.setFont(new Font("Diolog", Font.BOLD, 18));
		lab.setBounds(260, 380, 450, 130);
		bg.add(lab);

		Icon img = new ImageIcon("images/rect.png");
		JLabel background = new JLabel(img);
		bg.setLayout(null);
		background.setBounds(210, 400, 450, 130);
		bg.add(background); 
		
		// Back button leading to Room3
		JButton inter = new JButton("Go Back");
		inter.setBounds(500, 460, 150, 50);
		bg.add(inter);
		//playListener interrogate = new playListener();
		inter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Room3 map = new Room3();
				map.showroom3();
			}
		});
		
		frame.setVisible(true);

	}
} // end of class
