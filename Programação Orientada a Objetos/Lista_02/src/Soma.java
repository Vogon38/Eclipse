
public class Soma {
	
	int [] vetor;
	int soma = 0;
	
	public Soma(int [] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getSomaValor() {
		
		for (int i=0; i<this.vetor.length; i++) {
			this.soma += this.vetor[i];
		}
		
		System.out.println("--------------------------------------------------------------------------");		
		System.out.println("A soma total dos valores é: " +this.soma);
		System.out.println("--------------------------------------------------------------------------");
		
	}
	
	public void setSoma(int somaRecebida) {
		this.soma = somaRecebida;
}
	
	public int getSoma() {
		return this.soma;
	}
}
