/**
 * @author annie
 * 06/13/2022
 * Person V1
 * A class for a person
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Person {
	private String name;
	private ImageIcon profile;
	
	public Person(String nom, ImageIcon visage) {
		name = nom;
		profile = visage;
	}
	
	public String toString() {
		return "Person: " + name;
	}
	public String getName() {
		return name;
	}
	public ImageIcon getImage() {
		return profile;
	}
}
