public class Pares {
		
	int[] vetor;
		
	public Pares(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getParesValor() {
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] % 2 == 0) {
				System.out.println("O n�mero do vetor: " + this.vetor[i] + " � par e est� na " + i + "� posi��o!");			
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
