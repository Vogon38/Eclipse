import java.util.Random;
import java.util.Scanner;

public class Listas {

	int aleatorio, qtd, valor = 5001, i, 
		maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, 
		indiceMaior = 0, indiceMenor = 0;

		int vetor[] = new int[qtd];
		int pares[] = new int[qtd];
		int indicePares[] = new int[qtd];
		int impares[] = new int[qtd];
		int indiceImpares[] = new int[qtd];
		
		public Listas () {
		
		for (i=0; i<qtd; i++) {
		
			Random generator = new Random();
			
			aleatorio = generator.nextInt(valor);
			vetor[i] = aleatorio;
			
			System.out.println("Valor do Vetor na posição "+ i +" é.: " + vetor[i]);

			if (vetor[i] <= menor) {
				menor = vetor[i];
				indiceMenor = i;
			}
			
			if (vetor[i] >= maior) {
				maior = vetor[i];
				indiceMaior = i;
			}
			
			if (vetor[i] % 2 == 0) {
				pares[i] = vetor[i];
				indicePares[i] = i;
			}else {
				impares[i] = vetor[i];
				indiceImpares[i] = i;
			}
		}
		
		System.out.println("O maior número é.: "+ maior + " no índice " + indiceMaior);
		System.out.println("O menor número é.: "+ menor + " no índice " + indiceMenor);
		
		for (i=0; i<qtd; i++) {
			if (pares[i] != 0) {
				System.out.println("O número " + pares[i] + " no índice " + indicePares[i] + " é par");
			}
		}
		
		for (i=0; i<qtd; i++) {
			if (impares[i] != 0) {
				System.out.println("O número " + impares[i] + " no índice " + indiceImpares[i] + " é ímpar");
			}
		}
	
	}
}
