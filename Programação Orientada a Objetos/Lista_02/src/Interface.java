import java.util.Random;
import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {

		int aleatorio, qtd, valor = 5001;
		char again = 's';
		
		Scanner entrada = new Scanner(System.in);
			
		while(again == 's') {
			System.out.print("Informe a quantidade (inteiro) de valores que deverão ser gerados: ");
			qtd = entrada.nextInt();
				
			if ((qtd == 0) || (qtd < 0))
				do {
					System.out.println();
					System.out.print("Número inválido.\nInforme a quantidade (inteiro) de valores que deverão ser gerados: ");
					qtd = entrada.nextInt();
				} while ((qtd == 0) || (qtd < 0));
				
			int vetor[] = new int[qtd];
						
			for (int i=0; i<qtd; i++) {
			
				Random generator = new Random();
				
				aleatorio = generator.nextInt(valor);
				vetor[i] = aleatorio;
			}
		
		Maior classeMaior = new Maior();
		classeMaior.setVetor(vetor);
		classeMaior.getMaiorValor();
		
		Menor classeMenor = new Menor();
		classeMenor.setVetor(vetor);
		classeMenor.getMenorValor();
		
		Pares classePares = new Pares(vetor);
		classePares.getParesValor();
		
		Impares classeImpares = new Impares(vetor);
		classeImpares.getImparesValor();
		
		Primos classePrimos = new Primos(vetor);
		classePrimos.getPrimosValor();
		
		Soma classeSoma = new Soma(vetor);
		classeSoma.getSomaValor();
		
		Media classeMedia = new Media(vetor, classeSoma.getSoma());
		classeMedia.getMediaValor();
		
		Moda classeModa = new Moda(vetor);
		classeModa.getModaValor();
		
		Mediana classeMediana = new Mediana(vetor);
		classeMediana.getMedianaValor();
		
		Variancia classeVariancia = new Variancia(vetor, classeMedia.getMedia());
		classeVariancia.getVarianciaValor();
				
		Desvio classeDesvio = new Desvio(classeVariancia.getResultado());
		classeDesvio.getDesvio();
	
		Lista classeLista = new Lista(vetor);
		classeLista.getListaValor();
		
		System.out.println("\n");
		System.out.print("Vamos tentar de novo? :)\n(S/N): ");
		again = entrada.next().charAt(0);
		again = Character.toLowerCase(again);
		System.out.println();
	
		}
	}
}	
