import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int contam = 0;
		int contame = 0;
		int edad = 0;
		int sumaem = 0;
		int sumaen =0 ;
		for (int i=0;i<100;i++) {
			System.out.println("Ingrese su edad");
			edad = sca.nextInt();
			if (edad>=25) {
				sumaem = sumaem+edad;
				contam += 1;
			} else {
				sumaen = sumaen+edad;
				contame += 1;
			}
		}
		
		double prome1 = sumaem/contam;
		double prome2 = sumaen/contame;
		System.out.println("promedio de los mayores de 25: "+prome1);
		System.out.println("Promedio de los menores de 25: "+prome2);
	}


}

