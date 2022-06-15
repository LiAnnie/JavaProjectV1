/**
 * This program displays a room with a suspect in it. The room has two buttons
 * search and interrogate, each having different functionalities. The search button
 * leads to room3_game
 * @author Mehreen Shaikh
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Room3{
	// creating the jframe
	public static JFrame frame = new JFrame("Room 3");
	
	/**
	 * The main method	
	 * @param String[] args
	 */
	public static void main(String[] args) {
		showroom3();

	}

	public static void showroom3() {
		// setting specifications of the JFrame
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);
		
		// setting background image
		JLabel bg = new JLabel (new ImageIcon("images/bg.jpg"));
		frame.add(bg);

		// creating text box image
		Icon img = new ImageIcon("images/rect.png");
		JLabel background = new JLabel(img);
		bg.setLayout(null);
		background.setBounds(10, 350, 870, 150);
		bg.add(background); 
		
		// importing person image
		Icon img2 = new ImageIcon("images/doof.png");
		JLabel lbl1 = new JLabel(img2);
		lbl1.setBounds(0, 10, 800, 600);
		bg.add(lbl1);

		// suspect name
		JLabel lbl2 = new JLabel("Dr.Doof");
		lbl2.setFont(new Font("Diolog", Font.BOLD, 36));
		lbl2.setBounds(200, 90, 200, 70);
		bg.add(lbl2);

		// button returning to map menu
		JButton back = new JButton("Back");
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
		
		// button for interrogation
		JButton inter = new JButton("Interrogate");
		inter.setBounds(550, 440, 150, 50);
		bg.add(inter);
		//playListener interrogate = new playListener();
		inter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				Interrogate1 map = new Interrogate1();
				map.intro();
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
				Room3_Game map = new Room3_Game();
				map.gamePage();
			}
		});


		frame.setVisible(true);

	}
}// end of showroom class


//Interrogation class
class Interrogate1 {
	// recreating frame and specifications
	public static JFrame frame = new JFrame("Room 3");
	
	static Scanner scan = new Scanner(System.in);
	
	public static void intro() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		
		  JLabel bg = new JLabel (new ImageIcon("images/bg.jpg")); 
		  frame.add(bg);
		  
		  // read in text file
		  try {
			  JLabel lbl = new JLabel();
			  BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
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
				System.out.println("Bloop");
			}
		  
		  // creating text box
		  Icon img = new ImageIcon("images/rect.png"); 
		  JLabel background = new
		  JLabel(img); 
		  bg.setLayout(null); 
		  background.setBounds(10, 350, 870, 150);
		  bg.add(background);
		  
		  Icon img2 = new ImageIcon("images/doof.png"); 
		  JLabel lbl1 = new JLabel(img2);
		  lbl1.setBounds(0, 10, 800, 600); bg.add(lbl1);
		  
		  JLabel lbl2 = new JLabel("Dr.Doof"); 
		  lbl2.setFont(new Font("Diolog",
		  Font.BOLD, 36)); 
		  lbl2.setBounds(200, 90, 200, 70); 
		  bg.add(lbl2);
		 
		  // adding first option
		  JButton op1 = new JButton("What is your occupation?");
		    op1.setBounds(550, 440, 250, 50);
			bg.add(op1);
			//playListener interrogate = new playListener();
			op1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent action) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					Occupation map = new Occupation();
					map.occupation();
				}
			});

			// adding second option
			 JButton op2 = new JButton("Why were you at the museum?");
			    op2.setBounds(100, 440, 250, 50);
				bg.add(op2);
				//playListener interrogate = new playListener();
				op2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent action) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
						why_At map = new why_At();
						map.museum();
					}
				});
		 
		
		frame.setVisible(true);
	}
}

//______________________________________________________________________________________________________
//______________________________________________________________________________________________________

// Occupation class
class Occupation {
	public static JFrame frame = new JFrame("Room 3");
	
	static Scanner scan = new Scanner(System.in);
	
	public static void occupation() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		
		  JLabel bg = new JLabel (new ImageIcon("images/bg.jpg")); 
		  frame.add(bg);
		  
