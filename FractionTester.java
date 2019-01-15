package fraction;
import javax.swing.JOptionPane;
public class FractionTester {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog(null, "Please enter operation: +, -, *, /");
		if(answer.equals("+")) {
			Fraction1 myFraction1=new Fraction1(JOptionPane.showInputDialog(null, "Fraction 1:"), JOptionPane.showInputDialog(null, "Fraction 2:"));
			JOptionPane.showMessageDialog(null, myFraction1.getAddNum()+"/"+myFraction1.getAddDen());
		}
		else if(answer.equals("-")) {
			Fraction2 myFraction2=new Fraction2(JOptionPane.showInputDialog(null, "Fraction 1:"), JOptionPane.showInputDialog(null, "Fraction 2:"));
			JOptionPane.showMessageDialog(null, myFraction2.getAddNum()+"/"+myFraction2.getAddDen());
		}
		else if(answer.equals("*")) {
			Fraction3 myFraction3=new Fraction3(JOptionPane.showInputDialog(null, "Fraction 1:"), JOptionPane.showInputDialog(null, "Fraction 2:"));
			JOptionPane.showMessageDialog(null, myFraction3.getAddNum()+"/"+myFraction3.getAddDen());
		}
		else if(answer.equals("/")) {
			Fraction4 myFraction4=new Fraction4(JOptionPane.showInputDialog(null, "Fraction 1:"), JOptionPane.showInputDialog(null, "Fraction 2:"));
			JOptionPane.showMessageDialog(null, myFraction4.getAddNum()+"/"+myFraction4.getAddDen());
		}
	}
}