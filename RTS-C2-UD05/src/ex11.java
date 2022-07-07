import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String dia = sc.nextLine().toUpperCase();
		sc.close();
		
		switch(dia) {
			case "LUNES":
				System.out.println(dia + " es laboral");
				break;
			case "MARTES":
				System.out.println(dia + " es laboral");
				break;
			case "MIERCOLES":
				System.out.println(dia + " es laboral");
				break;
			case "JUEVES":
				System.out.println(dia + " es laboral");
				break;
			case "VIENES":
				System.out.println(dia + " es laboral");
				break;
			case "SÁBADO":
				System.out.println(dia + " NO es laboral");
				break;
			case "DOMINGO":
				System.out.println(dia + " es laboral");
				break;
			default:
				System.out.println("El dia introducido no es válido");
				break;
		}

	}

}
