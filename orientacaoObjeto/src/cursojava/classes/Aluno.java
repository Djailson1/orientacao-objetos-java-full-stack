package cursojava.classes;

import java.util.Objects;

public class Aluno {/*esta � a classe que representa aluno*/
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
	
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	
	
	
	
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
	
	/*M�todos GETTERS e SETTERS do Objeto*/
	/*Setter ele serve para receber os dados injetar os dados nos atributos
	 * getter � pra resgatar, obter, retornar o valor do atributo
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
	
	public double getMediaNota() {/*retorna m�dia do aluno*/
		
		return (disciplina.getNota1() + disciplina.getNota2()  + disciplina.getNota3() + disciplina.getNota4()) / 4;
		
	}
	
	/*m�todo que retorna true para aprovado false para reprovado - com reutiliza��o de m�todo */
	public boolean getAlunoAprovado() {
		
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	/*m�todo que retorna aprova��o em String direto*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return "O aluno est� Aprovado!";
		}else {
			return "O aluno est� Reprovado.";
		}
	}

	
	/*equals e hashcode*/
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	/*toString*/
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplina=" + disciplina
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}
	
	
	

}
