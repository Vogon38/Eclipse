import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exerc_1 {

	public static void main(String args[]) {
		
        String cpf = "";
        String d1, d2, d3, d4, d5, d6, d7, d8, d9, comparador ="";
	int n1, n2, n3, n4, n5, n6, n7, n8, n9, verifica1, verifica2, comparador1;
        
        cpf = JOptionPane.showInputDialog("Digite seu CPF neste formato (123.456.789-11): ");
          
        d1 = cpf.substring(0,1); n1 = Integer.parseInt(d1);
        d2 = cpf.substring(1,2); n2 = Integer.parseInt(d2);
        d3 = cpf.substring(2,3); n3 = Integer.parseInt(d3);
        d4 = cpf.substring(4,5); n4 = Integer.parseInt(d4);
        d5 = cpf.substring(5,6); n5 = Integer.parseInt(d5);
        d6 = cpf.substring(6,7); n6 = Integer.parseInt(d6);
        d7 = cpf.substring(8,9); n7 = Integer.parseInt(d7);
        d8 = cpf.substring(9,10); n8 = Integer.parseInt(d8);
        d9 = cpf.substring(10,11); n9 = Integer.parseInt(d9);
        
        verifica1 = n1 * 10 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2;
        if (verifica1 % 11 < 2) {
            verifica1 = 0;
        } else {
            verifica1 = 11 - verifica1 % 11;
        }
        
        verifica2 = n1 * 11 + n2 * 10 + n3 * 9 + n4 * 8 + n5 * 7 + n6 * 6 + n7 * 5 + n8 * 4 + n9 * 3 + verifica1 * 2;
        if (verifica2 % 11 < 2) {
            verifica2 = 0;
        } else {
            verifica2 = 11 - verifica2 % 11;
        }
        
        comparador = (d1 + d2 + d3 + "." + d4 + d5 + d6 + "." + d7 + d8 + d9 + "-" + verifica1 + "" + verifica2);
        comparador1 = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9);
        
        System.out.println(comparador);
        
        if (comparador1 == 0 | comparador1 == 9) {
        	JOptionPane.showMessageDialog(null, "CPF incorreto :(");
	    } else {
	    	if (comparador.equals(cpf)) {
	    		JOptionPane.showMessageDialog(null, "CPF correto :)");
	    } else {
	    	JOptionPane.showMessageDialog(null, "CPF incorreto :(");
		}
	    }
    }
}
