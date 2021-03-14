
public class Moda {
	
	int [] vetor;
	
	public Moda(int [] vetorRecebido ) {
		this.vetor = vetorRecebido;
	}
	
	public void getModaValor() {
		int [] cont = new int [this.vetor.length];
		int vezes = 0, indice = 0;
		
		for (int i=0; i<this.vetor.length; i++) {
			for (int j=0; j<this.vetor.length; j++) {
				if (this.vetor[i] == this.vetor[j]) {
					cont[i]++;
				}
			}	
		}
		
		vezes = cont[0];
		
		for (int i=0; i<cont.length; i++) {
			if (cont[i] > vezes) {
				vezes = cont[i];
				indice = i;
			}
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("A moda do vetor é: " + this.vetor[indice]);
		System.out.println("--------------------------------------------------------------------------");
		
	}
	
}
