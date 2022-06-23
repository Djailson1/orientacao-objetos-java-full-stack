package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		/*Thread processando em paralelo do envio de e-mail*/
		new Thread() {
			public void run() {/*executa o que queremos */
				/*c�digo da rotina*/
				

				/*c�digo da rotina que quero executar em paralelo*/
				for(int pos = 0; pos < 10; pos ++) {
					
					/*Quero executar essae envio com tempo de parada ou com tempo determinado */
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*D� um tempo*/
					
				}
				/*fim do c�digo em paralelo*/
			};
			
		}.start();/*start liga a thread que fica processando paralelamente por tr�s*/
		
		//============================div das thread
		
		
		/*Thread processando em paralelo do envio de nota fiscal*/
		new Thread() {
			public void run() {/*executa o que queremos */
				/*c�digo da rotina*/
				

				/*c�digo da rotina que quero executar em paralelo*/
				for(int pos = 0; pos < 10; pos ++) {
					
					/*Quero executar essae envio com tempo de parada ou com tempo determinado */
					System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
					
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*D� um tempo*/
					
				}
				/*fim do c�digo em paralelo*/
			};
			
		}.start();/*start liga a thread que fica processando paralelamente por tr�s*/
		
		/*c�digo do sistema do usu�rio continua o fluxo de trabalho*/
		System.out.println("Chegou ao fim do c�digo de teste de thread");
		/*fluxo do sistema, cadastro de venda, emiss�o de nota fiscal, etc*/
		JOptionPane.showMessageDialog(null, "Sistema continua executado");
	}

}
