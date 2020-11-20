import java.util.Scanner;

public class Exerc_1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		String sexo = "";
		double h = 0, peso = 0;
			
						
		System.out.print("Informe o sexo: ");
		sexo = entrada.nextLine();
		
		System.out.print("Informe a altura: ");
		h = entrada.nextDouble();
		
		double masc = (72.7*h)-58, fem = (62.1*h)-44.7;
		
		System.out.print("Informe o peso: ");
		peso = entrada.nextDouble();
		
		switch (sexo) {
		
			case "masculino":
				if (peso > masc) {
					System.out.println("Est� acima do peso");
				} else if (peso < masc) {
					System.out.println("Esta abaixo do peso");
				} else {
					System.out.println("Est� no peso ideal");
				}
			case "feminino":
				if (peso > fem) {
					System.out.println("Est� acima do peso");
				} else if (peso < fem) {
					System.out.println("Esta abaixo do peso");
				} else {
					System.out.println("Est� no peso ideal");
				}
		}
	}
}