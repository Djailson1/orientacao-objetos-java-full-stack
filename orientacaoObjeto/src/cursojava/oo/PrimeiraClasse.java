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
		String idade = JOptionPane.showInputDialog("Qual é sua idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual é o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data de matrícula?");
		String serie = JOptionPane.showInputDialog("Qual é a série?");
		String escola = JOptionPane.showInputDialog("Qual é a escola?");
	
		
		Aluno aluno1 = new Aluno();/*aqui pode ser João*/
		/*por padrão os atributos de java são privados(private) tem que colocar public lá*/
	/*classe /variável /ch const. / do tipo de class*/
		aluno1.setNome(nome);
		/*set passa os dados*/
		aluno1.setIdade(Integer.valueOf(idade));/*convertendo string em int*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRg(rg);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		/**/
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);
		
		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina1);
		
		
		
		
		
		
	
		
		

		/*get retorna os dados - imprime*/
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Registro Geral = " + aluno1.getRg());
		System.out.println("Cpf = " + aluno1.getCpf());
		System.out.println("Nome do pai =  " + aluno1.getNomePai());
		System.out.println("Nome da mãe =  " + aluno1.getNomeMae());
		System.out.println("Número da matricula =  " + aluno1.getDataMatricula());
		System.out.println("Série matriculado =  " + aluno1.getSerieMatriculado());
		System.out.println("Nome da escola =  " + aluno1.getNomeEscola());
		
		/*chamando métodos e imprimindo na tela*/
		/*System.out.println("Média = " + aluno1.getMediaNota());/*chamando o metodo média para retornar os valores*/
		/*System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));/*atribuind o resultado true a aprovado com op.ternário*/
		/*System.out.println("Resultado = " + aluno1.getAlunoAprovado2());   /*imprimndo a aprovação em texto tipo string direto*/
		
		
		System.out.println(aluno1.toString());/*descrição do objeto na memória - tostring*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	
		
		System.out.println("=============================================================");
		
       
		/*Aluno aluno2 = new Aluno(); /*aqui Maria*/
		/*aluno2.setNome("Maria");
		aluno2.setIdade(48);
		aluno2.setDataNascimento("18/05/1987");
		aluno2.setRg("635656566");
		aluno2.setCpf("727.756.763-62");
		aluno2.setNomeMae("Josefina Fonseca");
		aluno2.setNomePai("Curtis Jackson");
		aluno2.setDataMatricula("12/02/2022");
		aluno2.setSerieMatriculado("7");
		aluno2.setNomeEscola("Escola JDev Java");*/
		
		/*System.out.println("Nome é = " + aluno2.getNome());
		/*get retorna os dados*/
		/*System.out.println("Idade = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		
		  /*=========================================================================*/
		
		/*Aluno aluno3 = new Aluno();/*aqui Djailson*/
		
		/*Aluno aluno4 = new Aluno("Bruno");/*parâmetro string foi passado no construtor*/
		
		/*Aluno aluno5 = new Aluno("Jennifer",24);/*2 parâmetros foram passados no contrutor na classe principal main*/

		/*Passou a ser objeto depois que foi instânciado 
		 (instância é como se fosse o tipo das variáveis no caso o tipo da classe)*/
	}

}
