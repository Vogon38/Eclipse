
public class Impares {

	int[] vetor;
	
	public Impares(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getImparesValor() {
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] % 2 != 0) {
				System.out.println("O número do vetor: " + this.vetor[i] + " é ímpar e está na " + i + "ª posição!");			
			}
		}
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public void setVetor(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
}
	
	public int[] getVetor() {
		return this.vetor;
	}
}
