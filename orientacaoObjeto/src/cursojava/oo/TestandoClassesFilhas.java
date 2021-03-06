package cursojava.oo;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Djailson Silva");
		aluno.setNomeEscola("Jdev Java Full Stack");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRg("jknw8787");
		diretor.setNome("Fuma?a");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Roubos");
		secretario.setCpf("86476387");
		secretario.setIdade(18);
		secretario.setNome("Aristosteles");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		System.out.println("Sal?rio = " + aluno.salario());
		System.out.println("Sal?rio = " + diretor.salario());
		System.out.println("Sal?rio = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
		public static void teste(Pessoa pessoa) {
			System.out.println("Essa pessoa ? demais = " + pessoa.getNome() +
					" e o sal?rio ? de " + pessoa.salario());
		}
}
