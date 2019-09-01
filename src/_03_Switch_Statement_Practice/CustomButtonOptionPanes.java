package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		System.out.println(input);
		//use a switch statement to do something cool for each option
		switch(input) {
		case 6:
			JOptionPane.showMessageDialog(null, "Have fun with your friends!");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Relax!");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Do your homework and study!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Study!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Eat tacos!");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Do homework!");
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Watch football!");
			break;
		}	
	}
}
