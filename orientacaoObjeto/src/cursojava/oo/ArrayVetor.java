package cursojava.oo;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		double[] notas = {8.9, 6.7, 7.9, 9.0};
		double[] notasLogica = {9.9, 8.7, 9.9, 6.0};
		
		/*criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Djailson");
		aluno.setNomeEscola("Jdev treinamento");
		
		/*criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Log programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		/*criação do aluno*/
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Djailson");
		aluno2.setNomeEscola("Jdev treinamento");
		
		/*criação da disciplina*/
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java");
		disciplina3.setNota(notas);
		
		
		aluno.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Log programação");
		disciplina4.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina4);
		
		/*--------------------------------------------------------------------*/
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			for (Disciplina d :arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é : " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número: " + posnota + " é igual " + d.getNota()[posnota]);
					
				}
				
			}
		}
		
	}

}
