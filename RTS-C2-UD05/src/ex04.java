import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
		
		Double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
		
		JOptionPane.showMessageDialog(null,"El área es " + Math.PI*Math.pow(radio, 2));

	}

}