		  // read text file
		  try {
			  JLabel lbl = new JLabel();
			  BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
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
		  catch(Exception e) {
				System.out.println("Bloop");
			}
		  
		  Icon img = new ImageIcon("images/rect.png"); 
		  JLabel background = new
		  JLabel(img); 
		  bg.setLayout(null); 
		  background.setBounds(10, 350, 870, 150);
		  bg.add(background);
		  
		  Icon img2 = new ImageIcon("images/doof.png"); 
		  JLabel lbl1 = new JLabel(img2);
		  lbl1.setBounds(0, 10, 800, 600); bg.add(lbl1);
		  
		  JLabel lbl2 = new JLabel("Dr.Doof"); 
		  lbl2.setFont(new Font("Diolog",
		  Font.BOLD, 36)); 
		  lbl2.setBounds(200, 90, 200, 70); 
		  bg.add(lbl2);
		 
		  // creating new options for user
		  JButton op1 = new JButton("The mona lisa was stolen last night");
		    op1.setBounds(550, 440, 250, 50);
			bg.add(op1);
			op1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent action) {
					frame.setVisible(false);
					MonaStolen map = new MonaStolen();
					map.monaLisa();
				}
			});

			 JButton op2 = new JButton("Why were you at the museum?");
			    op2.setBounds(100, 440, 250, 50);
				bg.add(op2);
				op2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent action) {
						frame.setVisible(false);
						why_At map = new why_At();
						map.museum();
					}
				});
		 
		
		frame.setVisible(true);
	}
}

// why At class
class why_At {
	public static JFrame frame = new JFrame("Room 3");
	
	static Scanner scan = new Scanner(System.in);
	
	public static void museum() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		
		  JLabel bg = new JLabel (new ImageIcon("images/bg.jpg")); 
		  frame.add(bg);
		  
		  // read text file
		  try {
			  JLabel lbl = new JLabel();
			  BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
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
		  catch(Exception e) {
				System.out.println("Bloop");
			}
		  
		  Icon img = new ImageIcon("images/rect.png"); 
		  JLabel background = new
		  JLabel(img); 
		  bg.setLayout(null); 
		  background.setBounds(10, 350, 870, 150);
		  bg.add(background);
		  
		  Icon img2 = new ImageIcon("images/doof.png"); 
		  JLabel lbl1 = new JLabel(img2);
		  lbl1.setBounds(0, 10, 800, 600); bg.add(lbl1);
		  
		  JLabel lbl2 = new JLabel("Dr.Doof"); 
		  lbl2.setFont(new Font("Diolog",
		  Font.BOLD, 36)); 
		  lbl2.setBounds(200, 90, 200, 70); 
		  bg.add(lbl2);
		 
		  
		  // options for user
		  JButton op1 = new JButton("The mona lisa was stolen last night");
		    op1.setBounds(550, 440, 250, 50);
			bg.add(op1);
			op1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent action) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					MonaStolen map = new MonaStolen();
					map.monaLisa();
				}
			});

			 JButton op2 = new JButton("What is your occupation?");
			    op2.setBounds(100, 440, 250, 50);
				bg.add(op2);
				//playListener interrogate = new playListener();
				op2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent action) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
						Occupation map = new Occupation();
						map.occupation();
					}
				});
		 
		
		frame.setVisible(true);
	}
}

// Mona Lisa stolen class
class MonaStolen {
	// set JFrame and specifications
	public static JFrame frame = new JFrame("Room 3");
	
	static Scanner scan = new Scanner(System.in);
	
	public static void monaLisa() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		
		  JLabel bg = new JLabel (new ImageIcon("images/bg.jpg")); 
		  frame.add(bg);
		  
		  // read text files
		  try {
			  JLabel lbl = new JLabel();
			  BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
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
		  catch(Exception e) {
				System.out.println("Bloop");
			}
		  
		  // create text files
		  Icon img = new ImageIcon("images/rect.png"); 
		  JLabel background = new
		  JLabel(img); 
		  bg.setLayout(null); 
		  background.setBounds(10, 350, 870, 150);
		  bg.add(background);
		  
		  Icon img2 = new ImageIcon("images/doof.png"); 
		  JLabel lbl1 = new JLabel(img2);
		  lbl1.setBounds(0, 10, 800, 600); bg.add(lbl1);
		  
		  JLabel lbl2 = new JLabel("Dr.Doof"); 
		  lbl2.setFont(new Font("Diolog",
		  Font.BOLD, 36)); 
		  lbl2.setBounds(200, 90, 200, 70); 
		  bg.add(lbl2);
		 
		  // buttons for users
		  JButton op1 = new JButton("Did you steal the painting?");
		    op1.setBounds(550, 440, 250, 50);
			bg.add(op1);
			op1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent action) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					did_YOU map = new did_YOU();
					map.didyou();
				}
			});

			 JButton op2 = new JButton("What do you think of the Mona Lisa?");
			    op2.setBounds(100, 440, 250, 50);
				bg.add(op2);
				op2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent action) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
						Thoughts map = new Thoughts();
						map.thoughts();
					}
				});
		 
		
		frame.setVisible(true);
	}
}

