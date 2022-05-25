package cursojava.oo;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasse {
	public static void main(String[] args) {
		/*quando instânciado passa a existir na memória java
		 */
		
		/*new Aluno() é uma instância(criação de Objeto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		/*é obrigatório instânciar*/
		
		/*aula sobre entrada de dados*/
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		/*String idade = JOptionPane.showInputDialog("Qual é sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual é o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data de matrícula?");
		String serie = JOptionPane.showInputDialog("Qual é a série?");
		String escola = JOptionPane.showInputDialog("Qual é a escola?");*/
	
		
		/*por padrão os atributos de java são privados(private) tem que colocar public lá*/
	/*classe /variável /ch const. / do tipo de class*/
		/*set passa os dados*/
		
		Aluno aluno1 = new Aluno();/*aqui pode ser João*/

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
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina que deseja remover 1, 2, 3 ou 4 ? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
			
			
		}
		
		
		System.out.println(aluno1.toString());/*descrição do objeto na memória - tostring*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
			
       
		
	}

}
