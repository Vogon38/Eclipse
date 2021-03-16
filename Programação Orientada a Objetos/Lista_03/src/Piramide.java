
public class Piramide {
	double altura_triangulo, ab_triangulo;
	int tipo_tinta;
	
	public Piramide(double altura_triangulo, double ab_triangulo, int tipo_tinta) {
	}
	
	public static final int VOLUME_LATA = 18; //18 litros de tinta por lata
	public static final double METROS_LATA = 85.68; //cada litro pinta 4,76 m²
	
	public void getPiramideValor() {
		
		double preco_tipo, preco_total;
		double a1 = (this.altura_triangulo*this.altura_triangulo)+(this.ab_triangulo*this.ab_triangulo);
		double litros = a1/4.76;
		double latas = litros/VOLUME_LATA;
		double volume = 1/3*(this.ab_triangulo*this.altura_triangulo);
		
		if (this.tipo_tinta == 1) {
			preco_tipo = 127.90;	
		} else if (this.tipo_tinta == 2) {
			preco_tipo = 258.98;
		} else {
			preco_tipo = 344.34;
		}
		
		System.out.println("ab: " + this.ab_triangulo);
		System.out.println("h: " + this.altura_triangulo);
		System.out.println("a1: " + a1);
		System.out.println("área da base: " + (a1*a1));
		System.out.println("tipo de tinta: " + this.tipo_tinta);
		System.out.println("litros: " + litros);
		System.out.println("latas: " + Math.round(latas));
		System.out.println("preço: " + preco_tipo*latas);
		System.out.println("volume: " + volume);
	
		public void setPiramide() {
			
	}
		
		public double getPiramide() {
			
		}
		
	}
	
}