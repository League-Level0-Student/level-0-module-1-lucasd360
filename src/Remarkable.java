import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter a name!");
		if (name.equals("Lucas")) {
			JOptionPane.showMessageDialog(null, "Basketball");
		}
		if (name.equals("Max")) {
			JOptionPane.showMessageDialog(null, "Dodgeball");
		}
		if (name.equals("Matt")) {
			JOptionPane.showMessageDialog(null, "Scuba Diving");
		}
		if (name.equals("Sheriden")) {
			JOptionPane.showMessageDialog(null, "Archery");

		}
	}
}
