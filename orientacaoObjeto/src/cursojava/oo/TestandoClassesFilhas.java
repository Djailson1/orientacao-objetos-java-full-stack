package cursojava.oo;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Djailson Silva");
		aluno.setNomeEscola("Jdev Java Full Stack");
		
		Diretor diretor = new Diretor();
		diretor.setRg("jknw8787");
		diretor.setNome("Fumaça");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Roubos");
		secretario.setCpf("86476387");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		
	}

}
