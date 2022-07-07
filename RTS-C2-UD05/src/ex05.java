import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		if((num%2)==0)
			JOptionPane.showMessageDialog(null,num + " es divisible entre 2");
		else
			JOptionPane.showMessageDialog(null,num + " NO es divisible entre 2");

	}

}
