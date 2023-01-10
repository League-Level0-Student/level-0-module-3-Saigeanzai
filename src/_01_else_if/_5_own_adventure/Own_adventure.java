package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_adventure {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "You wake up to the sound of your alarm clock");
		String selection = JOptionPane.showInputDialog("stay in bed (s) get up (g) ");

		// Stay in bed -

		if (selection.equals("s")) {
			JOptionPane.showMessageDialog(null,
					"After a couple hours you get up to realize that you forgot about the job interview");
			String options = JOptionPane.showInputDialog(null,
					"get ready for the day (r) give up and stay and bed (l)");

			if (options.equals("l")) {
				JOptionPane.showMessageDialog(null, "You get a good sleep but end up broke");
			}

			if (options.equals("r")) {
				JOptionPane.showMessageDialog(null, "You get up to prepare for the interview");
			}

			String StinkyBreath = JOptionPane.showInputDialog("eat breakfast (e)");
			if (StinkyBreath.equals("e")) {
				JOptionPane.showMessageDialog(null, "You go to your kitchen and look into your fridge");
			}
		}
		String Breakfast = JOptionPane.showInputDialog("avocado toast with egg (a) yogurt with strawberries (y)");
		if (Breakfast.equals("a")) {
			JOptionPane.showMessageDialog(null, "The delicious avocado toast fills you up");
		}
		if (Breakfast.equals("y")) {
			JOptionPane.showMessageDialog(null, "The delicious yogurt wills you up");
		}
		String Gum = JOptionPane.showInputDialog("chew mint gum (m) leave the house without gum (w) ");
	
	if(Gum.equals("m")) {
		 JOptionPane.showMessageDialog(null, "you chew on gum and leave the house" );
	 }
	if(Gum.equals("w")) {
		 JOptionPane.showMessageDialog(null, "you leave the house " );
	}
	JOptionPane.showMessageDialog(null, "The car unlocks and you get in. The engine starts and you leave for the interview");

}
}






