import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int aleatorio, qtd, valor = 5001, i, 
			maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, 
			indiceMaior = 0, indiceMenor = 0;
		char again;
		again = 's';
		
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
			int pares[] = new int[qtd];
			int indicePares[] = new int[qtd];
			int impares[] = new int[qtd];
			int indiceImpares[] = new int[qtd];
			
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
				if (impares[i] != 0) {
					System.out.println("O número " + impares[i] + " no índice " + indiceImpares[i] + " é ímpar");
				}
			}
			
			System.out.println();
			System.out.print("Vamos tentar de novo? :)\n(S/N): ");
			again = entrada.next().charAt(0);
			again = Character.toLowerCase(again);
			System.out.println();
			
			}
		
		}
} 

		


/* System.out.println("Numero digitado: "+ qtd);

for (i=0; i<qtd; i++) {

System.out.println("Valor do Vetor na posição "+ i +" é.:" + vetor[i]);

*/
