package cursojava.oo;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		
		/*array pode ser de todos tipos de dados e objetos tamb�m*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o array deve ter?");
		
		
		/*array sempre deve ter quant. de posi��es definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + pos);
			notas[pos] = Double.valueOf(valor);
					
		}
		
		
		for(int pos = 0; pos < notas.length; pos++ ) {
			
			System.out.println("Nota = " + (pos + 1) + " � = " + notas[pos]);
			
			
		}
		
	}

}
