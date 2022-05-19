package cursojava.classes;

public class Aluno {/*esta é a classe que representa aluno*/
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
	/*construtores(comportamentos - métodos - ações )*/
	
	public Aluno() {/*construtor padrão java - cria os dados na memória*/
		/*também se ele não for chamado o java irá escrever por trás porque ele é padrão*/
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
