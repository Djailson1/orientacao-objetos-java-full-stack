package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*realmente e somente receber alguem que tenha o contrato da interface e PermitirAcesso e chmar o autenticar*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
