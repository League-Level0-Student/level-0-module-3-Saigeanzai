
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		rob.penDown();
    	rob.setSpeed(100);
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("what color pen would you like to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("green")) {
			rob.setPenColor(Color.GREEN);
		}
		else	if (color.equals("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		else	if (color.equals("red")) {
			rob.setPenColor(Color.RED);
		}
		else	if (color.equals("orange")) {
			rob.setPenColor(Color.ORANGE);
		}
		else if (color.equals("yellow")) {
			rob.setPenColor(Color.YELLOW);
		}
		//6. If the user doesn't enter anything, choose a random color
		else {
		rob.setPenColor(Color.BLACK);	
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	for ( int i=0; i<4; i++) {
		rob.move(200);
		rob.turn(90);
	}
		
		
		



	}
}
