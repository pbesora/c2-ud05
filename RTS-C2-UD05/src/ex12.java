import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		String intento;
		final String PASS="123";
		int fallos=1;
		
		do {
			intento=JOptionPane.showInputDialog("Introduce la contraseņa: (" + fallos + "/3)");
			fallos++;
		}while(fallos<=3 && !intento.contentEquals(PASS));
		
		if(intento.contentEquals(PASS)) {
			JOptionPane.showMessageDialog(null, "Contraseņa correcta");
		}else
			JOptionPane.showMessageDialog(null, "Contraseņa incorrecta");

	}

}
