package cursojava.classes;

public class Aluno {/*esta é a classe que representa aluno*/
	/*Caracteristicas gerais - atributos e tipos*/
	
	/*atributos do aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	/*para ser objeto tem que ser usado em outro local no main por exemplo*/



	/*parte 2*/
	/*construtores(comportamentos - métodos - ações )*/
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

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
	
	/*Métodos GETTERS e SETTERS do Objeto*/
	/*Setter ele serve para receber os dados injetar os dados nos atributos
	 * getter é pra resgatar, obter, retornar o valor do atributo
	 * */
	
	public void setNome(String nome) {
		this.nome = nome;/*ao inves de usar o parametro e nome nomeAluno 
		usa-se o nome this em referencia ao atributo da classe*/
	}
	public String getNome() {
		return nome;/*retorna atributo*/
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public double getMediaNota() {/*retorna média do aluno*/
		
		return (nota1 + nota2 + nota3 + nota4) / 4;
		
	}
	
	/*método que retorna true para aprovado false para reprovado - com reutilização de método */
	public boolean getAlunoAprovado() {
		
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	/*método que retorna aprovação em String direto*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return "O aluno está Aprovado!";
		}else {
			return "O aluno está Reprovado.";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
	}
	
	
	

}
