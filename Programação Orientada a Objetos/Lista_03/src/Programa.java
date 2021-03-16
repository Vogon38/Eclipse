import java.util.Scanner;

public class Programa {

public static final int VOLUME_LATA = 18; //18 litros de tinta por lata
public static final double METROS_LATA = 85.68; //cada litro pinta 4,76 m²

	public static void main(String[] args) {
		
		double altura_triangulo, ab_triangulo;
		int tipo_tinta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a altura do triângulo: ");
		altura_triangulo = entrada.nextDouble();
		
		System.out.println("Informe a ab do triângulo: ");
		ab_triangulo = entrada.nextDouble();
		
		System.out.println("Informe o tipo de tinta (1, 2 ou 3): ");
		tipo_tinta = entrada.nextInt();
		
	}

}
