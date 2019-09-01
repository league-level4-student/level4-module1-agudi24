package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h = new _00_Horoscope();
		h.display(Zodiac.ARIES);
	}

	void display(Zodiac sign) {
		switch (sign) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Your trait is: Aggressive");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Your trait is: Possessive");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Your trait is: Inconsistent");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Your trait is: Manipulative");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Your trait is: Arrogant");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Your trait is: Overly Critical");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Your trait is: Self-pity");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Your trait is: Jealous/Violent");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Your trait is: Extraordinarily Impatient");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Your trait is: Condescending");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Your trait is: Temperamental");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Your trait is: Overly trusting/Victim");
			break;
		}
	}
}
