/**
 * @author annie
 * 06/09/2022
 * Room1 V1
 * Displays a room for the first suspect
 */
// Import packages for easy utility.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room1 {
	// Public variables to make accessible in all methods.
	public static JLayeredPane pane = new JLayeredPane();
	public static JFrame room = new JFrame();
	public static JFrame inter = new JFrame();
	public static JLayeredPane pane2 = new JLayeredPane();
	public static String answer2;
	public static JLabel ans = new JLabel();

	static class searchListener implements ActionListener{
		/**
		 * Detects if user interacts with search button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			TicTacToe.ttt();
			room.setVisible(false);
		}
	}
	static class backListener implements ActionListener{
		/**
		 * Detects if user interacts with back button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			pane2.remove(ans);
			inter.setVisible(false);
			room1();
		}
	}
	static class mapListener implements ActionListener{
		/**
		 * Detects if user interacts with map button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Map.map();
			room.setVisible(false);
		}
	}
	static class interrogateListener implements ActionListener{
		/**
		 * Detects if user interacts with interrogate button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			interrogate();
			room.setVisible(false);
		}
	}
	static class q1Listener implements ActionListener{
		/**
		 * Detects if user interacts with first question button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ans.setText("I am the director of this museum.");
		}
	}
	static class q2Listener implements ActionListener{
		/**
		 * Detects if user interacts with second question button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ans.setText("Monsieur Pierre is a regular and he has the greatest motive.");
		}
	}
	static class q3Listener implements ActionListener{
		/**
		 * Detects if user interacts with third question button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ans.setText("Why would I steal a painting from my own museum? Proposterous! ");
		}
	}
	/**
	 * Displays the first room.
	 */
	public static void room1() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		room.setTitle("Room 1");
		room.setSize(900,600);
		room.setResizable(false);
		room.setLocationRelativeTo(null);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		room.setLayout(new BorderLayout());

		// Background
		JLabel roomImage = new JLabel(new ImageIcon("images/Room1.jpg"));
		pane.add(roomImage, JLayeredPane.DEFAULT_LAYER);
		roomImage.setSize(900,575);
		roomImage.setLocation(0,0);

		// Buttons
		JButton interrogate = new JButton("Interrogate");
		pane.add(interrogate, JLayeredPane.PALETTE_LAYER);
		interrogate.setSize(200,50);
		interrogate.setLocation(550, 450);
		interrogate.addActionListener(new interrogateListener());

		JButton search = new JButton("Search");
		pane.add(search, JLayeredPane.PALETTE_LAYER);
		search.setSize(200,50);
		search.setLocation(150, 450);
		search.addActionListener(new searchListener());

		JButton back = new JButton("Map");
		pane.add(back, JLayeredPane.PALETTE_LAYER);
		back.setSize(200,50);
		back.setLocation(25, 25);
		back.addActionListener(new mapListener());

		// Speech
		JLabel speech = new JLabel("I am the esteemed Augusta Horace the third. How can I be of assistance to you?");
		pane.add(speech, JLayeredPane.PALETTE_LAYER);
		speech.setFont(new Font("Diolog", Font.BOLD, 16));
		speech.setSize(650,50);
		speech.setLocation(150, 385);

		room.add(pane);
		room.setVisible(true);
		// ------------------------------------------------------------------------------------------
	}
	/**
	 * Displays the interrogation screen.
	 */
	public static void interrogate() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		inter.setTitle("Room 1");
		inter.setSize(900,600);
		inter.setResizable(false);
		inter.setLocationRelativeTo(null);
		inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inter.setLayout(new BorderLayout());

		// Background
		JLabel roomImage = new JLabel(new ImageIcon("images/Room1.jpg"));
		pane2.add(roomImage, JLayeredPane.DEFAULT_LAYER);
		roomImage.setSize(900,575);
		roomImage.setLocation(0,0);
		inter.add(pane2);

		// Buttons
		JButton back = new JButton("Back");
		pane2.add(back, JLayeredPane.PALETTE_LAYER);
		back.setSize(200,50);
		back.setLocation(25, 25);
		back.addActionListener(new backListener());

		// Question 1:
		JButton q1 = new JButton("What is your occupation?");
		pane2.add(q1, JLayeredPane.PALETTE_LAYER);
		q1.setSize(190,50);
		q1.setLocation(150, 450);
		q1.addActionListener(new q1Listener());
		// Question 2:
		JButton q2 = new JButton("Do you have any suspicions?");
		pane2.add(q2, JLayeredPane.PALETTE_LAYER);
		q2.setSize(200,50);
		q2.setLocation(350, 450);
		q2.addActionListener(new q2Listener());
		// Question 3:
		JButton q3 = new JButton("Did you steal the painting?");
		pane2.add(q3, JLayeredPane.PALETTE_LAYER);
		q3.setSize(190,50);
		q3.setLocation(560, 450);
		q3.addActionListener(new q3Listener());


		// Speech
		answer2 = "Do you have any questions?";
		ans.setText(answer2);
		pane2.add(ans, JLayeredPane.PALETTE_LAYER);
		ans.setFont(new Font("Diolog", Font.BOLD, 18));
		ans.setSize(600,50);
		ans.setLocation(150, 385);

		inter.setVisible(true);
		// ------------------------------------------------------------------------------------------
	}
	/**
	 * Main method that calls room1 method.
	 * @param args
	 */
	public static void main(String[] args) {
		room1();
	}
}
