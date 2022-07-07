import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		final Double IVA = 0.21;
		Double totalVentas=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intoduce el número de ventas: ");
		
		int numVentas = sc.nextInt();
		
		for(int i = 1; i<=numVentas; i++) {
			System.out.println("Venta " + i + " de " + numVentas);
			totalVentas += sc.nextDouble();
		}
		
		sc.close();
		
		System.out.println("La suma total es " + (totalVentas+totalVentas*IVA));
	}

}
