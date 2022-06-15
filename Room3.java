import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room3 {
	
	public static JFrame frame = new JFrame("Instructions");
	/**
	 * The main method	
	 * @param String[] args
	 */
	public static void main(String[] args) {
		showroom3();
		// Image display
				//Icon img = new ImageIcon("src/Images/doof.png");
				//JLabel background = new JLabel(img);
				//room3.add(background);
		
		//JLabel label = new JLabel("Dr.Doofenshmirtz");
		//label.setFont(new Font("Diolog", Font.BOLD, 28));
		//label.setBounds(100,10,300,150);
		//frame.add(label);
	}

	public static void showroom3() {
		
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		//frame.setLayout(null);
		frame.setBackground(Color.GRAY);
		
		// Image display
		
		
		
		
		Icon img = new ImageIcon("src/Images/doof.png");
		JLabel background = new JLabel(img);
		frame.add(background);
		
		JLabel label = new JLabel("Dr");
		label.setFont(new Font("Diolog", Font.BOLD, 28));
		label.setBounds(100,10,300,150);
		frame.add(label);
		
		frame.setVisible(true);
		
	}
}
