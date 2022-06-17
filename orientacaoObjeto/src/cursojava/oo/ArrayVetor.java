package cursojava.oo;

public class ArrayVetor {
	public static void main(String[] args) {
		
		/*array pode ser de todos tipos de dados e objetos também*/
		
		/*array sempre deve ter quant. de posições definidas*/
		double[] notas = new double[5];
		
		/*atribuir valor as posições do array*/
		notas[0] = 9.0;
		notas[1] = 7.0;
		notas[2] = 8.0;
		notas[3] = 6.0;
		
		for(int pos = 0; pos < 5; pos++ ) {
			
			System.out.println("Nota = " + (pos + 1) + " é = " + notas[pos]);
			
			
		}
		
	}

}
