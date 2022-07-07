import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {
		int a,b;
		String signo;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
		
		signo = JOptionPane.showInputDialog("Introduce el signo de la operación a realizar");
		
		switch(signo) {
			case "+":
				JOptionPane.showMessageDialog(null, a + " + " + b + " = " + (a+b));
				break;
			case "-":
				JOptionPane.showMessageDialog(null, a + " - " + b + " = " + (a-b));
				break;
			case "*":
				JOptionPane.showMessageDialog(null, a + " * " + b + " = " + (a*b));
				break;
			case "/":
				JOptionPane.showMessageDialog(null, a + " / " + b + " = " + ((double)a/b));
				break;
			case "^":
				JOptionPane.showMessageDialog(null, a + "^" + b + " = " + Math.pow(a, b));
				break;
			case "%":
				JOptionPane.showMessageDialog(null, a + " % " + b + " = " + (a%b));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Signo incorrecto");
				break;
				
		}
	}

}
