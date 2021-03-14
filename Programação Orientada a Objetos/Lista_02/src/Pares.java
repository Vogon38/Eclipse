public class Pares {
		
	int[] vetor;
		
	public Pares(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getParesValor() {
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] % 2 == 0) {
				System.out.println("O número do vetor: " + this.vetor[i] + " é par e está na " + i + "ª posição!");			
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
