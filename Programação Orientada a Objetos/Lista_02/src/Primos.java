
public class Primos {
	
	int [] vetor;
	
	public Primos(int [] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getPrimosValor() {
		System.out.println("--------------------------------------------------------------------------");
		for (int i=0; i<this.vetor.length; i++) {
				if (this.isPrime(this.vetor[i])) {
					System.out.println("O n�mero do vetor: " + this.vetor[i] + " � primo e est� na posi��o " + i + "�");
				}
		}
		System.out.println("--------------------------------------------------------------------------");
	}
	
	private static boolean isPrime(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}
	
}
