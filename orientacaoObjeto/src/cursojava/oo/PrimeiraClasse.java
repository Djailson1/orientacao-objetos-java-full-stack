package cursojava.oo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasse {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		for(int qtd = 1; qtd <= 2; qtd++) {
			
			
		/*quando inst�nciado passa a existir na mem�ria java
		 */
		
		/*new Aluno() � uma inst�ncia(cria��o de Objeto)*/
		/*aluno1 � uma refer�ncia para o objeto aluno*/
		/*� obrigat�rio inst�nciar*/
		
		/*aula sobre entrada de dados*/
		String nome = JOptionPane.showInputDialog("Qual � o nome do aluno "+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual � sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual � o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual � o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data de matr�cula?");
		String serie = JOptionPane.showInputDialog("Qual � a s�rie?");
		String escola = JOptionPane.showInputDialog("Qual � a escola?");*/
	
		
		/*por padr�o os atributos de java s�o privados(private) tem que colocar public l�*/
	/*classe /vari�vel /ch const. / do tipo de class*/
		/*set passa os dados*/
		
		Aluno aluno1 = new Aluno();/*aqui pode ser Jo�o*/

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));/*convertendo string em int*/
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRg(rg);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
	
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if(escolha == 0) {/*Op��o SIM � ZERO*/
		
			int continuarRemover = 0;
		int posicao = 1;
		
 		while(continuarRemover == 0) {
 			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina que deseja remover 1, 2, 3 ou 4 ? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
			
			
 			}
		}
		alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("djailson")) {/*ignora os outros caso for igual a ...djailson*/
				
			alunos.remove(aluno);
			break;
			}else {
				System.out.println(aluno);/*descri��o do objeto na mem�ria*/
				System.out.println("M�dia do aluno = " + aluno.getMediaNota());		
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------");
			}
			
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas mat�rias s�o: ");
			
			for(Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println(disciplina.getDisciplina());
			
				
			}
		}
		
	}

}
