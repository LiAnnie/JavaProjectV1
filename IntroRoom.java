/**
 * 
 * @author annie
 * 06/21/2022
 * IntroRoom V1
 * A program that runs the intro room.
 * 
 */
// Import packages for easier utility.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IntroRoom {
	
	// Public variables
	public static JFrame screen = new JFrame();
	
	static class mapListener implements ActionListener{
		/**
		 * Detects if user interacts with map button
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			screen.setVisible(false);
			Map.map();
		}
	}
	
	public static void intro() {
		// GUI Setup
		// ------------------------------------------------------------------------------------------
		// Window display:
		screen.setTitle("Introduction");
		screen.setSize(900,600);
		screen.setResizable(false);
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane pane = new JLayeredPane();
		
		// Background
		JLabel background = new JLabel(new ImageIcon("images/Intro.jpg"));
		pane.add(background, JLayeredPane.DEFAULT_LAYER);
		background.setSize(900,575);
		background.setLocation(-5,0);
		
		// Back Button
		JButton mapButton = new JButton("Map");
		pane.add(mapButton, JLayeredPane.PALETTE_LAYER);
		mapButton.setFont(new Font("Dialog", Font.BOLD, 16));
		mapButton.setSize(200,50);
		mapButton.setLocation(35,25);
		mapButton.addActionListener(new mapListener());
		
		screen.add(pane);
		
		screen.setVisible(true);		
		// ------------------------------------------------------------------------------------------
	}
	/**
	 * Main method, calls the intro method.
	 * @param args
	 */
	public static void main(String[] args) {
		intro();
	}
}
