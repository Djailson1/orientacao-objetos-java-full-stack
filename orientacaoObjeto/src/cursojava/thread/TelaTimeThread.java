package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() {/*execcuta o que estiver dentro no momento da abertura ou execu��o */
		
		setTitle("Minha tela de time com Thread");/*t�tulo*/
		setSize(new Dimension(240, 240));/*dimens�o*/
		setLocationRelativeTo(null);/*centralizar para o usu�rio*/
		setResizable(false);/*n�o deixa redimensionar a tela*/
		/*primeira parte concluida*/
		
		
		
		
		/*sempre ser� o �ltimo comando*/
		setVisible(true);/*torna a tela vis�vel para o usu�rio*/

	}

}
