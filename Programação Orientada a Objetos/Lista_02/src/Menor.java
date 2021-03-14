public class Menor {
		
	int[] vetor;
		
	public void Menor() {
	}
	
	public void getMenorValor() {
		int menor = this.vetor[0];
		int posicaoMenor = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			if(this.vetor[i] < menor) {
				menor = this.vetor[i];
				posicaoMenor = i;
			}
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("O menor número do vetor é: " + this.vetor[posicaoMenor] + " e está na " + (posicaoMenor + 1 ) + "ª posição!");
		System.out.println("--------------------------------------------------------------------------");
		
	}
	
	public void setVetor(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public int[] getVetor() {
		return this.vetor;
	}
}
