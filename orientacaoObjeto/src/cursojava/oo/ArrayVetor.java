package cursojava.oo;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		
		
		String[] valores = {"Dj", "100", "Curso de Java", "contato@jdev.com"};
		
		for(int pos = 0; pos < valores.length; pos++ ) {
			
			System.out.println("Valores na posição " + pos + " é igual " + valores[pos]);
			
			
		}
		
		
	}

}
