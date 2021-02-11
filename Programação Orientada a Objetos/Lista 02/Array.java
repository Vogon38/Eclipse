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
			do {
				System.out.print("Informe a quantidade (inteiro) de valores que dever�o ser gerados: ");
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
				
				System.out.println("Valor do Vetor na posi��o "+ i +" �.: " + vetor[i]);
	
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
			
			
			
			System.out.println("O maior n�mero �.: "+ maior + " no �ndice " + indiceMaior);
			System.out.println("O menor n�mero �.: "+ menor + " no �ndice " + indiceMenor);
			
			for (i=0; i<qtd; i++) {
				if (pares[i] != 0) {
					System.out.println("O n�mero " + pares[i] + " no �ndice " + indicePares[i] + " � par");
				}
			}
			
			for (i=0; i<qtd; i++) {
				if (impares[i] != 0) {
					System.out.println("O n�mero " + impares[i] + " no �ndice " + indiceImpares[i] + " � �mpar");
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

System.out.println("Valor do Vetor na posi��o "+ i +" �.:" + vetor[i]);

*/