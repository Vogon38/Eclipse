import java.util.Scanner;

public class Exerc_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String sexo = "";
		float h = 0;
		double peso = 0;
		double h_media = 58, m_media = 44.70;
		
		System.out.print("Informe o sexo: ");
		sexo = entrada.nextLine();
		
		System.out.print("Informe a altura: ");
		h = entrada.nextFloat();
		
		System.out.print("Informe o peso: ");
		peso = entrada.nextDouble();		
		
		
		if (sexo == "masculino") {
			peso = ((peso*h)-58);
			if (peso > h_media)
				System.out.println("Está acima do peso");
			else if (peso < h_media)
				System.out.println("Esta abaixo do peso");
			else
				System.out.println("Está no peso ideal");
		}
		if (sexo == "feminino") {
			peso = ((peso*h)-44.7);
			if (peso > m_media)
				System.out.println("Está acima do peso");
			else if (peso < m_media)
				System.out.println("Esta abaixo do peso");
			else
				System.out.println("Está no peso ideal");
		}
	}
}