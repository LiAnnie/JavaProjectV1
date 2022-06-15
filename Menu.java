// importing all java packages to help functionality
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

/**
 * This program displays a basic main menu, as well as three buttons; Start, Instructions, 
 * Back. This page follows the Title Page. The start button will lead to the map menu, 
 * instruction button to the instructions page, and back button to the title page. 
 * @author Mehreen Shaikh
 */

public class Menu extends JPanel{
	// declaring all JFrame, JLabel, and JButtons
	public static JFrame new_frame = new JFrame("Version 1");
	public static JLabel names = new JLabel ("<html><body>Annie Li<br>Mehreen Shaikh</body></html>");
	public static JButton start, instruction, route, exit;
	public static JLabel title = new JLabel("Game Name");
	
	/**
	 * The main method
	 * @param args
	 */
	public static void main(String[] args) {
		menuPage();
	}
	
	
	// This method creates the menu page screen, as well as all the buttons
	// and their funtions
	public static void menuPage() {
		new_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new_frame.setResizable(false);
		new_frame.setSize(900, 600);
		new_frame.getContentPane().setBackground(Color.GRAY);
		new_frame.setLocationRelativeTo(null);
		
		//TITLE LABEL
		title.setFont(new Font("Diolog", Font.BOLD, 47));
		title.setBounds(100, 70, 300, 200);
		new_frame.add(title);
		
		//NAMES LABEL
		names.setFont(new Font("Diolog", Font.BOLD, 18));
		names.setBounds(100, 370, 300, 200);
		new_frame.add(names);
		
		//START BUTTON
		JButton start = new JButton("Start");
		start.setBackground(Color.RED);
		new_frame.setLayout(null);
		start.setFont(new Font("Diolog", Font.BOLD, 18));
		start.setBounds(600, 100, 150, 50);
		new_frame.add(start);
		start.addActionListener(new ActionListener() {

			@Override
			/**
			 * This connects the start button to the map page
			 * @param action
			 */
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				new_frame.setVisible(false);
				Map map = new Map();
				map.map();
			}
			
		});
		
		// INSTRUCTIONS BUTTON
		JButton instructions = new JButton("Instructions");
		instructions.setBackground(Color.RED);
		instructions.setFont(new Font("Diolog", Font.BOLD, 18));
		instructions.setBounds(600, 200, 150, 50);
		new_frame.add(instructions);
		instructions.addActionListener(new ActionListener() {

			@Override
			/**
			 * This connects the Instruction button to the Instructions page
			 * @param action
			 */
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				new_frame.setVisible(false);
				Instructions w2 = new Instructions();
				w2.showInstructions();
			}
			
		});
		
		
		//BACK BUTTON
		JButton back = new JButton("Back");
		back.setBackground(Color.RED);
		back.setFont(new Font("Diolog", Font.BOLD, 18));
		back.setBounds(600, 300, 150, 50);
		new_frame.add(back);
		back.addActionListener(new ActionListener() {

			@Override
			/**
			 * This connects the Back button to the Title page
			 * @param action
			 */
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				new_frame.setVisible(false);
				TitlePage titlepage = new TitlePage();
				titlepage.titlePage();
			}
			
		});
		
		// this sets the frame to be displayed
		new_frame.setVisible(true);
	}
}