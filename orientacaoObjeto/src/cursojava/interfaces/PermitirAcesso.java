package cursojava.interfaces;

/*Essa interface ser� nossso contrato de autentica��o*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
}
