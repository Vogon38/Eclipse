
public class Impares {

	int[] vetor;
	
	public Impares(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getImparesValor() {
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] % 2 != 0) {
				System.out.println("O n�mero do vetor: " + this.vetor[i] + " � �mpar e est� na " + i + "� posi��o!");			
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
