/**
 * @author annie
 * 06/09/2022
 * Room1 V1
 * Displays a room for the first suspect
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room1 {

	public static JFrame room = new JFrame();
	
	static class searchListener implements ActionListener{
		/**
		 * Detects if user interacts with search button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Hangman hangman = new Hangman();
			Hangman.hangman();
			room.setVisible(false);
		}
	}
	
	static class mapListener implements ActionListener{
		/**
		 * Detects if user interacts with map button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Map map = new Map();
			Map.map();
			room.setVisible(false);
		}
	}
	
	public static void speech(Person speaker, String text) {
		
	}
	
	public static void room1() {
		// Set up
		room.setTitle("Game Title [Placeholder]");
		room.setSize(900,600);
		room.setResizable(false);
		room.setLocationRelativeTo(null);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		room.setLayout(new BorderLayout());

		// Image display
		Icon roomImage = new ImageIcon("Images/placeHolderPerson1.jpg");
		JLabel background = new JLabel(roomImage);
		room.add(background, BorderLayout.CENTER);
		
		// Top Buttons
		JPanel topBar = new JPanel(new GridLayout(1,3));
		JButton map = new JButton("Map");
		map.addActionListener(new mapListener());
		topBar.add(map);
		JLabel name = new JLabel("Namey McNamerson");
		topBar.add(name);
		JButton diary = new JButton("Diary");
		topBar.add(diary);
		room.add(topBar, BorderLayout.NORTH);
		
		// Bottom Buttons
		JPanel bottomBar = new JPanel(new GridLayout(1,2));
		JButton search = new JButton("Search");
		bottomBar.add(search);
		search.addActionListener(new searchListener());
		JButton interrogate = new JButton("Interrogate");
		bottomBar.add(interrogate);
		room.add(bottomBar, BorderLayout.SOUTH);

		room.setVisible(true);
	}

	public static void main(String[] args) {
		room1();
		
		Person char1 = new Person("Bob", new ImageIcon("images/emptySpace.jpg"));
		System.out.println(char1);
	}
}
