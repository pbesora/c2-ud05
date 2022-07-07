import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		String intento;
		final String PASS="123";
		int fallos=1;
		
		do {
			intento=JOptionPane.showInputDialog("Introduce la contraseña: (" + fallos + "/3)");
			fallos++;
		}while(fallos<=3 && !intento.contentEquals(PASS));
		
		if(intento.contentEquals(PASS)) {
			JOptionPane.showMessageDialog(null, "Contraseña correcta");
		}else
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta");

	}

}
