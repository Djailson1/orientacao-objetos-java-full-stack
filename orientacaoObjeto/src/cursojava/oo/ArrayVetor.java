package cursojava.oo;

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
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " Inscrito no curso : " + aluno.getNomeEscola());
		System.out.println(" --------- Discilinas do aluno ---------");
		
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Discilina : " + d.getDisciplina());
			System.out.println("As notas da disciplina são : " );
			
			for(int pos = 0; pos < d.getNota().length; pos++) {
			
				System.out.println("NOta " + pos + " é igual = " + d.getNota()[pos]);
			}
			
		}
		
	}

}
