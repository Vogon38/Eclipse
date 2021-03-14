
public class Variancia {

	int [] vetor;
	double media;
	double resultado;
	
	public Variancia(int [] vetorRecebido, double mediaRecebida) {
		this.vetor = vetorRecebido;
		this.media = mediaRecebida;
	}
	
	public void getVarianciaValor() {
		double total = 0;
		
		for (int i=0; i<this.vetor.length; i++) {
			total = ((this.vetor[i]-this.media) * (this.vetor[i]-this.media)) + total; 
		}
		
		this.resultado = total/this.vetor.length;
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("A variância é: " + resultado);
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public void setResultado(int resultadoRecebido) {
		this.resultado = resultadoRecebido;
	}
	
	public double getResultado() {
		return this.resultado;
	}
}
