
public class Mediana {
	
	int [] vetor;
	
	public Mediana(int [] vetorRecebido) {
		this.vetor = vetorRecebido;
	}
	
	public void getMedianaValor() {
				
		double mediana;
		this.ordenacaoVetorInteiro();
		
		if (this.vetor.length % 2 == 0) {
			double soma = 0;
			
			int indice = this.vetor.length / 2;
			
			soma += this.vetor[indice - 1];
			soma += this.vetor[indice];
			
			mediana = soma / 2;
		} else {
			int indice = this.vetor.length/2;
			mediana = this.vetor[indice];
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("A mediana é: " + mediana);
		System.out.println("--------------------------------------------------------------------------");
		
	}
	
	public void ordenacaoVetorInteiro(){
         
		int aux = 0;

        for (int i=0; i<this.vetor.length; i++)
            {
                for (int j=0; j<this.vetor.length; j++)
                {
                    if (this.vetor[i] < this.vetor[j])
                    {
                        aux = this.vetor[i];
                        this.vetor[i] = this.vetor[j];
                        this.vetor[j] = aux;
                    }
                }
           }
	}
	
  }
