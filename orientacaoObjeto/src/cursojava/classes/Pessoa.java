package cursojava.classes;

/*Heran?a - classe pai, superclasse ou  classe master - (atributo comuns a todos objetos filhos)*/
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String rg;
	protected String cpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*m?todo abstrato ? que fica na classe pai ? obrigat?rio para as classes filhas*/
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	/*retornar true caso for maior que 18 se n?o false*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

}