// did You class
class did_YOU {
	public static JFrame frame = new JFrame("Room 3");
	
	static Scanner scan = new Scanner(System.in);
	
	public static void didyou() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		
		  JLabel bg = new JLabel (new ImageIcon("images/bg.jpg")); 
		  frame.add(bg);
		  
		  // read text file
		  try {
			  JLabel lbl = new JLabel();
			  JLabel labl = new JLabel();
			  BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			  Scanner scanner = new Scanner(reader);
			  String str, str2 = "";
			  bg.setLayout(null);
			  
			  reader.readLine();
			  reader.readLine();
			  reader.readLine();
			  reader.readLine();
			  str = reader.readLine();
			  str2 = reader.readLine();
			  lbl = new JLabel(str);
			  labl = new JLabel(str2);
			  lbl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			  lbl.setBounds(170, 280, 870, 200); 
			  bg.add(lbl);
			  labl.setFont(new Font("Diolog", Font.BOLD, 16)); 
			  labl.setBounds(170, 305, 870, 200); 
			  bg.add(labl);

			  reader.close();
				
			}
		  catch(Exception e) {
				System.out.println("Bloop");
			}
		  
		  Icon img = new ImageIcon("images/rect.png"); 
		  JLabel background = new
		  JLabel(img); 
		  bg.setLayout(null); 
		  background.setBounds(10, 350, 870, 150);
		  bg.add(background);
		  
		  Icon img2 = new ImageIcon("images/doof.png"); 
		  JLabel lbl1 = new JLabel(img2);
		  lbl1.setBounds(0, 10, 800, 600); bg.add(lbl1);
		  
		  JLabel lbl2 = new JLabel("Dr.Doof"); 
		  lbl2.setFont(new Font("Diolog",
		  Font.BOLD, 36)); 
		  lbl2.setBounds(200, 90, 200, 70); 
		  bg.add(lbl2);
		 
		  // creating more buttons for user
		  JButton op1 = new JButton("Thank you for your answers.");
		    op1.setBounds(550, 440, 250, 50);
			bg.add(op1);
			op1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent action) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					Room3 map = new Room3();
					map.showroom3();
				}
			});

			 JButton op2 = new JButton("What do you think of the Mona Lisa?");
			    op2.setBounds(100, 440, 250, 50);
				bg.add(op2);
				op2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent action) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
						Thoughts map = new Thoughts();
						map.thoughts();
					}
				});
		 
		
		frame.setVisible(true);
	}
}

// thoughts clas
class Thoughts {
	// creating JFrame and specifications
	public static JFrame frame = new JFrame("Room 3");
	
	static Scanner scan = new Scanner(System.in);
	
	public static void thoughts() {
		frame.setSize(900,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBackground(Color.GRAY);

		
		  JLabel bg = new JLabel (new ImageIcon("images/bg.jpg")); 
		  frame.add(bg);
		  
		  // reading text file
		  try {
			  JLabel lbl = new JLabel();
			  BufferedReader reader = new BufferedReader(new FileReader("Texts/RoomThree.txt"));
			  Scanner scanner = new Scanner(reader);
			  String str = "";
			  bg.setLayout(null);
			  
			  reader.readLine();
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
		  catch(Exception e) {
				System.out.println("Bloop");
			}
		  
		  // set the rest of the screen
		  Icon img = new ImageIcon("images/rect.png"); 
		  JLabel background = new
		  JLabel(img); 
		  bg.setLayout(null); 
		  background.setBounds(10, 350, 870, 150);
		  bg.add(background);
		  
		  Icon img2 = new ImageIcon("images/doof.png"); 
		  JLabel lbl1 = new JLabel(img2);
		  lbl1.setBounds(0, 10, 800, 600); bg.add(lbl1);
		  
		  JLabel lbl2 = new JLabel("Dr.Doof"); 
		  lbl2.setFont(new Font("Diolog",
		  Font.BOLD, 36)); 
		  lbl2.setBounds(200, 90, 200, 70); 
		  bg.add(lbl2);
		 
		  // adding more options for the user
		  JButton op1 = new JButton("Thank you for your answers.");
		    op1.setBounds(550, 440, 250, 50);
			bg.add(op1);
			//playListener interrogate = new playListener();
			op1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent action) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					Room3 map = new Room3();
					map.showroom3();
				}
			});

			 JButton op2 = new JButton("Did you steal the painting?");
			    op2.setBounds(100, 440, 250, 50);
				bg.add(op2);
				//playListener interrogate = new playListener();
				op2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent action) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
						did_YOU map = new did_YOU();
						map.didyou(); 
					}
				});
		 
		
		frame.setVisible(true);
	}
}
