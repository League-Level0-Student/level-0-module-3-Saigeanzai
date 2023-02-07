package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {




public static void main(String[] args) {
	
	String happy = JOptionPane.showInputDialog("Are you happy?");
	if (happy.equals("yes")) {
	 JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	if (happy.equals("no")) {
		String sad = JOptionPane.showInputDialog("Do you want to be happy?");
	
	if (sad.equals("no")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
	}
	if (sad.equals("yes")) {
		JOptionPane.showMessageDialog(null, "change something");
	}
	}

	
	


















}
}