import java.util.Iterator;

public class Maior {
		
	int[] vetor;
		
	public void Maior() {
	}
	
	public void getMaiorValor() {
		int maior = this.vetor[0];
		int posicaoMaior = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] > maior) {
				maior = this.vetor[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("O maior n�mero do vetor �: " + this.vetor[posicaoMaior] + " e est� na " + (posicaoMaior + 1 ) + "� posi��o!");
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public void setVetor(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public int[] getVetor() {
		return this.vetor;
	}
}
