public class Lista {
		
	int[] vetor;

	public Lista(int [] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getListaValor() {
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < this.vetor.length; i++) {
			System.out.println("O n�mero do vetor: "+ this.vetor[i] + " est� na " + i + "� posi��o");
		}
		System.out.println("--------------------------------------------------------------------------");
	}
		
	public void setLista(int[] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public int[] getLista() {
		return this.vetor;
	}
}
