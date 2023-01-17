package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_adventure {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "You wake up to find yourself in a forest");
		JOptionPane.showMessageDialog(null, "Suddenly you hear a noise in the bush");
		String noise = JOptionPane.showInputDialog("Go see what is making the noise (g) ignore it (n)");
		// (g1)
		if (noise.equals("g")) {
			JOptionPane.showMessageDialog(null, "You walk towards the bush and find a strange animal");
			JOptionPane.showMessageDialog(null, "The strange animal looks like a fox and bird combined");
			JOptionPane.showMessageDialog(null, "It stares at you for a couple moments, then it screams and runs away");
		}
		// (n1)
		if (noise.equals("n")) {
			JOptionPane.showMessageDialog(null,
					"You ignore the noise but after a couple seconds you feel a sharp pain in your leg");
			JOptionPane.showMessageDialog(null,
					"You look down and see a strange animal biting your leg. It looked like a fox and bird combined");
			JOptionPane.showMessageDialog(null, "The animal lets go and looks up at you");
			String option = JOptionPane.showInputDialog("Scare it away (s) run away (r)");
			// (s2)
			if (option.equals("s")) {
				JOptionPane.showMessageDialog(null, "It gets scared and runs away");
				JOptionPane.showMessageDialog(null,
						"You start to feel bad so you follow the animal inside a cave to find a whole family of them");
				JOptionPane.showMessageDialog(null,
						"They all look at you and start to walk slowely closer and closer to you");
				JOptionPane.showMessageDialog(null,
						"The animals start to growl.. and then pounce! You wake up again to find yourself where you first woke up (restart, go back to the start)");
			}

		}

	}
}
