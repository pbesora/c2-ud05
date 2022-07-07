import javax.swing.JOptionPane;

public class ex06 {

	public static void main(String[] args) {
		
		final Double IVA = 0.21;
		
		Double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
		
		JOptionPane.showMessageDialog(null, "El precio final es " + (precio+precio*IVA));
	}

}
