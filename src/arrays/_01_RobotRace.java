package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robot = new Robot[10];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robot.length; i++) {
			robot[i].setY(600);
			robot[i].setX(i * 200 + 50);
			robot[i].setSpeed(10);
		}
		boolean isRacing = true;
		int a = 0;
		while (isRacing == true) {

			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			for (int i = 0; i < robot.length; i++) {
				Random random = new Random();
				if (robot[i].getY() == 0 || robot[i].getY() < 0) {
					a = i;
					isRacing = false;
				}
				robot[i].move(random.nextInt(50));
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		a++;
		JOptionPane.showMessageDialog(null, "Robot #" + a + " won! ");
		// 8. try different races with different amounts of robots.

		// [OPTIONAL] 9. make the robots race around a circular track.
	}
}
