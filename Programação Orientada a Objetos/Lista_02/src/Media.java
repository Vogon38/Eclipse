
public class Media {
	int [] vetor;
	int soma;
	double media;
	
	public Media(int [] vetorRecebido, int somaRecebida) {
		this.vetor = vetorRecebido;
		this.soma = somaRecebida;
	}
	
	public void getMediaValor() {
		
		media = ((double) this.soma / (double) this.vetor.length);
		
		System.out.println("A média total dos valores é: " + media);
	}
	
	public void setMedia(int mediaRecebida) {
		this.media = mediaRecebida;
}
	
	public double getMedia() {
		return this.media;
	}
}
