/**
 * @author annie
 * 06/09/2022
 * Room2 V1
 * Displays a room for the second suspect
 */

// Import packages for easy utility.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room2 {
	
	// Public variables to be accessible in all methods.
	public static JLayeredPane pane = new JLayeredPane();
	public static JFrame room = new JFrame();
	public static JFrame inter = new JFrame();
	public static JLayeredPane pane2 = new JLayeredPane();
	public static String answer2;
	public static JLabel ans2 = new JLabel();

	static class searchListener implements ActionListener{
		/**
		 * Detects if user interacts with search button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			Hangman.hangman();
			room.setVisible(false);
		}
	}
	static class backListener implements ActionListener{
		/**
		 * Detects if user interacts with back button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			pane2.remove(ans2);
			inter.setVisible(false);
			room2();
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
			ans2.setText("I am an art connoisseur.");
		}
	}
	static class q2Listener implements ActionListener{
		/**
		 * Detects if user interacts with second question button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ans2.setText("I was admiring the new displays put up.");
		}
	}
	static class q3Listener implements ActionListener{
		/**
		 * Detects if user interacts with third question button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ans2.setText("I would never do something as underhanded as that!");
		}
	}
	/**
	 * Displays the second room.
	 */
	public static void room2() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		room.setTitle("Room 2");
		room.setSize(900,600);
		room.setResizable(false);
		room.setLocationRelativeTo(null);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		room.setLayout(new BorderLayout());

		// Background
		JLabel roomImage = new JLabel(new ImageIcon("images/Room2.jpg"));
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
		JLabel speech = new JLabel("Greetings, my name is Pierre leRoy. Can I help you?");
		pane.add(speech, JLayeredPane.PALETTE_LAYER);
		speech.setFont(new Font("Diolog", Font.BOLD, 18));
		speech.setSize(500,50);
		speech.setLocation(175, 385);

		room.add(pane);
		room.setVisible(true);
		// ------------------------------------------------------------------------------------------
	}
	/**
	 * Displays the interrogation room.
	 */
	public static void interrogate() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		inter.setTitle("Room 2");
		inter.setSize(900,600);
		inter.setResizable(false);
		inter.setLocationRelativeTo(null);
		inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inter.setLayout(new BorderLayout());

		// Background
		JLabel roomImage = new JLabel(new ImageIcon("images/Room2.jpg"));
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
		q1.setLocation(155, 450);
		q1.addActionListener(new q1Listener());
		// Question 2:
		JButton q2 = new JButton("Why were you there?");
		pane2.add(q2, JLayeredPane.PALETTE_LAYER);
		q2.setSize(190,50);
		q2.setLocation(355, 450);
		q2.addActionListener(new q2Listener());
		// Question 3:
		JButton q3 = new JButton("Did you steal the painting?");
		pane2.add(q3, JLayeredPane.PALETTE_LAYER);
		q3.setSize(190,50);
		q3.setLocation(555, 450);
		q3.addActionListener(new q3Listener());

		// Speech
		answer2 = "Do you have any questions?";
		ans2.setText(answer2);
		pane2.add(ans2, JLayeredPane.PALETTE_LAYER);
		ans2.setFont(new Font("Diolog", Font.BOLD, 18));
		ans2.setSize(500,50);
		ans2.setLocation(175, 385);

		inter.setVisible(true);
		// ------------------------------------------------------------------------------------------
	}
	/**
	 * Main method that calls room2 method.
	 * @param args
	 */
	public static void main(String[] args) {
		room2();
	}
}
