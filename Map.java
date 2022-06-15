/**
 * 
 * @author annie
 * 06/07/2022
 * Map V1
 * Map screen program for the game, launches a map page with buttons for the rooms and back, clue, and hint buttons
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Map {
	
	/*
	 * This is the frame to display the map class
	 */
	public static JFrame map = new JFrame();
	
	static class notReadyListener implements ActionListener {
		/**
		 * Detects if user interacts with a button that has not been "unlocked"
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			System.out.println("This feature is not yet unlocked!");
		}
	}
	static class backListener implements ActionListener{
		/**
		 * Detects if user interacts with back button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			map.setVisible(false);
			Menu menuPage = new Menu();
			Menu.menuPage();
		}
	}
	
	static class room1Listener implements ActionListener{
		/**
		 * Detects if user interacts with first room button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			map.setVisible(false);
			Room1 room1 = new Room1();
			Room1.room1();
		}
	}
	
	/**
	 * This displays the map frame
	 */
	public static void map() {
		// Frame settings
		map.setTitle("Game Title [Placeholder]");
		map.setSize(900,600);
		map.setResizable(false);
		map.setLocationRelativeTo(null);
		map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		map.setLayout(new BorderLayout());
		
		// Miniature menu to leave game, look at hints, etc.
		JPanel menu = new JPanel(new GridLayout(4,1, 10, 10));
		// Buttons
		menu.add(new JLabel("      Menu"));
		JButton back = new JButton("Back");
		menu.add(back);
		JButton clues = new JButton("Clues");
		menu.add(clues);
		JButton hints = new JButton("Hints");
		menu.add(hints);
		
		// Button functions

		backListener backButton = new backListener();
		back.addActionListener(backButton);
		
		clues.addActionListener(new notReadyListener());
		hints.addActionListener(new notReadyListener());
		
		map.add(menu, BorderLayout.WEST);
		
		// Read file to import a map
		JPanel grid = new JPanel(new GridLayout(24, 30));
		
		// Button array to store buttons for efficiency
		JButton[] buttons = new JButton[6];
		for (int i = 0; i < 6; i++) {
			buttons[i] = new JButton(new ImageIcon("images/emptySpace.jpg"));
		}
		// Count which button we are at for future reference/differentiation
		int count = 0;
		/**
		 * Try to read map data from a text file
		 */
		try {			
			FileReader file = new FileReader("Texts/Map.txt");
			BufferedReader in = new BufferedReader(file);
			// Go through the text file
			for (int row = 0; row < 24; row++) {
				String line = in.readLine();
				for (int column = 0; column < 30; column++) {
					if (Integer.parseInt(line.substring(column, column+1)) == 1) { // fill in grid for the map
						grid.add(new JLabel(new ImageIcon("images/filledSpace.jpg")));
					}
					else if (Integer.parseInt(line.substring(column, column+1)) == 2) {
						switch (count) {
						case 5:
							buttons[count].addActionListener(new room1Listener()); // Room 1
							grid.add(buttons[count]);
							break;
						default:
							buttons[count].addActionListener(new notReadyListener()); // If clicked, say it is has not been "unlocked"
							grid.add(buttons[count]);
							break;
						}
						count++;
					}
					else { // space not occupied by a room
						grid.add(new JLabel(new ImageIcon("images/emptySpace.jpg")));
					}
				}
			}
			in.close();
			map.add(grid, BorderLayout.CENTER);
		}
		catch (IOException e) {
			System.out.println("Error reading file");
		}
		
		map.add(new JPanel(), BorderLayout.EAST);
		
		map.setVisible(true);
	}
	
	/**
	 * The main method	
	 * @param String[] args
	 */
	public static void main(String[] args) {
		map();
	}

}
