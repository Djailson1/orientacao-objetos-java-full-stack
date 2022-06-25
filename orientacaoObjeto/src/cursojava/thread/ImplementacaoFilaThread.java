package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			              new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
		
	}
	
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		while(iteracao.hasNext()) {/*enquanto conter dados na lista irá processar*/
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*pega o objeto atual*/
			
			/*processar 10 mil notas ficais*/
			/*gerar uma lista enorme de PDF*/
			/*gerar um envio em massa de e-mail*/
			
			iteracao.remove();
			
			/*minuto 17;29*/
		}
	}

}
