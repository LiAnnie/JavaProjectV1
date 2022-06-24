/**
 * @author annie
 * 06/21/2022
 * TicTacToe V1
 * A program that runs the tic tac toe game.
 */

// Import packages for easy utility.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
	// Public variables to be accessible in all methods.
	public static JLayeredPane pane = new JLayeredPane();
	public static JFrame screen = new JFrame();
	public static Component[] grid = new Component[9];
	public static int[] refer = new int[9];
	public static int spaces = 9;
	public static JFrame win = new JFrame();
	public static JLayeredPane pane2 = new JLayeredPane();
	public static JFrame lose = new JFrame();
	public static JFrame win1 = new JFrame();

	static class mapListener implements ActionListener{
		/**
		 * Detects if user interacts with map button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Map.map();
			screen.setVisible(false);
			win.setVisible(false);
			lose.setVisible(false);
			win1.setVisible(false);
		}
	}
	static class roomListener implements ActionListener{
		/**
		 * Detects if user interacts with room button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Room1.room1();
			screen.setVisible(false);
			win.setVisible(false);
			lose.setVisible(false);
			win1.setVisible(false);
		}
	}
	/**
	 * This checks to see if the computer should make a move and displays the different screens.
	 */
	public static void computer() {
		// If player wins:
		if (check()) {
			win.setTitle("You Win!");
			win.setSize(300,100);
			win.setResizable(false);
			win.setLocationRelativeTo(null);

			win.add(new JLabel("Congratulations, you won!", SwingConstants.CENTER));
			win();
			win.setVisible(true);
		}
		// If player does not win and there are no spaces left (tie, but results in same as lost game):
		else if (spaces == 0) {
			lose.setTitle("Game Lost");
			lose.setSize(300,100);
			lose.setResizable(false);
			lose.setLocationRelativeTo(null);

			lose.add(new JLabel("Unfortunately, you did not win.", SwingConstants.CENTER), BorderLayout.CENTER);
			screen.setVisible(false);
			ttt();
			lose.setVisible(true);
		}
		// Game lost:
		else {
			computerMove();
			if (check()) {
				lose.setTitle("Game Lost");
				lose.setSize(300,100);
				lose.setResizable(false);
				lose.setLocationRelativeTo(null);

				lose.add(new JLabel("Unfortunately, you did not win.", SwingConstants.CENTER), BorderLayout.CENTER);
				screen.setVisible(false);
				ttt();
				lose.setVisible(true);
			}
		}
	}
	static class listener0 implements ActionListener{
		/**
		 * Detects if user interacts with first button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[0] == 0) {
				refer[0] = 1;
				grid[0] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[0], JLayeredPane.MODAL_LAYER);
				grid[0].setSize(80,80);
				grid[0].setLocation(435, 140);
				spaces--;
				computer();
			}
		}
	}
	static class listener1 implements ActionListener{
		/**
		 * Detects if user interacts with second button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[1] == 0) {
				refer[1] = 1;
				grid[1] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[1], JLayeredPane.MODAL_LAYER);
				grid[1].setSize(80,80);
				grid[1].setLocation(565, 140);
				spaces--;

				computer();
			}
		}
	}
	static class listener2 implements ActionListener{
		/**
		 * Detects if user interacts with third button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[2] == 0) {
				refer[2] = 1;
				grid[2] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[2], JLayeredPane.MODAL_LAYER);
				grid[2].setSize(80,80);
				grid[2].setLocation(700, 140);
				spaces--;

				computer();
			}
		}
	}
	static class listener3 implements ActionListener{
		/**
		 * Detects if user interacts with fourth button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[3] == 0) {
				refer[3] = 1;
				grid[3] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[3], JLayeredPane.MODAL_LAYER);
				grid[3].setSize(80,80);
				grid[3].setLocation(435, 275);
				spaces--;

				computer();
			}
		}
	}
	static class listener4 implements ActionListener{
		/**
		 * Detects if user interacts with fifth button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[4] == 0) {
				refer[4] = 1;
				grid[4] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[4], JLayeredPane.MODAL_LAYER);
				grid[4].setSize(80,80);
				grid[4].setLocation(565, 275);
				spaces--;

				computer();
			}
		}
	}
	static class listener5 implements ActionListener{
		/**
		 * Detects if user interacts with sixth button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[5] == 0) {
				refer[5] = 1;
				grid[5] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[5], JLayeredPane.MODAL_LAYER);
				grid[5].setSize(80,80);
				grid[5].setLocation(700, 275);
				spaces--;

				computer();
			}
		}
	}
	static class listener6 implements ActionListener{
		/**
		 * Detects if user interacts with seventh button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[6] == 0) {
				refer[6] = 1;
				grid[6] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[6], JLayeredPane.MODAL_LAYER);
				grid[6].setSize(80,80);
				grid[6].setLocation(435, 410);
				spaces--;

				computer();
			}
		}
	}
	static class listener7 implements ActionListener{
		/**
		 * Detects if user interacts with eighth button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[7] == 0) {
				refer[7] = 1;
				grid[7] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[7], JLayeredPane.MODAL_LAYER);
				grid[7].setSize(80,80);
				grid[7].setLocation(565, 410);
				spaces--;

				computer();
			}
		}
	}
	static class listener8 implements ActionListener{
		/**
		 * Detects if user interacts with ninth button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			if (refer[8] == 0) {
				refer[8] = 1;
				grid[8] = new JLabel(new ImageIcon("images/x.jpg"));
				pane.add(grid[8], JLayeredPane.MODAL_LAYER);
				grid[8].setSize(80,80);
				grid[8].setLocation(700, 410);
				spaces--;

				computer();
			}
		}
	}
	static class instructionListener implements ActionListener{
		/**
		 * Detects if user interacts with instructions button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			TTTInstructions.instructions();
			// Close all other frames
			screen.setVisible(false);
			win.setVisible(false);
			lose.setVisible(false);
		}
	}
	/**
	 * This displays the winning screen.
	 */
	public static void win() {
		// Show win screen with clue
		screen.setVisible(false);
		win1.setTitle("Clue 1");
		win1.setSize(900,600);
		win1.setResizable(false);
		win1.setLocationRelativeTo(null);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setVisible(true);

		// Return to map button
		JButton map = new JButton("Map");
		pane2.add(map, JLayeredPane.PALETTE_LAYER);
		map.setSize(200,50);
		map.setLocation(25, 25);
		map.addActionListener(new mapListener());
		win1.add(pane2);

		// Background
		JLabel Background = new JLabel(new ImageIcon("images/Clue1.jpg"));
		pane2.add(Background, JLayeredPane.DEFAULT_LAYER);
		Background.setSize(1000,700);
		Background.setLocation(-60,-65);
		
	}
	/**
	 * Returns whether there is three in a row or not.
	 * @return
	 */
	public static boolean check() {
		if (refer[0] == refer[1] && refer[0] == refer[2] && refer[0] != 0) {
			return true;
		}
		else if (refer[3] == refer[4] && refer[3] == refer[5] && refer[5] != 0) {
			return true;
		}
		else if (refer[6] == refer[7] && refer[6] == refer[8] && refer[8] != 0) {
			return true;
		}
		else if (refer[0] == refer[3] && refer[3] == refer[6] && refer[6] != 0) {
			return true;
		}
		else if (refer[1] == refer[4] && refer[1] == refer[7] && refer[7] != 0) {
			return true;
		}
		else if (refer[2] == refer[5] && refer[2] == refer[8] && refer[8] != 0) {
			return true;
		}
		else if (refer[0] == refer[4] && refer[0] == refer[8] && refer[8] != 0) {
			return true;
		}
		else if (refer[2] == refer[4] && refer[2] == refer[6] && refer[6] != 0) {
			return true;
		}
		return false;
	}
	/**
	 * This is how the computer makes a move.
	 */
	public static void computerMove() {
		int move = (int)Math.ceil(Math.random()*spaces); // Randomly generate a move from number of spots available
		int count = 0;
		for (int i = 0; i < 9; i++) {
			if (refer[i] == 0) {
				count++;
			}
			if (count == move) {
				refer[i] = 2;
				grid[i] = new JLabel(new ImageIcon("images/o.jpg"));
				pane.add(grid[i], JLayeredPane.MODAL_LAYER);
				grid[i].setSize(80,80);
				switch (i) { // Setting locations of the panels/icons
				case 0:
					grid[i].setLocation(435, 140);
					break;
				case 1:
					grid[i].setLocation(565, 140);
					break;
				case 2:
					grid[i].setLocation(700, 140);
					break;
				case 3:
					grid[i].setLocation(435, 275);
					break;
				case 4:
					grid[i].setLocation(565, 275);
					break;
				case 5:
					grid[i].setLocation(700, 275);
					break;
				case 6:
					grid[i].setLocation(435, 410);
					break;
				case 7:
					grid[i].setLocation(565, 410);
					break;
				case 8:
					grid[i].setLocation(700, 410);
					break;
				}
				spaces--;
				break;
			}
		}
	}
	/**
	 * Main tic tac toe method, displays the game screen.
	 */
	public static void ttt() {
		// Reset public variables
		pane = new JLayeredPane();
		screen = new JFrame();
		grid = new Component[9];
		refer = new int[9];
		spaces = 9;

		// GUI Display Section:
		// ------------------------------------------------------------------------------------------
		screen.setTitle("TicTacToe");
		screen.setSize(900,600);
		screen.setResizable(false);
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Background
		JLabel ticBackground = new JLabel(new ImageIcon("images/tictacBackground.jpg"));
		pane.add(ticBackground, JLayeredPane.DEFAULT_LAYER);
		ticBackground.setSize(1000,700);
		ticBackground.setLocation(-60,-65);

		// Grid Setup
		Component[] grid = new Component[9];
		for (int i = 0; i < 9; i++) {
			grid[i] = new JButton(new ImageIcon("images/empty.jpg"));
			pane.add(grid[i], JLayeredPane.PALETTE_LAYER);
			grid[i].setSize(80, 80);
		}

		grid[0].setLocation(435, 140);
		((JButton)grid[0]).addActionListener(new listener0());
		grid[1].setLocation(565, 140);
		((JButton)grid[1]).addActionListener(new listener1());
		grid[2].setLocation(700, 140);
		((JButton)grid[2]).addActionListener(new listener2());
		grid[3].setLocation(435, 275);
		((JButton)grid[3]).addActionListener(new listener3());
		grid[4].setLocation(565, 275);
		((JButton)grid[4]).addActionListener(new listener4());
		grid[5].setLocation(700, 275);
		((JButton)grid[5]).addActionListener(new listener5());
		grid[6].setLocation(435, 410);
		((JButton)grid[6]).addActionListener(new listener6());
		grid[7].setLocation(565, 410);
		((JButton)grid[7]).addActionListener(new listener7());
		grid[8].setLocation(700, 410);
		((JButton)grid[8]).addActionListener(new listener8());

		// Buttons
		JButton map = new JButton("Map");
		pane.add(map, JLayeredPane.PALETTE_LAYER);
		map.setSize(200,50);
		map.setLocation(25, 100);
		map.addActionListener(new mapListener());

		JButton room = new JButton("Room");
		pane.add(room, JLayeredPane.PALETTE_LAYER);
		room.setSize(200,50);
		room.setLocation(25, 25);
		room.addActionListener(new roomListener());

		JButton instructions = new JButton("Instructions");
		pane.add(instructions, JLayeredPane.PALETTE_LAYER);
		instructions.setSize(200,50);
		instructions.setLocation(25, 475);
		instructions.addActionListener(new instructionListener());
		// ------------------------------------------------------------------------------------------

		screen.add(pane);
		screen.setVisible(true);
	}
	/**
	 * Main method, calls the tic tac toe method.
	 * @param args
	 */
	public static void main(String[] args) {
		ttt();
	}
}
