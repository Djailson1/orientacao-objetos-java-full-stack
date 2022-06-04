package cursojava.oo;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Djailson Silva");
		aluno.setNomeEscola("Jdev Java Full Stack");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRg("jknw8787");
		diretor.setNome("Fumaça");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Roubos");
		secretario.setCpf("86476387");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		
	}

}
