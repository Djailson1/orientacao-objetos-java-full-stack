package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaTimeThread extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Time da Thread 1");
	
	
	public TelaTimeThread() {/*execcuta o que estiver dentro no momento da abertura ou execu��o */
		
		setTitle("Minha tela de time com Thread");/*t�tulo*/
		setSize(new Dimension(240, 240));/*dimens�o*/
		setLocationRelativeTo(null);/*centralizar para o usu�rio*/
		setResizable(false);/*n�o deixa redimensionar a tela*/
		/*primeira parte concluida*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		add(jPanel, BorderLayout.WEST);
		/*sempre ser� o �ltimo comando*/
		setVisible(true);/*torna a tela vis�vel para o usu�rio*/

	}

}
