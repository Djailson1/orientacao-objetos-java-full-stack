package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {/*execcuta o que estiver dentro no momento da abertura ou execução */
		
		setTitle("Minha tela de time com Thread");/*título*/
		setSize(new Dimension(240, 240));/*dimensão*/
		setLocationRelativeTo(null);/*centralizar para o usuário*/
		setResizable(false);/*não deixa redimensionar a tela*/
		/*primeira parte concluida*/
		
		
		
		
		/*sempre será o último comando*/
		setVisible(true);/*torna a tela visível para o usuário*/

	}

}
