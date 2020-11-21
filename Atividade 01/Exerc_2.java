import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		float atual = 0, reajuste = 0, aumento = 0;
		String perc = "";
		
		System.out.println("-----------------------------------------------------------");
		System.out.print("Informe o salário: ");
		atual = entrada.nextFloat();
		
		if (atual <= 280) {
			perc = "20%";
			aumento = ((20 * atual)/100);
			reajuste = aumento + atual;
		}else{
			if (atual > 280 & atual <= 700) {
				perc = "15%";
				aumento = ((15 * atual)/100);
				reajuste = aumento + atual;
			}else {
				if (atual > 700 & atual <= 1500) {
					perc = "10%";
					aumento = ((10 * atual)/100);
					reajuste = aumento + atual;
				}else {
					if (atual > 1500) {
						perc = "5%";
						aumento = ((5 * atual)/100);
						reajuste = aumento + atual;
					}
				}
			}
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("O salário antes do reajuste era " + atual + " reais");
		System.out.println("O percentual de aumento aplicado foi " + perc);
		System.out.println("O valor do aumento é " + df.format(aumento) + " reais");
		System.out.println("O novo salário após o aumento é " + df.format(reajuste) + " reais");
		
	}
}