package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obidieant_Robot {

	public static void main(String[] args) {
		
		Robot rob = new Robot();
		
		String[] shapeOptions = {"Square", "Triangle", "Circle"};
		
		int chosenShape = JOptionPane.showOptionDialog(null, "What shape would you like to draw?", " ", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, shapeOptions, 0);
		
		String[] colorOptions = {"Red", "Blue", "Green"};
		
		int chosenColor = JOptionPane.showOptionDialog(null, "What color would you like to use?", " ", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, colorOptions, 0);
		
		if(chosenColor == 0) {
			rob.setPenColor(255, 0, 0);
		}
		else if(chosenColor == 1) {
			rob.setPenColor(0, 0, 255);
		}
		else if(chosenColor == 2) {
			rob.setPenColor(0, 255, 0);
		}
		
		
		if(chosenShape == 0) {
			drawSquare(rob, 100);
		}
		else if(chosenShape == 1) {
			drawTriangle(rob, 100);
		}
		else if(chosenShape == 2) {
			drawCircle(rob);
		}
		
		
	}
	
	public static void drawSquare(Robot rob, int size) {
		for(int i = 0; i < 4; i++) {
			rob.setSpeed(size);
			rob.penDown();
			rob.move(size);
			rob.turn(90);
		}
	}
	
	public static void drawTriangle(Robot rob, int size) {
		rob.setSpeed(size);
		rob.penDown();
		
		for(int i = 0; i <= 3; i++) {
			rob.move(size);
			rob.turn(120);
		}
	}
	
	public static void drawCircle(Robot rob) {
		rob.setSpeed(100);
		rob.penDown();
		
		for(int i = 0; i <=360; i++) {
			rob.move(3);
			rob.turn(1);
		}
		
	}
}
