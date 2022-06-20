package cursojava.oo;

import java.util.Arrays;
import java.util.List;

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
		
	    /*convertendo um array em uma lista*/
	    
	    List<String> list = Arrays.asList(valoresArray);
	    
	    /*para varrer lista*/
	    
	    for (String valorString : list) {
			System.out.println(valorString);
		}
	    
	    /*converter uma lista para array*/
	    
	    String[] conversaoArray = list.toArray(new String[6]);
	    
	    for(int pos = 0; pos < conversaoArray.length; pos++) {
	    	
	    	System.out.println(conversaoArray[pos]);
	    }
	}

}
