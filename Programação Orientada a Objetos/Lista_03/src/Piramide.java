import java.util.Scanner;

public class Piramide {
		
	public final int VOLUME_LATA = 18; //18 litros de tinta por lata
	
	double altura_triangulo, ab_triangulo, preco_tipo, preco_total;
	double a1, litros, latas, volume;
	int tipo_tinta;
	
	private void getCalculoPiramide() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a altura do triângulo: ");
		this.altura_triangulo = entrada.nextDouble();
			
		System.out.println("Informe a ab do triângulo: ");
		this.ab_triangulo = entrada.nextDouble();
			
		System.out.println("Informe o tipo de tinta (1, 2 ou 3): ");
		this.tipo_tinta = entrada.nextInt();
			
		this.a1 = (this.altura_triangulo*this.altura_triangulo)+(this.ab_triangulo*this.ab_triangulo);
		this.litros = a1/4.76;
		this.latas = this.litros/this.VOLUME_LATA;
		this.volume = 1/3*(this.ab_triangulo*this.altura_triangulo);
			
		if (this.tipo_tinta == 1) {
			this.preco_tipo = 127.90;	
		} else if (this.tipo_tinta == 2) {
			this.preco_tipo = 258.98;
		} else {
			this.preco_tipo = 344.34;
		}
			
		System.out.println("ab: " + this.ab_triangulo);
		System.out.println("h: " + this.altura_triangulo);
		System.out.println("a1: " + this.a1);
		System.out.println("área da base: " + (this.a1*this.a1));
		System.out.println("tipo de tinta: " + this.tipo_tinta);
		System.out.println("litros: " + this.litros);
		System.out.println("latas: " + Math.round(this.latas));
		System.out.println("preço: " + this.preco_tipo*this.latas);
		System.out.println("volume: " + this.volume);
		
	}

//	public double getAltura_triangulo() {
//		return altura_triangulo;
//	}
//
//	public void setAltura_triangulo(double altura_triangulo) {
//		this.altura_triangulo = altura_triangulo;
//	}
//
//	public double getAb_triangulo() {
//		return ab_triangulo;
//	}
//
//	public void setAb_triangulo(double ab_triangulo) {
//		this.ab_triangulo = ab_triangulo;
//	}
//
//	public double getPreco_tipo() {
//		return preco_tipo;
//	}
//
//	public void setPreco_tipo(double preco_tipo) {
//		this.preco_tipo = preco_tipo;
//	}
//
//	public double getPreco_total() {
//		return preco_total;
//	}
//
//	public void setPreco_total(double preco_total) {
//		this.preco_total = preco_total;
//	}
//
//	public double getA1() {
//		return a1;
//	}
//
//	public void setA1(double a1) {
//		this.a1 = a1;
//	}
//
//	public double getLitros() {
//		return litros;
//	}
//
//	public void setLitros(double litros) {
//		this.litros = litros;
//	}
//
//	public double getLatas() {
//		return latas;
//	}
//
//	public void setLatas(double latas) {
//		this.latas = latas;
//	}
//
//	public double getVolume() {
//		return volume;
//	}
//
//	public void setVolume(double volume) {
//		this.volume = volume;
//	}
//
//	public int getTipo_tinta() {
//		return tipo_tinta;
//	}
//
//	public void setTipo_tinta(int tipo_tinta) {
//		this.tipo_tinta = tipo_tinta;
//	}	
	
}
