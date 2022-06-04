package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {/* esta é a classe que representa aluno */
	/* Caracteristicas gerais - atributos e tipos */

	/* atributos do aluno */
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/* para ser objeto tem que ser usado em outro local no main por exemplo */

	/* parte 2 */
	/* construtores(comportamentos - métodos - ações ) */

	public Aluno() {/* construtor padrão java - cria os dados na memória */
		/*
		 * também se ele não for chamado o java irá escrever por trás porque ele é
		 * padrão
		 */
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* Métodos GETTERS e SETTERS do Objeto */
	/*
	 * Setter ele serve para receber os dados injetar os dados nos atributos getter
	 * é pra resgatar, obter, retornar o valor do atributo
	 */

	public void setNome(String nome) {
		this.nome = nome;/*
							 * ao inves de usar o parametro e nome nomeAluno usa-se o nome this em
							 * referencia ao atributo da classe
							 */
	}

	public String getNome() {
		return nome;/* retorna atributo */
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

	public double getMediaNota() {/* retorna média do aluno */
		
		double somaNotas = 0.0;
		

		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
        return somaNotas / disciplinas.size();//size retorna quantos objetos tem na lista.
	}

	/*
	 * método que retorna true para aprovado false para reprovado - com reutilização
	 * de método
	 */
	public boolean getAlunoAprovado() {

		double media = this.getMediaNota();

		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	/* método que retorna aprovação em String direto */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();

		if (media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}}else {
				return StatusAluno.REPROVADO;
			}
			
	}

	/* equals e hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	/* toString */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + "]";
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
