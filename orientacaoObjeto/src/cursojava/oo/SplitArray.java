package cursojava.oo;

public class SplitArray {
	public static void main(String[] args) {
		
		String texto  = "Dj, curso java, 80, 70, 90, 89";
		
	    String[] valoresArray = texto.split(",");/*split converte texto para array*/
	    
	    System.out.println("nome: " + valoresArray[0]);
	    System.out.println("curso: " + valoresArray[1]);
	    System.out.println("nota 1: " + valoresArray[2]);
	    System.out.println("nota 2: " + valoresArray[3]);
	    System.out.println("nota 3: " + valoresArray[4]);
	    System.out.println("nota 4: " + valoresArray[5]);
		
	}

}
