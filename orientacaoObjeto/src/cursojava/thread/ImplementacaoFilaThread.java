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
		
		System.out.println("fila rodando");
		
		while(true) {
		
		Iterator iteracao = pilha_fila.iterator();
		synchronized (pilha_fila) {/*bloquear o acesso a essa lista por outros processos*/
			
			while(iteracao.hasNext()) {/*enquanto conter dados na lista irá processar*/
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*pega o objeto atual*/
				
				/*processar 10 mil notas ficais*/
				/*gerar uma lista enorme de PDF*/
				/*gerar um envio em massa de e-mail*/
				
				System.out.println("-------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000);/*dar um tempo de descarga de memória*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		try {
			Thread.sleep(1000);/*processou toda a lista dar um tempo para limpeza de memória*/
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
	}

}
