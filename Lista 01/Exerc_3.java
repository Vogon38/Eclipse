import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##");
		
		double valor = 0, cem = 0, cinquenta = 0, dez = 0, cinco = 0, um = 0;
		
		System.out.print("Digite o valor para saque: ");
		valor = entrada.nextDouble();
		
		if (valor < 10) {
			System.out.println("Valor indisponível. Mínimo de 10 reais.");
		} else if (valor > 600) {
			System.out.println("Valor indisponível. Máximo de 600 reais.");
		} else {
			cem = (int)(valor/100);
			valor = valor % 100;
			
			cinquenta = (int)(valor/50);
			valor = valor % 50;
			
			dez = (int)(valor/10);
			valor = valor % 10;
			
			cinco = (int)(valor/5);
			valor = valor % 5;
			
			um = valor;
		}
		if (cem != 0) {
			System.out.println(df.format(cem) + " notas de 100 reais.");
		}
		if (cinquenta != 0) {
			System.out.println(df.format(cinquenta) + " notas de 50 reais.");
		}
		if (dez != 0) {
			System.out.println(df.format(dez) + " notas de 10 reais.");
		}
		if (cinco != 0) {
			System.out.println(df.format(cinco) + " notas de 5 reais.");
		}
		if (um != 0) {
			System.out.println(df.format(um) + " notas de 1 real.");
		}
	}
}
