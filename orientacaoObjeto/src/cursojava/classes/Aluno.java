package cursojava.classes;

public class Aluno {/*esta � a classe que representa aluno*/
	/*Caracteristicas gerais - atributos e tipos*/
	
	/*atributos do aluno*/
	public String nome;
	public int idade;
	public String dataNascimento;
	public String rg;
	String cpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	/*para ser objeto tem que ser usado em outro local no main por exemplo*/



	/*parte 2*/
	/*construtores(comportamentos - m�todos - a��es )*/
	
	public Aluno() {/*construtor padr�o java - cria os dados na mem�ria*/
		/*tamb�m se ele n�o for chamado o java ir� escrever por tr�s porque ele � padr�o*/
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
