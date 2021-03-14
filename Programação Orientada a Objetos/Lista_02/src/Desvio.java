import java.lang.Math;

public class Desvio {
	double variancia;
	
	public Desvio(double variancia) {
		this.variancia = variancia;
	}
	
	public void getDesvio() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("O desvio padrão é: " + Math.sqrt(this.variancia));
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public double getVariancia() {
		return this.variancia;
	}	
}
