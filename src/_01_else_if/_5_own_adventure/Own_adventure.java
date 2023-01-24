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
			// (s2) ending 1
			if (option.equals("s")) {
				JOptionPane.showMessageDialog(null, "It gets scared and runs away");
				JOptionPane.showMessageDialog(null,
						"You start to feel bad so you follow the animal inside a cave to find a dozen of them");
				JOptionPane.showMessageDialog(null,
						"They all look at you and start to walk slowely closer and closer to you");
				JOptionPane.showMessageDialog(null,
						"The animals start to growl.. and then pounce! You wake up again to find yourself where you first woke up (restart, go back to the start)");
			}
			if(option.equals("r")) {
				JOptionPane.showMessageDialog(null, "You look the other way and start sprinting as fast as you can");
				JOptionPane.showMessageDialog(null, "After a couple minutes you stop running and look back, that animal was gone");
				JOptionPane.showMessageDialog(null, "Suddenly, you hear your stomach growl");
				String  berries = JOptionPane.showInputDialog("Go look for something to eat (e) ignore it and move on (m) ");
			
			// (e1)
			if(berries.equals("e")) {
		    	JOptionPane.showMessageDialog(null, "You decide to look for food, so you searched the area and found some berries");
		    	String food = JOptionPane.showInputDialog("eat the berries (p) look for something else to eat (i)");
		    
		    // (p)
		    if(food.equals("p")) {
		    	JOptionPane.showMessageDialog(null, "You start picking the berries");
		    	JOptionPane.showMessageDialog(null, "After eating a couple handfulls, your stomach starts to hurt");
		    	JOptionPane.showMessageDialog(null, "The pain gets worse and worse and then.. ");
		    	JOptionPane.showMessageDialog(null, "POOF!!");
		    	JOptionPane.showMessageDialog(null, "You turned into a hippo");
		    }
		    // (i)
		    if(food.equals("i")) {
		    	JOptionPane.showMessageDialog(null, "You suspect that the berries may be poisonous, you look for something else to eat");
		    	JOptionPane.showMessageDialog(null, "You found a big apple tree with apples of multiple colors");
		    	String colorfulApples = JOptionPane.showInputDialog("purple apple (P) orange apple (O) pink apple (I)");
		    
		    if(colorfulApples.equals("P")) {
		    	JOptionPane.showMessageDialog(null, "The tasty apple fills you up but suddenly");
		    	JOptionPane.showMessageDialog(null, "Your stomach starts to hurt and then..");
		    	JOptionPane.showMessageDialog(null, "POOF!!");
		    	JOptionPane.showMessageDialog(null, "You turned into a 6 legged unicorn");
		    }
		    if(colorfulApples.equals("O")){
		    	JOptionPane.showMessageDialog(null, "The tasty apple fills you up but suddenly");
		    	JOptionPane.showMessageDialog(null, "Your stomach starts to hurt and then..");
		    	JOptionPane.showMessageDialog(null, "POOF!!");
		    	JOptionPane.showMessageDialog(null, "You turned into a orange");
		    }
		    if(colorfulApples.equals("I")) {
		    	JOptionPane.showMessageDialog(null, "The tasty apple fills you up but suddenly");
		    	JOptionPane.showMessageDialog(null, "Your stomach starts to hurt and then..");
		    	JOptionPane.showMessageDialog(null, "POOF!!");
		    	JOptionPane.showMessageDialog(null, "You turned into a moth");
		    }
		}

	}
	}
}
}
}